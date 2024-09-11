package baralho;

import carta.Carta;

import java.util.ArrayList;
import java.util.List;

public abstract class Baralho {
    protected List<Carta> cartas;

    public Baralho() {
        this.cartas = new ArrayList<>();
        criarCartas();
    }

    protected abstract void criarCartas();

    public void embaralhar() {
        // Implementação do método embaralhar
    }

    public Carta dealCard() {
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.remove(cartas.size() - 1);
    }

    public int size() {
        return cartas.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int column = 0;
        for (Carta carta : cartas) {
            column++;
            sb.append(carta.toString()).append("   ");
            if (column % 4 == 0) {
                sb.append("\n");
                column = 0;
            }
        }
        return sb.toString();
    }
}