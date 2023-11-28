package aplicacao.constantes;

public enum Queijo {

    MUSSARELA("Mussarela"),
    PRATO("Prato"),
    PARMESAO("Parmesão"),
    COALHO("Coalho");

    private String escolhaQuejo;

    Queijo(String escolhaQuejo) {
        this.escolhaQuejo = escolhaQuejo;
    }

    public String getEscolhaQuejo() {
        return escolhaQuejo;
    }

}
