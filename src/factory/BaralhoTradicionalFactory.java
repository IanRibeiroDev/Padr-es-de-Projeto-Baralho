package factory;

import baralho.Baralho;
import baralho.BaralhoTradicional;

public class BaralhoTradicionalFactory implements BaralhoFactory {
    @Override
    public Baralho criarBaralho() {
        return new BaralhoTradicional();
    }
}
