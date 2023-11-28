package aplicacao.constantes;

public enum Proteina {

    SALSICHA("Salsicha"),
    LINGUICA("Linguiça"),
    FRANGO("Frango"),
    BACON("Bacon");

    private String escolhaProteina;

    Proteina(String escolhaProteina) {
        this.escolhaProteina = escolhaProteina;
    }

    public String getEscolhaProteina() {
        return escolhaProteina;
    }

}
