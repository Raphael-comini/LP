package br.cefetmg.inf.lab20250616;

public class ListaEncadeada implements Lista{

    private static class No {

        private int valor;
        private No proximo;

        public No(int valor) {
            this.valor = valor;
        }
    }

    private No inicio;
    private int tamanho;

    public ListaEncadeada() {
        this.inicio = null;
        this.tamanho = 0;
    }
    @Override
    public void inserirInicio(int item) {
        No novo = new No(item);
        novo.proximo = inicio;
        inicio = novo;
        tamanho++;
    }
    @Override
    public void inserirFim(int item) {
        No novo = new No(item);
        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        tamanho++;
    }
    @Override
    public boolean inserirPosicao(int posicao, int item) {
        if (posicao < 0 || posicao > tamanho) {
            return false;
        }

        if (posicao == 0) {
            inserirInicio(item);
            return true;
        }

        No novo = new No(item);
        No atual = inicio;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.proximo;
        }
        novo.proximo = atual.proximo;
        atual.proximo = novo;
        tamanho++;
        return true;
    }
    @Override
    public Integer removerInicio() {
        if (inicio == null) {
            return null;
        }
        int valor = inicio.valor;
        inicio = inicio.proximo;
        tamanho--;
        return valor;
    }
    @Override
    public Integer removerFim() {
        if (inicio == null) {
            return null;
        }
        if (inicio.proximo == null) {
            int valor = inicio.valor;
            inicio = null;
            tamanho--;
            return valor;
        }

        No atual = inicio;
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }

        int valor = atual.proximo.valor;
        atual.proximo = null;
        tamanho--;
        return valor;
    }
    @Override
    public Integer removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            return null;
        }

        if (posicao == 0) {
            return removerInicio();
        }

        No atual = inicio;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.proximo;
        }

        int valor = atual.proximo.valor;
        atual.proximo = atual.proximo.proximo;
        tamanho--;
        return valor;
    }
    @Override
    public Integer obterInicio() {
        return (inicio == null) ? null : inicio.valor;
    }
    @Override
    public Integer obterFim() {
        if (inicio == null) {
            return null;
        }
        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        return atual.valor;
    }
    @Override
    public Integer obterPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            return null;
        }

        No atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        return atual.valor;
    }
    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }
    @Override
    public int pesquisar(int item) {
        No atual = inicio;
        int pos = 0;

        while (atual != null) {
            if (atual.valor == item) {
                return pos;
            }
            atual = atual.proximo;
            pos++;
        }
        return -1;
    }
    @Override
    public int tamanho() {
        return tamanho;
    }
}
