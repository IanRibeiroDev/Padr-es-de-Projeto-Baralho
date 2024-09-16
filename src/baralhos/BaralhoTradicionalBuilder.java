package baralhos;

import factory.CartaTradicionalFactory;
import carta.Cor;

public class BaralhoTradicionalBuilder implements BaralhoBuilder {
    private Baralho baralho;
    private CartaTradicionalFactory cartaFactory;

    public BaralhoTradicionalBuilder() {

        this.cartaFactory = new CartaTradicionalFactory();
        this.reset();
    }




    @Override
    public void reset() {
        this.baralho = new Baralho();
    }

    @Override
    public void buildCartas() {
        String[] naipes = {"Copas", "Espadas", "Ouros", "Paus"};
        String[] faces = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};

        for (String naipe : naipes) {
            Cor cor = definirCorPorNaipe(naipe);
            for (String face : faces) {
                baralho.adicionarCarta(cartaFactory.criarCartaComNaipes(naipe, face, cor, 0)); // Valor default 0 para cartas sem valor numérico
            }
        }
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
