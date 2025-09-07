package br.cefetmg.inf.lab20250901;

public interface Lista {
    public void inserirInicio(Object item);
    public void inserirFim(Object item);
    public void inserirPosicao(int posicao, Object item);
    public Object removerInicio();
    public Object removerFim();
    public Object removerPosicao(int posicao);
    public Object obterInicio();
    public Object obterFim();
    public Object obterPosicao(int posicao);
    public boolean estaVazia();
    public int pesquisar(Object item);
    public int tamanho();
}