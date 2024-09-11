package carta;

public class CartaUno extends Carta {
    public CartaUno(String face, Cor cor, int valor) {
        super(face, "", valor, cor); // Naipe não utilizado em Uno
    }

    @Override
    public String toString() {
        if(this.cor != Cor.SEM_COR) {
            return String.format("%6s", face) + " de " + cor.ansiCode() + cor.getValue() + " " + Cor.RESET.ansiCode() + ", valor " + valor;
        } else {
            return String.format("%6s", face) + Cor.RESET.ansiCode() + ", valor " + valor;
        }

    }
}