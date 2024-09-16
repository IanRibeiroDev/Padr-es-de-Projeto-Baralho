package baralhos;

import java.util.ArrayList;
import java.util.List;

import carta.Carta;
import carta.Cor;

public  class Baralho {
    protected List<Carta> cartas;

    public Baralho() {
        this.cartas = new ArrayList<Carta>();
    }
    public int size(){
        return this.cartas.size();
    }
    public void adicionarCarta(Carta carta) {
        cartas.add(carta);
    }

    public void removerCarta(Carta carta) {
        cartas.remove(carta);
    }

    @Override
    public String toString() {
        StringBuilder texto = new StringBuilder();
        for(Carta carta : cartas){
            texto.append(carta.toString()).append("\n");
        }
       return texto.toString();
    }
}





