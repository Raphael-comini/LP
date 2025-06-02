package br.cefetmg.inf.lab20250602;

public class FilaArray {
    int topo = 0;
    int[] itens = new int [10];
    private void aumentarFila(){
        int[] newItens = new int[itens.length + 10];
        for(int i = 0; i < topo; i++){
            newItens[i] = itens[i];
        }
        itens = newItens;
    }
    void enfileirar(int item){
        if(topo == itens.length)
        {
            aumentarFila();
        }
        itens[topo]= item;
        topo ++;
    }
    int desenfileirar(){
        int[] temp = new int[itens.length];
        temp = itens;
        for(int i = topo; i > 0; i--){
            itens[i-1]=temp[i];
        }
        topo --;
        return temp[0];
    }
    boolean estaVazia(){
        return topo==0;
    }
    int tamanho(){
        return topo;
    }
}