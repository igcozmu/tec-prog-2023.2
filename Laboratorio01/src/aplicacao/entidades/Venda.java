package aplicacao.entidades;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    // Atributos
    private Aluno alunoComprado;
    private List<CachorroQuente> cachorrosQuenteComprados;

    // Construtor
    public Venda() {
        this.alunoComprado = null;
        this.cachorrosQuenteComprados = new ArrayList<>();
    }

    // Metodos
    public void adicionarVenda(Aluno alunoComprado, CachorroQuente cachorroQuenteComprado){
        this.alunoComprado = alunoComprado;
        this.cachorrosQuenteComprados.add(cachorroQuenteComprado);
    }

    // Getters e Setters
    public Aluno getAlunoComprado() {
        return alunoComprado;
    }
    public void setAlunoComprado(Aluno alunoComprado) {
        this.alunoComprado = alunoComprado;
    }

    public List<CachorroQuente> getCachorrosQuenteComprados() {
        return cachorrosQuenteComprados;
    }
    public void setCachorrosQuenteComprados(List<CachorroQuente> cachorrosQuenteComprados) {
        this.cachorrosQuenteComprados = cachorrosQuenteComprados;
    }

    // Sobrescrita toString
    @Override
    public String toString() {
        return "VENDA (ALUNO: " + alunoComprado + " | CACHORRO QUENTE: " + cachorrosQuenteComprados;
    }
}
