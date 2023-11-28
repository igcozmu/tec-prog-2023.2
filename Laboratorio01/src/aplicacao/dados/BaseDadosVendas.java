package aplicacao.dados;

import aplicacao.entidades.Aluno;
import aplicacao.entidades.Venda;

import java.util.ArrayList;
import java.util.List;

public class BaseDadosVendas {

    List<Venda> baseVendasRealizadas;

    public BaseDadosVendas() {
        this.baseVendasRealizadas = new ArrayList<>();
    }

    // Metodos
    public Venda verificaAlunoDentroBaseDadosVenda(Aluno aluno) {
        for (int i = 0; i < this.baseVendasRealizadas.size(); i++) {
            if (this.baseVendasRealizadas.get(i).getAlunoComprado() == aluno) {
                return baseVendasRealizadas.get(i);
            }
        }
        return null;
    }

    // Getters e Setters
    public List<Venda> getBaseVendasRealizadas() {
        return baseVendasRealizadas;
    }
    public void setBaseVendasRealizadas(List<Venda> baseVendasRealizadas) {
        this.baseVendasRealizadas = baseVendasRealizadas;
    }

    // toString
    @Override
    public String toString() {
        return "TOTAL DE VENDAS: " +
                "\n" + baseVendasRealizadas;
    }
}
