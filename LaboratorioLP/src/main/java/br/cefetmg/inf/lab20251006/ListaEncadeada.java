package br.cefetmg.inf.lab20251006;

public class ListaEncadeada<T>{

    private class No {
        T dado;
        No proximo;

        No(T dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    private No inicio;
    private No fim;
    private int tamanho;

    public ListaEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserirInicio(T item) {
        No novo = new No(item);
        if (estaVazia()) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio = novo;
        }
        tamanho++;
    }

    public void inserirFim(T item) {
        No novo = new No(item);
        if (estaVazia()) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
        tamanho++;
    }

    public void inserirPosicao(int posicao, T item) {
        if (posicao < 0 || posicao > tamanho) {
            throw new PosicaoInvalidaException();
        }
        if (posicao == 0) {
            inserirInicio(item);
        } else if (posicao == tamanho) {
            inserirFim(item);
        } else {
            No novo = new No(item);
            No atual = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }
            novo.proximo = atual.proximo;
            atual.proximo = novo;
            tamanho++;
        }
    }

    public T removerInicio() {
        if (estaVazia()) throw new ListaVaziaException();
        T dado = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null) fim = null;
        tamanho--;
        return dado;
    }

    public T removerFim() {
        if (estaVazia()) throw new ListaVaziaException();
        if (tamanho == 1) {
            return removerInicio();
        }
        No atual = inicio;
        while (atual.proximo != fim) {
            atual = atual.proximo;
        }
        T dado = fim.dado;
        fim = atual;
        fim.proximo = null;
        tamanho--;
        return dado;
    }

    public T removerPosicao(int posicao) {
        if (estaVazia()) {
            throw new ListaVaziaException();
        }
        if (posicao < 0 || posicao >= tamanho) {
            throw new PosicaoInvalidaException();
        }
        if (posicao == 0) return removerInicio();
        if (posicao == tamanho - 1) return removerFim();

        No atual = inicio;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.proximo;
        }
        T dado = atual.proximo.dado;
        atual.proximo = atual.proximo.proximo;
        tamanho--;
        return dado;
    }

    public T obterInicio() {
        if (estaVazia()) throw new ListaVaziaException();
        return inicio.dado;
    }

    public T obterFim() {
        if (estaVazia()) throw new ListaVaziaException();
        return fim.dado;
    }

    public T obterPosicao(int posicao) {
        if (estaVazia()) {
            throw new ListaVaziaException();
        }
        if (posicao < 0 || posicao >= tamanho) {
            throw new PosicaoInvalidaException();
        }
        No atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        return atual.dado;
    }

    public boolean estaVazia() {
        return tamanho() == 0;
    }

    public int pesquisar(T item) {
        No atual = inicio;
        int index = 0;
        while (atual != null) {
            if (atual.dado.equals(item)) return index;
            atual = atual.proximo;
            index++;
        }
        return -1;
    }

    public int tamanho() {
        return tamanho;
    }
}
