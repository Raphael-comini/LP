package br.cefetmg.inf.lab20250616;
    
public class PilhaArray implements Pilha{
    private static final int CAPACIDADE_INICIAL= 10;
    private int[] elementos;
    private int tamanho;
    public PilhaArray() {
        elementos = new int[CAPACIDADE_INICIAL  ];
        tamanho = 0;
    }
    private void garantirCapacidade() {
        if (tamanho >= elementos.length) {
            int[] novoArray = new int[elementos.length * 2];
            System.arraycopy(elementos, 0, novoArray, 0, tamanho);
            elementos = novoArray;
        }
    }
    public void empilhar(int item) {
        garantirCapacidade();
        elementos[tamanho] = item;
        tamanho = tamanho + 1;
    }
    public Integer desempilhar() {
        if (estaVazia()) {
            return null;
        }
        tamanho = tamanho - 1;
        return elementos[tamanho];
    }
    public Integer obterNoTopo() {
        if (estaVazia()) {
            return null;
        }
        return elementos[tamanho - 1];
    }
    public boolean estaVazia() {
        return tamanho == 0;
    }
    public int tamanho() {
        return tamanho;
    }

}
