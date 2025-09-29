package br.cefetmg.inf.lab20250929;

public interface Deque<T> {
    void inserirNoInicio(T valor);
    void inserirNoFim(T valor);
    T removerPrimeiro();
    T removerUltimo();
    T obterPrimeiro();
    T obterUltimo();
    boolean estaVazia();
    int tamanho();
}
