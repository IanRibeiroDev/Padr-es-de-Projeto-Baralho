package factory;

import carta.Carta;
import carta.CartaTradicional;
import carta.Cor;

public class CartaTradicionalFactory extends CartaFactory {
    @Override
    public Carta criarCarta(String face, Cor cor, int valor) {
        String naipe = ""; // Defina o naipe adequadamente
        return new CartaTradicional(face, naipe, valor, cor);
    }
}
