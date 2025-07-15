package br.cefetmg.inf.lab20250714;

public interface Fila{
    void enfileirar(Object item);
    Object desenfileirar();
    Object obterNoInicio();
    boolean estaVazia();
    int tamanho();
}
