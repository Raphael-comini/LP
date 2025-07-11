package br.cefetmg.inf.lab20250616;

public class ListaArray implements Lista {
    private Integer[] elementos;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 10;

    public ListaArray() {
        this.elementos = new Integer[CAPACIDADE_INICIAL];
        this.tamanho = 0;
    }

    private void garantirCapacidade() {
        if (tamanho >= elementos.length) {
            Integer[] novoArray = new Integer[elementos.length * 2];
            System.arraycopy(elementos, 0, novoArray, 0, elementos.length);
            elementos = novoArray;
        }
    }

    @Override
    public void inserirInicio(int item) {
        garantirCapacidade();
        for (int i = tamanho; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[0] = item;
        tamanho++;
    }

    @Override
    public void inserirFim(int item) {
        garantirCapacidade();
        elementos[tamanho] = item;
        tamanho++;
    }

    @Override
    public boolean inserirPosicao(int posicao, int item) {
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

    @Override
    public Integer removerInicio() {
        if (estaVazia()) return null;
        Integer removido = elementos[0];
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[--tamanho] = null;
        return removido;
    }

    @Override
    public Integer removerFim() {
        if (estaVazia()) return null;
        Integer removido = elementos[--tamanho];
        elementos[tamanho] = null;
        return removido;
    }

    @Override
    public Integer removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return null;
        Integer removido = elementos[posicao];
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[--tamanho] = null;
        return removido;
    }

    @Override
    public Integer obterInicio() {
        return estaVazia() ? null : elementos[0];
    }

    @Override
    public Integer obterFim() {
        return estaVazia() ? null : elementos[tamanho - 1];
    }

    @Override
    public Integer obterPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return null;
        return elementos[posicao];
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public int pesquisar(int item) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] != null && elementos[i] == item) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }
}

