package carta;

public class CartaUno extends Carta {
    public CartaUno(String face, Cor cor, int valor) {
        super(face, "", valor, cor);
    }

    @Override
    public String toString() {
        String corTexto = (cor != null) ? cor.ansiCode() + cor.getValue() + Cor.RESET.ansiCode() : "Sem cor";
        return String.format("%6s", face) + " " + corTexto + ", valor " + valor;
    }
}
