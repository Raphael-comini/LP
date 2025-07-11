package br.cefetmg.inf.lab20250623;

public class DequeCircular {
    private int[] dados;
    private int inicio;
    private int fim;
    private int tamanho;
    private int capacidade;

    public DequeCircular(int capacidadeInicial) {
        this.capacidade = capacidadeInicial;
        this.dados = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    public void inserirNoInicio(int valor) {
        if (tamanho == capacidade) {
            redimensionar();
        }

        inicio = (inicio - 1 + capacidade) % capacidade;
        dados[inicio] = valor;
        tamanho++;

        if (tamanho == 1) {
            fim = inicio;
        }
    }

    public void inserirNoFim(int valor) {
        if (tamanho == capacidade) {
            redimensionar();
        }

        fim = (fim + 1) % capacidade;
        dados[fim] = valor;
        tamanho++;

        if (tamanho == 1) {
            inicio = fim;
        }
    }

    public Integer removerPrimeiro() {
        if (estaVazia()) {
            return null;
        }

        int valor = dados[inicio];
        inicio = (inicio + 1) % capacidade;
        tamanho--;

        if (tamanho == 0) {
            inicio = 0;
            fim = -1;
        }

        return valor;
    }

    public Integer removerUltimo() {
        if (estaVazia()) {
            return null;
        }

        int valor = dados[fim];
        fim = (fim - 1 + capacidade) % capacidade;
        tamanho--;

        if (tamanho == 0) {
            inicio = 0;
            fim = -1;
        }

        return valor;
    }

    public Integer obterPrimeiro() {
        if (estaVazia()) {
            return null;
        }
        return dados[inicio];
    }

    public Integer obterUltimo() {
        if (estaVazia()) {
            return null;
        }
        return dados[fim];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    private void redimensionar() {
        int novaCapacidade = capacidade * 2;
        int[] novoArray = new int[novaCapacidade];

        for (int i = 0; i < tamanho; i++) {
            novoArray[i] = dados[(inicio + i) % capacidade];
        }

        dados = novoArray;
        capacidade = novaCapacidade;
        inicio = 0;
        fim = tamanho - 1;
    }
}
