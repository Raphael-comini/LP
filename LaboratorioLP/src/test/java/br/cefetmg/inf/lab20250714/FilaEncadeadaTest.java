package br.cefetmg.inf.lab20250714;

public class FilaEncadeadaTest extends FilaTest{
    @Override
    public Fila getInstance(){
        return new FilaEncadeada();
    }
}
