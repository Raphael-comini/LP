package br.cefetmg.inf.lab20251006;

public class Dicionario<T> {

    private ListaEncadeada<T> elementos;

    public Dicionario() {
        elementos = new ListaEncadeada<>();
    }

    public void inserir(T item) {
        for (int i = 0; i < elementos.tamanho(); i++) {
            if (elementos.obterPosicao(i).equals(item)) {
                throw new MatriculaInvalidaException();
            }
        }
        elementos.inserirFim(item);
    }

    public T remover(T item) {

        if (elementos.estaVazia()) {
            throw new DicionarioVazioException();
        }
        for (int i = 0; i < elementos.tamanho(); i++) {
            if (elementos.obterPosicao(i).equals(item)) {
                return elementos.removerPosicao(i);
            }
        }
        throw new MatriculaInvalidaException();
    }

    public T obter(T item) {
        if (elementos.estaVazia()) {
            throw new DicionarioVazioException();
        }
        for (int i = 0; i < elementos.tamanho(); i++) {
            if (elementos.obterPosicao(i).equals(item)) {
                return elementos.obterPosicao(i);
            }
        }
        throw new MatriculaInvalidaException();
    }
}
