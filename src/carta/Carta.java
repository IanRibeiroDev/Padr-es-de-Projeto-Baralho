package carta;

public abstract class Carta {
   protected String face;
   protected String naipe;
   protected Cor cor;
   protected int valor;

   public Carta(String face, String naipe, int valor, Cor cor) {
      this.face = face;
      this.naipe = naipe;
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

   public String getNaipe() {
      return naipe;
   }

   public void setValor(int valor) {
      this.valor = valor;
   }

   @Override
   public String toString() {
      String corTexto = (cor != null) ? cor.ansiCode() + cor.getValue() + Cor.RESET.ansiCode() : "";
      return String.format("%6s", face) + (corTexto.isEmpty() ? "" : " " + corTexto) + (naipe.isEmpty() ? "" : " de " + naipe) + ", valor " + valor;
   }
}
