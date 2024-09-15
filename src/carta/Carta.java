package carta;

public abstract class Carta {
    protected String face;
    protected Cor cor;
    protected int valor;

    public Carta(String face, int valor, Cor cor) {
        this.face = face;
        this.valor = valor;
        this.cor = cor;
        System.out.println(this); // Printando ao criar
    }

    public String getFace() {
        return face;
    }

    public int getValor() {
        return valor;
    }

    public Cor getCor() {
        return cor;
    }

    @Override
    public abstract String toString();
}
