package br.cefetmg.inf.lab20250721;

public class ListaArray{
    private Object[] elementos;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 10;

    public ListaArray() {
        this.elementos = new Object[CAPACIDADE_INICIAL];
        this.tamanho = 0;
    }

    private void garantirCapacidade() {
        if (tamanho >= elementos.length) {
            Object[] novoArray = new Object[elementos.length * 2];
            System.arraycopy(elementos, 0, novoArray, 0, elementos.length);
            elementos = novoArray;
        }
    }

    public void inserirInicio(Object item) {
        garantirCapacidade();
        for (int i = tamanho; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[0] = item;
        tamanho++;
    }

    public void inserirFim(Object item) {
        garantirCapacidade();
        elementos[tamanho] = item;
        tamanho++;
    }

    public boolean inserirPosicao(int posicao, Object item) {
        if (posicao < 0 || posicao > tamanho) {
            return false;
        }
        garantirCapacidade();
        for (int i = tamanho; i > posicao; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[posicao] = item;
        tamanho++;
        return true;
    }

    public Object removerInicio() {
        if (estaVazia()) return null;
        Object removido = elementos[0];
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[--tamanho] = null;
        return removido;
    }

    public Object removerFim() {
        if (estaVazia()) return null;
        Object removido = elementos[--tamanho];
        elementos[tamanho] = null;
        return removido;
    }

    public Object removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return null;
        Object removido = elementos[posicao];
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[--tamanho] = null;
        return removido;
    }

    public Object obterInicio() {
        return estaVazia() ? null : elementos[0];
    }

    public Object obterFim() {
        return estaVazia() ? null : elementos[tamanho - 1];
    }

    public Object obterPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return null;
        return elementos[posicao];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int pesquisar(Object item) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] != null && elementos[i] == item) {
                return i;
            }
        }
        return -1;
    }
    public int tamanho() {
        return tamanho;
    }
}

