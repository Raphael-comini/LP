package br.cefetmg.inf.lab20250623;

public interface Fila{
    void enfileirar(int item);
    Integer desenfileirar();
    Integer obterNoInicio();
    boolean estaVazia();
    int tamanho();
}