package aplicacao.dados;

import aplicacao.entidades.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BaseDadosAluno {

    List<Aluno> baseAlunosCadastrados;

    public BaseDadosAluno() {
        this.baseAlunosCadastrados = new ArrayList<>();

        Aluno aluno1 = new Aluno("Jose", 496969);
        Aluno aluno2 = new Aluno("Jose", 546238);
        Aluno aluno3 = new Aluno("Jose", 559963);
        Aluno aluno4 = new Aluno("Jose", 512354);
        Aluno aluno5 = new Aluno("Jose", 483254);

        baseAlunosCadastrados.add(aluno1);
        baseAlunosCadastrados.add(aluno2);
        baseAlunosCadastrados.add(aluno3);
        baseAlunosCadastrados.add(aluno4);
        baseAlunosCadastrados.add(aluno5);

    }

    // Metodos
    public Aluno verificaAluno(String nomeAluno, int matriculaAluno) {
        for (int i = 0; i < baseAlunosCadastrados.size(); i++) {
            if (Objects.equals(baseAlunosCadastrados.get(i).getNomeAluno(), nomeAluno) &&
                baseAlunosCadastrados.get(i).getMatriculaAluno() == matriculaAluno) {
                return baseAlunosCadastrados.get(i);
            }
        }
        return null;
    }

    // Getters e Setters
    public List<Aluno> getBaseAlunosCadastrados() {
        return baseAlunosCadastrados;
    }
    public void setBaseAlunosCadastrados(List<Aluno> baseAlunosCadastrados) {
        this.baseAlunosCadastrados = baseAlunosCadastrados;
    }
}
