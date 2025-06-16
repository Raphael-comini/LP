package br.cefetmg.inf.lab20250609;

public class ListaDuplamenteEncadeada {

    private static class No {
        private int valor;
        private No anterior;
        private No proximo;

        public No(int valor) {
            this.valor = valor;
        }
    }

    private No inicio;
    private No fim;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserirInicio(int item) {
        No novo = new No(item);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tamanho++;
    }

    public void inserirFim(int item) {
        No novo = new No(item);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tamanho++;
    }

    public boolean inserirPosicao(int posicao, int item) {
        if (posicao < 0 || posicao > tamanho)
            return false;

        if (posicao == 0) {
            inserirInicio(item);
            return true;
        }

        if (posicao == tamanho) {
            inserirFim(item);
            return true;
        }

        No novo = new No(item);
        No atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }

        novo.anterior = atual.anterior;
        novo.proximo = atual;
        atual.anterior.proximo = novo;
        atual.anterior = novo;
        tamanho++;
        return true;
    }

    public Integer removerInicio() {
        if (inicio == null) return null;

        int valor = inicio.valor;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tamanho--;
        return valor;
    }

    public Integer removerFim() {
        if (fim == null) return null;

        int valor = fim.valor;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tamanho--;
        return valor;
    }

    public Integer removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho)
            return null;

        if (posicao == 0) return removerInicio();
        if (posicao == tamanho - 1) return removerFim();

        No atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }

        int valor = atual.valor;
        atual.anterior.proximo = atual.proximo;
        atual.proximo.anterior = atual.anterior;
        tamanho--;
        return valor;
    }

    public Integer obterInicio() {
        return (inicio == null) ? null : inicio.valor;
    }

    public Integer obterFim() {
        return (fim == null) ? null : fim.valor;
    }

    public Integer obterPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho)
            return null;

        No atual;
        if (posicao < tamanho / 2) {
            atual = inicio;
            for (int i = 0; i < posicao; i++) {
                atual = atual.proximo;
            }
        } else {
            atual = fim;
            for (int i = tamanho - 1; i > posicao; i--) {
                atual = atual.anterior;
            }
        }

        return atual.valor;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int pesquisar(int item) {
        No atual = inicio;
        int pos = 0;

        while (atual != null) {
            if (atual.valor == item) return pos;
            atual = atual.proximo;
            pos++;
        }

        return -1;
    }

    public int tamanho() {
        return tamanho;
    }
}

