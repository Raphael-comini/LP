package br.cefetmg.inf.lab20250714;

public class FilaCircularTest extends FilaTest{
    @Override
    public Fila getInstance(){
        return new FilaCircular();
    }
}
