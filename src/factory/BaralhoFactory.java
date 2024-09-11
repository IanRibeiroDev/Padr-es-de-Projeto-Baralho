package factory;

import baralho.Baralho;
import baralho.BaralhoTradicional;
import baralho.BaralhoUno;
import baralho.TipoBaralho;

public class BaralhoFactory {
    public static Baralho criarBaralho(TipoBaralho tipo) {
        switch (tipo) {
            case TipoBaralho.TRADICIONAL:
                return new BaralhoTradicional();
            case TipoBaralho.UNO:
                return new BaralhoUno();
            default:
                throw new IllegalArgumentException("Tipo de baralho inválido");
        }
    }
}