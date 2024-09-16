package baralhos;

import factory.CartaUnoFactory;
import carta.Cor;

public class BaralhoUnoBuilder implements BaralhoBuilder {
    private Baralho baralho;
    private CartaUnoFactory cartaFactory;

    public BaralhoUnoBuilder() {
        this.cartaFactory = new CartaUnoFactory();
        this.reset();
    }

    @Override
    public void reset() {
       this.baralho = new Baralho();
    }




    // Função para construir o baralho de cartas numeradas (0 a 9)
    public void construirCartasNumericas() {
        Cor[] cores = {Cor.AZUL, Cor.AMARELO, Cor.VERDE, Cor.VERMELHO};


        for (Cor cor : cores) {
            // Adicionar a carta 0 (apenas 1 de cada cor)

            // Adicionar 2 cartas de cada número de 1 a 9
            for (int i = 0; i <= 9; i++) {
                baralho.adicionarCarta(cartaFactory.criarCarta(String.valueOf(i), cor, i));
                baralho.adicionarCarta(cartaFactory.criarCarta(String.valueOf(i), cor, i));
            }
        }
    }



    public void construirCartasEspeciais() {
        Cor[] cores = {Cor.AZUL, Cor.AMARELO, Cor.VERDE, Cor.VERMELHO};
        String[] cartasEspeciaisPorCor = {"Pular", "Inverter", "+2"};


        // Adicionar 2 de cada carta especial por cor
        for (Cor cor : cores) {
            for (String especial : cartasEspeciaisPorCor) {
                baralho.adicionarCarta(cartaFactory.criarCarta(especial, cor, 20));
                baralho.adicionarCarta(cartaFactory.criarCarta(especial, cor, 20));

            }
        }

        // Adicionar 4 Coringas e 4 Coringas +4 (não têm cor)
        for (int i = 0; i < 4; i++) {
            baralho.adicionarCarta(cartaFactory.criarCarta("Coringa", Cor.PRETO, 50));
            baralho.adicionarCarta(cartaFactory.criarCarta("+4", Cor.PRETO, 50));
            if (i == 0) { // Adiciona apenas uma vez
                baralho.adicionarCarta(cartaFactory.criarCarta("Trocar Mãos", Cor.PRETO, 50));
            }
        }

    }

    @Override
    public void buildCartas() {
        construirCartasNumericas();
        construirCartasEspeciais();
    }

    @Override
    public Baralho getResult() {
        return baralho;
    }
}
