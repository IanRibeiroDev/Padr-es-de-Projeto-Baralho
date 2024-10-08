package carta;

public class CartaUno extends Carta {
    public CartaUno() {}

    @Override
    public String toString() {
        String corTexto = (cor != null) ? String.format("%s%s%s", cor.ansiCode(), cor.getValue(), Cor.RESET.ansiCode()) : "Sem cor";
        String faceTexto = String.format("%6s", face);
        return String.format("%s %s, valor %d", faceTexto, corTexto, valor);
    }
}
