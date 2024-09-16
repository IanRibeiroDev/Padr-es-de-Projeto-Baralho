package builder;

import baralhos.Baralho;

public interface BaralhoBuilder {
    void reset(); // Reinicia o processo de construção do baralho


    void construirCartasNumericas();

    void construirCartasEspeciais();

    Baralho getResult();// Retorna o baralho construído


}