package aplicacao.entidades;

import aplicacao.constantes.Bebida;
import aplicacao.constantes.IngredientesAdicionais;
import aplicacao.constantes.Proteina;
import aplicacao.constantes.Queijo;

import java.util.ArrayList;
import java.util.List;

public class CachorroQuente {

    Proteina proteinaSelecionada;
    Queijo queijoSelecionado;
    List<IngredientesAdicionais> ingredientesAdicionaisSelecionados;
    Bebida bebidaSelecionada;

    public CachorroQuente() {
        this.proteinaSelecionada = null;
        this.queijoSelecionado = null;
        this.ingredientesAdicionaisSelecionados = new ArrayList<>();
        this.bebidaSelecionada = null;
    }

    public void adicionarProteina(int seletorProteina) {
        switch (seletorProteina) {
            case 1:
                this.proteinaSelecionada = Proteina.SALSICHA;break;
            case 2:
                this.proteinaSelecionada = Proteina.LINGUICA;break;
            case 3:
                this.proteinaSelecionada = Proteina.FRANGO;break;
            case 4:
                this.proteinaSelecionada = Proteina.BACON;break;
            default:
                System.out.println("NÚMERO NÃO RECONHECIDO");
        }
    }

    public void adicionarQueijo(int seletorQueijo) {
        switch (seletorQueijo) {
            case 1:
                this.queijoSelecionado = Queijo.MUSSARELA;break;
            case 2:
                this.queijoSelecionado = Queijo.PRATO;break;
            case 3:
                this.queijoSelecionado = Queijo.PARMESAO;break;
            case 4:
                this.queijoSelecionado = Queijo.COALHO;break;
            default:
                System.out.println("NÚMERO NÃO RECONHECIDO");
        }
    }

    public void adicionarIngredientesAdicionais(int seletoringredientesAdicionais) {

        switch (seletoringredientesAdicionais){
            case 1:
                this.ingredientesAdicionaisSelecionados.add(IngredientesAdicionais.MAIONESE);break;
            case 2:
                this.ingredientesAdicionaisSelecionados.add(IngredientesAdicionais.KETCHUP);break;
            case 3:
                this.ingredientesAdicionaisSelecionados.add(IngredientesAdicionais.OVO);break;
            case 4:
                this.ingredientesAdicionaisSelecionados.add(IngredientesAdicionais.BATATAPALHA);break;
            default:
                System.out.println("NÚMERO NÃO RECONHECIDO");
        }

    }

    public void adicionarBebida(int seletorBebida) {
        switch (seletorBebida) {
            case 1:
                this.bebidaSelecionada = Bebida.COCACOLA;
                break;
            case 2:
                this.bebidaSelecionada = Bebida.DELRICO;
                break;
            case 3:
                this.bebidaSelecionada = Bebida.SUCODECHAVES;
                break;
            default:
                System.out.println("NÚMERO NÃO RECONHECIDO");
        }
    }

    @Override
    public String toString() {
        return "Proteina: " + proteinaSelecionada.getEscolhaProteina() +
                " / Queijo: " + queijoSelecionado.getEscolhaQuejo() +
                " / Ingredientes Adicionais: " + ingredientesAdicionaisSelecionados +
                " / Bebida: " + bebidaSelecionada.getEscolhaBebida();
    }
}
