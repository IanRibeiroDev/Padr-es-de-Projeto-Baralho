package baralho;

import carta.CartaTradicional;
import carta.Cor;

public class BaralhoTradicional extends Baralho {
    private static final int NUMERO_DE_CARTAS = 52;

    @Override
    protected void criarCartas() {
        String[] faces = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String[] naipes = {"\u2665", "\u2666", "\u2663", "\u2660"};

        for (int count = 0; count < NUMERO_DE_CARTAS; count++) {
            cartas.add(new CartaTradicional(faces[count % 13], naipes[count / 13], 0,
                    naipes[count / 13] == "\u2665" || naipes[count / 13] == "\u2666" ? Cor.VERMELHO : Cor.PRETO));
        }
    }
}