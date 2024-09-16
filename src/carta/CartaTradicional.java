package carta;

public class  CartaTradicional extends Carta {
    private String naipe;

    public CartaTradicional() {}

    public String getNaipe() {
        return this.naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        String corTexto = (cor != null) ? cor.ansiCode() + cor.getValue() + Cor.RESET.ansiCode() : "";
        String naipeTexto = (this.naipe != null && !this.naipe.isEmpty()) ? " de " + naipe : "";
        return String.format("%6s", face) + (corTexto.isEmpty() ? "" : " " + corTexto) + naipeTexto + ", valor " + valor;
    }
}
