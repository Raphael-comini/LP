package br.cefetmg.inf.lab20250901;

import java.util.Arrays;

public class ListaArray implements Lista {
    private Object[] dados;
    private int tamanho;

    public ListaArray() {
        this.dados = new Object[10];
        this.tamanho = 0;
    }

    private void garantirCapacidade() {
        if (tamanho == dados.length) {
            dados = Arrays.copyOf(dados, dados.length * 2);
        }
    }

    @Override
    public void inserirInicio(Object item) {
        garantirCapacidade();
        System.arraycopy(dados, 0, dados, 1, tamanho);
        dados[0] = item;
        tamanho++;
    }

    @Override
    public void inserirFim(Object item) {
        garantirCapacidade();
        dados[tamanho++] = item;
    }

    @Override
    public void inserirPosicao(int posicao, Object item) {
        if (posicao < 0 || posicao > tamanho) {
            throw new PosicaoInvalidaException();
        }
        garantirCapacidade();
        System.arraycopy(dados, posicao, dados, posicao + 1, tamanho - posicao);
        dados[posicao] = item;
        tamanho++;
    }

    @Override
    public Object removerInicio() {
        if (estaVazia()) throw new ListaVaziaException();
        Object removido = dados[0];
        System.arraycopy(dados, 1, dados, 0, tamanho - 1);
        tamanho--;
        return removido;
    }

    @Override
    public Object removerFim() {
        if (estaVazia()) throw new ListaVaziaException();
        Object removido = dados[--tamanho];
        dados[tamanho] = null;
        return removido;
    }

    @Override
public Object removerPosicao(int posicao) {
    if (estaVazia()) {
        throw new ListaVaziaException();
    }
    if (posicao < 0 || posicao >= tamanho) {
        throw new PosicaoInvalidaException();
    }
    Object removido = dados[posicao];
    System.arraycopy(dados, posicao + 1, dados, posicao, tamanho - posicao - 1);
    tamanho--;
    return removido;
}
    @Override
    public Object obterInicio() {
        if (estaVazia()) throw new ListaVaziaException();
        return dados[0];
    }

    @Override
    public Object obterFim() {
        if (estaVazia()) throw new ListaVaziaException();
        return dados[tamanho - 1];
    }

    @Override
public Object obterPosicao(int posicao) {
    if (estaVazia()) {
        throw new ListaVaziaException();
    }
    if (posicao < 0 || posicao >= tamanho) {
        throw new PosicaoInvalidaException();
    }
    return dados[posicao];
}

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public int pesquisar(Object item) {
        for (int i = 0; i < tamanho; i++) {
            if (dados[i].equals(item)) return i;
        }
        return -1;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }
}
