package exemploswing;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private int matricula;
    private String curso;
    private ArrayList<Aluno> alunoAL = new ArrayList<Aluno>();

    public void cadastrarAluno(int matricula, String nome, String curso) {
        Aluno objAluno = new Aluno();
        objAluno.setNome(nome);
        objAluno.setMatricula(matricula);
        objAluno.setCurso(curso);
        alunoAL.add(objAluno);
    }

    public Aluno localizarAluno(int matricula) {
        for (Aluno aluno : alunoAL) {
            if (matricula == aluno.getMatricula()) {
                System.out.println("Aluno encontrado");
                return aluno;
            }
        }
        System.out.println("Aluno NÃO encontrado...");
        return null; //caso a matricula nao seja encontrado    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
