package builder;

import baralho.TipoBaralho;
import carta.Carta;
import carta.Cor;

public class CartaBuilder {
    private String face = "";
    private String naipe = "";
    private Cor cor = null;
    private int valor = 0;
    private TipoBaralho tipoBaralho;

    // Define o tipo de baralho
    public CartaBuilder setTipoBaralho(TipoBaralho tipoBaralho) {
        this.tipoBaralho = tipoBaralho;
        return this;
    }

    public CartaBuilder setFace(String face) {
        this.face = face;
        return this;
    }

    public CartaBuilder setNaipe(String naipe) {
        this.naipe = naipe;
        return this;
    }

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
