package br.cefetmg.inf.lab20250616;

public class FilaEncadeada implements Fila{
    private class No {
        int dado;
        No proximo;
        No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }
    private No inicio;
    private No fim;
    private int contador;
    public FilaEncadeada() {
        inicio = null;
        fim = null;
        contador = 0;
    }
    public void enfileirar(int dado) {
        No novo = new No(dado);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
        contador++;
    }
    public Integer desenfileirar() {
        if(estaVazia()){
            return null;
        }
        int valor = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        contador --;
        return valor;
    }
    public int tamanho() {
        return contador;
    }
    public boolean estaVazia() {
        return tamanho() == 0;
    }
}


