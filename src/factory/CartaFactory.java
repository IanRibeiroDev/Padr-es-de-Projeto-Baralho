package factory;

import carta.Carta;
import carta.CartaTradicional;
import carta.CartaUno;
import carta.Cor;

public class CartaFactory {
    public Carta criarCarta(TipoCarta tipo) {
        switch (tipo) {
            case TRADICIONAL:
                return new CartaTradicional();
            case UNO:
                return new CartaUno();
            default:
                throw new IllegalArgumentException("Tipo de carta desconhecido: " + tipo);
        }
    }
}
