package carta;

public abstract class Carta {
   protected String face;
   protected Cor cor;
   protected int valor;

   public Carta(String face, int valor, Cor cor) {
      this.face = face;
      this.valor = valor;
      this.cor = cor;
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

   public void setValor(int valor) {
      this.valor = valor;
   }

   public void setFace(String face) {
      this.face = face;
   }

   public void setCor(Cor cor) {this.cor = cor;}
}
