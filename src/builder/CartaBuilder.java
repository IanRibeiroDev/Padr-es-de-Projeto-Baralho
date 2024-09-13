package builder;

import baralho.TipoBaralho;
import carta.Carta;
import carta.Cor;

public interface CartaBuilder {
    private String face;
    private Cor cor;
    private int valor;

    public void setFace(String face);

    public CartaBuilder setNaipe(String naipe);

    public CartaBuilder setCor(Cor cor) {
        this.cor = cor;
        return this;
    }

    public CartaBuilder setValor(int valor) {
        this.valor = valor;
        return this;
    }

    public Carta make() {
        if (tipoBaralho == TipoBaralho.UNO) {
            return new carta.CartaUno(face, cor, valor);
        } else if (tipoBaralho == TipoBaralho.TRADICIONAL) {
            return new carta.CartaTradicional(face, naipe, valor, cor);
        } else {
            throw new IllegalStateException("Tipo de baralho não suportado.");
        }
    }
}
