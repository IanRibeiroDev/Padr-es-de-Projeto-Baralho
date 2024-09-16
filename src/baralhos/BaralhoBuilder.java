package baralhos;

public interface BaralhoBuilder {
    void reset(); // Reinicia o processo de construção do baralho
//    void buildCartasNumericas(); // Cria cartas numéricas
//    void buildCartasEspeciais(); // Cria cartas especiais (para Uno)

    void buildCartas();

    Baralho getResult(); // Retorna o baralho construído
}