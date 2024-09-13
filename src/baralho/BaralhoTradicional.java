package baralho;

import builder.CartaBuilder;
import carta.Cor;

public class BaralhoTradicional extends Baralho {
    private static final int NUMERO_DE_CARTAS = 52;

    @Override
    protected void criarCartas() {
        String[] faces = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String[] naipes = {"\u2665", "\u2666", "\u2663", "\u2660"};

        for (int count = 0; count < NUMERO_DE_CARTAS; count++) {
            Cor cor = (naipes[count / 13].equals("\u2665") || naipes[count / 13].equals("\u2666")) ? Cor.VERMELHO : Cor.PRETO;

            cartas.add(new CartaBuilder()
                .setTipoBaralho(TipoBaralho.TRADICIONAL)
                .setFace(faces[count % 13])
                .setNaipe(naipes[count / 13])
                .setCor(cor)
                .setValor(0)
                .make());
        }
    }
}
