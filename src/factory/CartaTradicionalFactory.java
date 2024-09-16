package factory;

import carta.Carta;
import carta.CartaTradicional;
import carta.Cor;

public class CartaTradicionalFactory extends CartaFactory {
    @Override
    public Carta criarCarta(String face, Cor cor, int valor) {
        return null;
    }

    public Carta criarCartaComNaipes(String naipe, String face, Cor cor, int valor){
        return new CartaTradicional(face, naipe, valor, cor);
    }
}
