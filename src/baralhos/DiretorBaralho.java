package baralhos;

import Nsei.Baralho;

public class DiretorBaralho {
    private BaralhoBuilder builder;

    public DiretorBaralho(BaralhoBuilder builder) {
        this.builder = builder;
    }

    public void construirBaralho() {
        builder.reset();
        builder.buildCartasNumericas();
        builder.buildCartasEspeciais();
    }

    public Baralho getBaralho() {
        return builder.getResult();
    }
}
