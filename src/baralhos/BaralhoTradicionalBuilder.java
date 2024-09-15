package baralhos;

import factory.CartaTradicionalFactory;
import Nsei.Baralho;
import Nsei.BaralhoTradicional;
import carta.Cor;

public class BaralhoTradicionalBuilder implements BaralhoBuilder {
    private BaralhoTradicional baralho;
    private CartaTradicionalFactory cartaFactory;

    public BaralhoTradicionalBuilder() {
        this.cartaFactory = new CartaTradicionalFactory();
        this.reset();
    }

    @Override
    public void reset() {
        this.baralho = new BaralhoTradicional();
    }

    @Override
    public void buildCartasNumericas() {
        String[] faces = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        Cor[] cores = {Cor.PRETO, Cor.VERMELHO}; // Ou defina as cores adequadas
        for (String face : faces) {
            for (Cor cor : cores) {
                baralho.adicionarCarta(cartaFactory.criarCarta(face, cor, 0)); // Valor default
            }
        }
    }

    @Override
    public Baralho getResult() {
        return baralho;
    }
}
