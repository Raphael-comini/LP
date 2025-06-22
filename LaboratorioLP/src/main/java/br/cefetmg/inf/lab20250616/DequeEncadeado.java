package br.cefetmg.inf.lab20250616;

public class DequeEncadeado implements Deque {

    private static class No {
        int valor;
        No anterior;
        No proximo;

        No(int valor) {
            this.valor = valor;
        }
    }

    private No inicio;
    private No fim;
    private int tamanho; 

    public DequeEncadeado() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void inserirNoInicio(int valor) {
        No novoNo = new No(valor);
        if (estaVazia()) {
            inicio = fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
        tamanho++; 
    }

    public void inserirNoFim(int valor) {
        No novoNo = new No(valor);
        if (estaVazia()) {
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        tamanho++; 
    }

    public Integer removerPrimeiro() {
        if (estaVazia()) return null;

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

    public Integer removerUltimo() {
        if (estaVazia()) return null;

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

    public Integer obterPrimeiro() {
        if (estaVazia()) return null;
        return inicio.valor;
    }

    public Integer obterUltimo() {
        if (estaVazia()) return null;
        return fim.valor;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public int tamanho() {
        return tamanho;
    }
}
