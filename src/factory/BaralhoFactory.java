package factory;

import baralho.Baralho;
import baralho.BaralhoTradicional;
import baralho.BaralhoUno;
import baralho.TipoBaralho;

public interface BaralhoFactory {
    Baralho criarBaralho();
}