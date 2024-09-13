package carta;

public class CartaTradicional extends Carta {
    private String naipe;

    public CartaTradicional(String face, String naipe, int valor, Cor cor) {
        super(face, valor, cor);
        this.naipe = naipe;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public String toString() {
        String corTexto = (cor != null) ? cor.ansiCode() + cor.getValue() + Cor.RESET.ansiCode() : "";
        return String.format("%6s", face) + (corTexto.isEmpty() ? "" : " " + corTexto) + (naipe.isEmpty() ? "" : " de " + naipe) + ", valor " + valor;
    }
}