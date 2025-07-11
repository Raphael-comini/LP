package br.cefetmg.inf.lab20250623;

public class PilhaEncadeada implements Pilha {
    private static class No {
        int elemento;
        No proximo;

        No(int elemento, No proximo) {
            this.elemento = elemento;
            this.proximo = proximo;
        }
    }

    private No topo;
    private int tamanho;

    public PilhaEncadeada() {
        topo = null;
        tamanho = 0;
    }
    public void empilhar(int elemento) {
        topo = new No(elemento, topo);
        tamanho++;
    }
    public Integer desempilhar() {
        if (estaVazia()) {
            return null;
        }
        int elemento = topo.elemento;
        topo = topo.proximo; 
        tamanho--;
        return elemento;
    }
    public Integer obterNoTopo() {
        if (estaVazia()) {
            return null;
        }
        return topo.elemento;
    }
    public boolean estaVazia() {
        return topo == null;
    }
    public int tamanho() {
        return tamanho;
    }
}
