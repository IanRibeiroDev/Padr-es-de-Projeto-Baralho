package baralhos;

import java.util.ArrayList;
import java.util.List;

import carta.Carta;

public  class Baralho {
    protected List<Carta> cartas;

    public Baralho() {
        this.cartas = new ArrayList<>();
    }
    public int size(){
        return this.cartas.size();
    }
    public void adicionarCarta(Carta carta) {
        cartas.add(carta);
    }






}