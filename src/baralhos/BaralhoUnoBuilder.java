package baralhos;

import factory.CartaUnoFactory;
import Nsei.Baralho;
import Nsei.BaralhoUno;
import carta.Cor;

public class BaralhoUnoBuilder implements BaralhoBuilder {
    private BaralhoUno baralho;
    private CartaUnoFactory cartaFactory;

    public BaralhoUnoBuilder() {
        this.cartaFactory = new CartaUnoFactory();
        this.reset();
    }

    @Override
    public void reset() {
        this.baralho = new BaralhoUno();
    }

    @Override
    public void buildCartasNumericas() {
        Cor[] cores = {Cor.AZUL, Cor.AMARELO, Cor.VERDE, Cor.VERMELHO};
        for (Cor cor : cores) {
            for (int i = 0; i <= 9; i++) {
                baralho.adicionarCarta(cartaFactory.criarCarta(String.valueOf(i), cor, i));
            }
        }
    }

    @Override
    public void buildCartasEspeciais() {
        // Adicionar cartas especiais aqui
    }

    @Override
    public Baralho getResult() {
        return baralho;
    }
}
