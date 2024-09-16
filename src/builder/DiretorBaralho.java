package builder;

import baralhos.Baralho;

public class DiretorBaralho {
    private BaralhoBuilder builder;

    public DiretorBaralho(BaralhoBuilder builder) {
        this.builder = builder;
    }



    public void setBuilder(BaralhoBuilder builder) {
        this.builder = builder;
    }

    public void make(){
        if(builder instanceof BaralhoUnoBuilder){
            builder.construirCartasNumericas();
            builder.construirCartasEspeciais();

        }
        if(builder instanceof BaralhoTradicionalBuilder){
            builder.construirCartasNumericas();
        }

    }

    public Baralho getBaralho() {
        return builder.getResult();
    }
}
