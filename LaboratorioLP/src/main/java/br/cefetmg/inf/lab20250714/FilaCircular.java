package br.cefetmg.inf.lab20250714;

public class FilaCircular extends AbstractFila{
    private Object[] elementos;
    private int frente;
    private int tras;
    private int capacidadeInicial = 8;

    public FilaCircular() {
        elementos = new Object[capacidadeInicial];
        frente = 0;
        tras = 0;
    }    
    @Override
    public Object obterNoInicio(){
        if(estaVazia()){
            return null;
        }
        return elementos[frente];
    }
    @Override
    public Object desenfileirar() {
        if (estaVazia()) {
            return null;
        }

        Object elemento = elementos[frente];
        frente = (frente + 1) % elementos.length;
        tamanho--;
        return elemento;
    }
    @Override
    public void enfileirar(Object elemento) {
        if (tamanho == elementos.length) {
            redimensionar();
        }

        elementos[tras] = elemento;
        tras = (tras + 1) % elementos.length;
        tamanho++;
    }

    private void redimensionar() {
        int novaCapacidade = elementos.length * 2;
        Object[] novoArray = new Object[novaCapacidade];

        for (int i = 0; i < tamanho; i++) {
            novoArray[i] = elementos[(frente + i) % elementos.length];
        }

        elementos = novoArray;
        frente = 0;
        tras = tamanho;
    }
}
