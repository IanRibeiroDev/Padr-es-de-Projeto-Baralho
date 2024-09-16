package builder;

import baralhos.Baralho;
import carta.CartaUno;
import carta.Cor;
import factory.CartaFactory;
import factory.TipoCarta;

public class BaralhoUnoBuilder implements BaralhoBuilder {
    private Baralho baralho;
    private CartaFactory cartaFactory;

    public BaralhoUnoBuilder() {
        this.cartaFactory = new CartaFactory();
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
                CartaUno cartaAtual = new CartaUno();

                cartaAtual.setCor(cor);
                cartaAtual.setValor(i);
                cartaAtual.setFace(String.valueOf(i));
                baralho.adicionarCarta(cartaAtual);
                baralho.adicionarCarta(cartaAtual);

            }
        }
    }

    public void construirCartasEspeciais() {
        Cor[] cores = {Cor.AZUL, Cor.AMARELO, Cor.VERDE, Cor.VERMELHO};
        String[] cartasEspeciaisPorCor = {"Pular", "Inverter", "+2"};


        // Adicionar 2 de cada carta especial por cor
        for (Cor cor : cores) {
            for (String especial : cartasEspeciaisPorCor) {
                CartaUno cartaAtual = (CartaUno) cartaFactory.criarCarta(TipoCarta.UNO);

                cartaAtual.setCor(cor);
                cartaAtual.setFace(especial);
                cartaAtual.setValor(20);
                baralho.adicionarCarta(cartaAtual);
                baralho.adicionarCarta(cartaAtual);

            }
        }

        // Adicionar 4 Coringas e 4 Coringas +4 (não têm cor)
        for (int i = 0; i < 4; i++) {
            CartaUno cartaAtual = (CartaUno) cartaFactory.criarCarta(TipoCarta.UNO);

            cartaAtual.setCor(Cor.MULTICOR);
            cartaAtual.setFace("Coringa");
            cartaAtual.setValor(50);
            baralho.adicionarCarta(cartaAtual);
            cartaAtual = (CartaUno) cartaFactory.criarCarta(TipoCarta.UNO);

            cartaAtual.setCor(Cor.MULTICOR);
            cartaAtual.setFace("+4");
            cartaAtual.setValor(50);
            baralho.adicionarCarta(cartaAtual);

            if (i == 0) { // Adiciona apenas uma vez
                 cartaAtual = (CartaUno) cartaFactory.criarCarta(TipoCarta.UNO);

                cartaAtual.setCor(Cor.MULTICOR);
                cartaAtual.setFace("Trocar Mãos");
                cartaAtual.setValor(50);
                baralho.adicionarCarta(cartaAtual);
            }
        }

    }


    @Override
    public Baralho getResult() {
        return baralho;
    }
}
