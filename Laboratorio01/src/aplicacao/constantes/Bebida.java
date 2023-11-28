package aplicacao.constantes;

public enum Bebida {

    COCACOLA("Coco-Cola"),
    DELRICO("Del Rico"),
    SUCODECHAVES("Suco de Chaves");

    private String escolhaBebida;

    Bebida(String escolhaBebida) {
        this.escolhaBebida = escolhaBebida;
    }

    public String getEscolhaBebida() {
        return escolhaBebida;
    }


}
