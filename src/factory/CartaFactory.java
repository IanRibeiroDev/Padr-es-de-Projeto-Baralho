package factory;

import carta.Carta;
import carta.Cor;

public abstract class CartaFactory {
    public abstract Carta criarCarta(String face, Cor cor, int valor);
}
