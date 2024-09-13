package carta;

public class CartaUno extends Carta {
    public CartaUno(String face, Cor cor, int valor) {
        super(face, "", valor, cor); // Naipe não utilizado em Uno
    }

    @Override
    public String toString() {
        return String.format("%6s", face) + " " + cor.ansiCode() + cor.getValue() + Cor.RESET.ansiCode() + ", valor " + valor;
    }
}