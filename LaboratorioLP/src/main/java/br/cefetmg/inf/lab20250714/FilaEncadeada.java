package br.cefetmg.inf.lab20250714;

public class FilaEncadeada extends AbstractFila{
    private class No {
        Object dado;
        No proximo;
        No(Object dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }
    private No inicio;
    private No fim;
    public FilaEncadeada() {
        inicio = null;
        fim = null;
    }
    @Override
    public void enfileirar(Object dado) {
        No novo = new No(dado);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
        tamanho++;
    }
    @Override
    public Object desenfileirar() {
        if(estaVazia()){
            return null;
        }
        Object valor = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        tamanho --;
        return valor;
    }
    @Override
    public Object obterNoInicio(){
       if(estaVazia())
       {
           return null;
       }
       return inicio.dado;
    }
}

