package factory;

import baralho.Baralho;
import baralho.BaralhoUno;

public class BaralhoUnoFactory implements BaralhoFactory {
    @Override
    public Baralho criarBaralho() {
        return new BaralhoUno();
    }
}
