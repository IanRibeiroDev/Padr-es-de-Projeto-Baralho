package baralho;

import builder.CartaBuilder;
import carta.Cor;

public class BaralhoUno extends Baralho {

    @Override
    protected void criarCartas() {
        criarCartasNumeradas();
        criarCartasEspeciais();
        criarCuringas();
        criarTrocaMaos();
    }

    private void criarCartasNumeradas() {
        Cor[] cores = {Cor.AZUL, Cor.AMARELO, Cor.VERDE, Cor.VERMELHO};
    
        for (Cor cor : cores) {
            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j < 2; j++) {
                    cartas.add(new CartaBuilder()
                            .setTipoBaralho(TipoBaralho.UNO)
                            .setFace(String.valueOf(i))
                            .setCor(cor)
                            .setValor(i)
                            .make());
                }
            }
        }
    }
    

    private void criarCartasEspeciais() {
        Cor[] cores = {Cor.AZUL, Cor.AMARELO, Cor.VERDE, Cor.VERMELHO};
        String[] especiais = {"Compre Duas", "Inverter", "Pular"};

        for (Cor cor : cores) {
            for (String especial : especiais) {
                for (int i = 0; i < 2; i++) { 
                    cartas.add(new CartaBuilder()
                            .setTipoBaralho(TipoBaralho.UNO)
                            .setFace(especial)
                            .setCor(cor)
                            .setValor(20)
                            .make());
                }
            }
        }
    }

    private void criarCuringas() {
        for (int i = 0; i < 4; i++) {
            cartas.add(new CartaBuilder()
                    .setTipoBaralho(TipoBaralho.UNO)
                    .setFace("Curinga")
                    .setValor(50)
                    .setCor(Cor.MULTICOR)
                    .make());

            cartas.add(new CartaBuilder()
                    .setTipoBaralho(TipoBaralho.UNO)
                    .setFace("Compre Quatro")
                    .setValor(50)
                    .setCor(Cor.MULTICOR)
                    .make());
        }
    }

    private void criarTrocaMaos(){
        cartas.add(new CartaBuilder()
                    .setTipoBaralho(TipoBaralho.UNO)
                    .setFace("Troca as mãos")
                    .setValor(50)
                    .setCor(Cor.MULTICOR)
                    .make());

        CartaBuilderTradicional builder = new BuilderTradicional;
        Diretor diretor = new Diretor();
        diretor.create
    }
}
