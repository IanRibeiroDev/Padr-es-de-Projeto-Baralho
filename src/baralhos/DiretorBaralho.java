package baralhos;

public class DiretorBaralho {
    private BaralhoBuilder builder;

    public DiretorBaralho(BaralhoBuilder builder) {
        this.builder = builder;
    }

    public void construirBaralho() {
        builder.reset();
        builder.buildCartas();
    }

    public Baralho getBaralho() {
        return builder.getResult();
    }
}
