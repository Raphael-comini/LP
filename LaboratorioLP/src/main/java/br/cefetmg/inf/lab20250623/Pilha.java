package br.cefetmg.inf.lab20250623;

public interface Pilha {
    public void empilhar(int item);
    public Integer desempilhar();
    public Integer obterNoTopo();
    public boolean estaVazia();
    public int tamanho();
}
