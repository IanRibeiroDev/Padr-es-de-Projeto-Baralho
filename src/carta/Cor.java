package carta;

public enum Cor {
    VERMELHO("\u001B[31m", "vermelho"),
    PRETO("\u001B[30m", "preto"),
    RESET("\u001B[0m", "reset"),
    AZUL("\u001B[34m", "azul"),
    AMARELO("\u001B[33m", "amarelo"),
    VERDE("\u001B[32m", "verde"),
    MULTICOR("\u001B[35m", "multicor");

    private final String ansiCode;
    private final String value;

    Cor(String ansiCode, String value) {
        this.ansiCode = ansiCode;
        this.value = value;
    }

    public String ansiCode() {
        return this.ansiCode;
    }

    public String getValue() {
        return this.value;
    }
}
