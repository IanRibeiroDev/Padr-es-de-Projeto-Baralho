package baralho;

import carta.CartaUno;
import carta.Cor;

import java.util.Arrays;

public class BaralhoUno extends Baralho {

    @Override
    protected void criarCartas() {
        // Cartas numeradas
        criarCartasNumeradas(Cor.AZUL);
        criarCartasNumeradas(Cor.AMARELO);
        criarCartasNumeradas(Cor.VERDE);
        criarCartasNumeradas(Cor.VERMELHO);

        // Cartas especiais
        criarCartasEspeciais(Cor.AZUL);
        criarCartasEspeciais(Cor.AMARELO);
        criarCartasEspeciais(Cor.VERDE);
        criarCartasEspeciais(Cor.VERMELHO);

        // Cartas curinga e compre 4
        for (int i = 0; i < 4; i++) {
            cartas.add(new CartaUno("Curinga", Cor.MULTICOR, 50));
            cartas.add(new CartaUno("Compre quatro", Cor.MULTICOR, 50));
        }

        // Carta trocar as mãos
        cartas.add(new CartaUno("Trocar as mãos", Cor.MULTICOR, 50));

    }

    private void criarCartasNumeradas(Cor cor) {
        for (int i = 0; i <= 9; i++) {
            cartas.add(new CartaUno(String.valueOf(i), cor, i));
            cartas.add(new CartaUno(String.valueOf(i), cor, i));
        }
    }

    private void criarCartasEspeciais(Cor cor) {
        for (String tipo : Arrays.asList("Compre Duas", "Inverter", "Pular")) {
            cartas.add(new CartaUno(tipo, cor, 20));
            cartas.add(new CartaUno(tipo, cor, 20));
        }
    }
}