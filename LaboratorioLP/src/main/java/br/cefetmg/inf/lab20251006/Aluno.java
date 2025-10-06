package br.cefetmg.inf.lab20251006;

public class Aluno {
    private final String nome;
    private final long matricula;
    private final String curso;
    public Aluno(String nome, long matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    public String getNome(){
        return nome;
    }
    public long getMatricula(){
        return matricula;
    }
    public String getCurso(){
        return curso;
    }
    @Override
    public String toString(){
        return "Aluno = { "+nome+", "+matricula+", "+curso+"}";
    }
   
    @Override
    public boolean equals(Object obj){
        Aluno aluno=(Aluno)obj;
        return matricula == aluno.matricula;
    }
}
