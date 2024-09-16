package carta;

public class  CartaTradicional extends Carta {
    private String naipe;

    public CartaTradicional(String face, String naipe, int valor, Cor cor) {
        super(face, valor, cor);
        this.setNaipe(naipe);
//        System.out.println(naipe);
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
