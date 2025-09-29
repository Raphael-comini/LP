package br.cefetmg.inf.lab20250929;

public class DequeEncadeado<T> implements Deque<T> {

    private static class No<T> {
        T valor;
        No<T> anterior;
        No<T> proximo;

        No(T valor) {
            this.valor = valor;
        }
    }

    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public DequeEncadeado() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    @Override
    public void inserirNoInicio(T valor) {
        No<T> novoNo = new No<>(valor);
        if (estaVazia()) {
            inicio = fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
        tamanho++;
    }

    @Override
    public void inserirNoFim(T valor) {
        No<T> novoNo = new No<>(valor);
        if (estaVazia()) {
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        tamanho++;
    }

    @Override
    public T removerPrimeiro() {
        if (estaVazia()) throw new DequeVazioException();

        T valor = inicio.valor;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tamanho--;
        return valor;
    }

    @Override
    public T removerUltimo() {
        if (estaVazia()) throw new DequeVazioException();

        T valor = fim.valor;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tamanho--;
        return valor;
    }

    @Override
    public T obterPrimeiro() {
        if (estaVazia()) throw new DequeVazioException();
        return inicio.valor;
    }

    @Override
    public T obterUltimo() {
        if (estaVazia()) throw new DequeVazioException();
        return fim.valor;
    }

    @Override
    public boolean estaVazia() {
        return tamanho() == 0;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }
}