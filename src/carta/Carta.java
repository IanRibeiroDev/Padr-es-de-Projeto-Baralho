package carta;

public abstract class Carta {
    protected String face;
    protected Cor cor;
    protected int valor;

    public Carta() {}

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public abstract String toString();

}
