package factory;

import carta.Carta;
import carta.CartaUno;
import carta.Cor;

public class CartaUnoFactory extends CartaFactory {
    @Override
    public Carta criarCarta(String face, Cor cor, int valor) {
        return new CartaUno(face, cor, valor);
    }
}
