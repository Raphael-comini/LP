package br.cefetmg.inf.lab20250901;

public class ListaEncadeada implements Lista {

    private class No {
        Object dado;
        No proximo;

        No(Object dado) {
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

    @Override
    public void inserirInicio(Object item) {
        No novo = new No(item);
        if (estaVazia()) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio = novo;
        }
        tamanho++;
    }

    @Override
    public void inserirFim(Object item) {
        No novo = new No(item);
        if (estaVazia()) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
        tamanho++;
    }

    @Override
    public void inserirPosicao(int posicao, Object item) {
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

    @Override
    public Object removerInicio() {
        if (estaVazia()) throw new ListaVaziaException();
        Object dado = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null) fim = null;
        tamanho--;
        return dado;
    }

    @Override
    public Object removerFim() {
        if (estaVazia()) throw new ListaVaziaException();
        if (tamanho == 1) {
            return removerInicio();
        }
        No atual = inicio;
        while (atual.proximo != fim) {
            atual = atual.proximo;
        }
        Object dado = fim.dado;
        fim = atual;
        fim.proximo = null;
        tamanho--;
        return dado;
    }
@Override
public Object removerPosicao(int posicao) {
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
    Object dado = atual.proximo.dado;
    atual.proximo = atual.proximo.proximo;
    tamanho--;
    return dado;
}


    @Override
    public Object obterInicio() {
        if (estaVazia()) throw new ListaVaziaException();
        return inicio.dado;
    }

    @Override
    public Object obterFim() {
        if (estaVazia()) throw new ListaVaziaException();
        return fim.dado;
    }

   @Override
public Object obterPosicao(int posicao) {
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

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public int pesquisar(Object item) {
        No atual = inicio;
        int index = 0;
        while (atual != null) {
            if (atual.dado.equals(item)) return index;
            atual = atual.proximo;
            index++;
        }
        return -1;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }
}
