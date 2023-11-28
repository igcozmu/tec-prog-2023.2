package aplicacao.constantes;

public enum IngredientesAdicionais {

    MAIONESE("Maionese"),
    KETCHUP("Ketchup"),
    OVO("Ovo"),
    BATATAPALHA("Batata Palha");

    private String inrgredientesAdicionais;

    IngredientesAdicionais(String inrgredientesAdicionais) {
        this.inrgredientesAdicionais = inrgredientesAdicionais;
    }

    public String getInrgredientesAdicionais() {
        return inrgredientesAdicionais;
    }

}
