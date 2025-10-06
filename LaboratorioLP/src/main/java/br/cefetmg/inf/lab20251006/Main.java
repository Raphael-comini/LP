package br.cefetmg.inf.lab20251006;

public class Main {
    public static void main(String[] args) {
        Dicionario<Aluno> dicionario = new Dicionario<>();
        Aluno aluno = new Aluno("b", 1234, "INF");
        String string = aluno.toString();
        //System.out.println(string);
        //Teste MatriculaInvalidaException
        dicionario.inserir(aluno);
        dicionario.inserir(aluno);
        //Teste remover
        Aluno aluno2 = new Aluno("c", 5678, "RDC");
        dicionario.inserir(aluno2);
        Aluno alunoRemovido = dicionario.remover(aluno);
        String stringRemovida = alunoRemovido.toString();
        System.out.println(stringRemovida);
        
    }
}
