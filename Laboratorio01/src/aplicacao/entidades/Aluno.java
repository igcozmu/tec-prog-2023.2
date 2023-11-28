package aplicacao.entidades;

import java.util.Objects;

public class Aluno {

    private String nomeAluno;
    private Integer matriculaAluno;

    public Aluno(String nomeAluno, Integer matriculaAluno) {
        this.nomeAluno = nomeAluno;
        this.matriculaAluno = matriculaAluno;
    }

    // Metodos


    // Getters e Setters
    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Integer getMatriculaAluno() {
        return matriculaAluno;
    }
    public void setMatriculaAluno(Integer matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nomeAluno, aluno.nomeAluno) && Objects.equals(matriculaAluno, aluno.matriculaAluno);
    }

    // toString
    @Override
    public String toString() {
        return "Nome: " + nomeAluno + ", Matricula: " + matriculaAluno;
    }

}
