package builder;

import baralhos.Baralho;
import carta.CartaTradicional;
import carta.Cor;
import factory.CartaFactory;
import factory.TipoCarta;

public class BaralhoTradicionalBuilder implements BaralhoBuilder {
    private Baralho baralho;
    private CartaFactory cartaFactory;

    public BaralhoTradicionalBuilder() {

        this.cartaFactory = new CartaFactory();
        this.reset();
    }




    @Override
    public void reset() {
        this.baralho = new Baralho();
    }

    @Override
    public void construirCartasNumericas() {
        String[] naipes = {"Copas", "Espadas", "Ouros", "Paus"};
        String[] faces = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        CartaTradicional cartaAtual = new CartaTradicional();
        for (String naipe : naipes) {
            Cor cor = definirCorPorNaipe(naipe);
            for (String face : faces) {
//                baralho.adicionarCarta(cartaFactory.criarCartaComNaipes(naipe, face, cor, 0));
                cartaAtual = (CartaTradicional) cartaFactory.criarCarta(TipoCarta.TRADICIONAL);
                cartaAtual.setCor(cor);
                cartaAtual.setFace(face);
                cartaAtual.setValor(0);
                cartaAtual.setNaipe(naipe);
                baralho.adicionarCarta(cartaAtual);

            }
        }
    }



    @Override
    public void construirCartasEspeciais() {

    }

    // Método auxiliar para definir a cor com base no naipe
    private Cor definirCorPorNaipe(String naipe) {
        if (naipe.equals("Copas") || naipe.equals("Ouros")) {
            return Cor.VERMELHO;
        } else {
            return Cor.PRETO;
        }
    }

    @Override
    public Baralho getResult() {
        return baralho;
    }
}
