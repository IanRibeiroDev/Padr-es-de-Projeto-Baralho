import baralhos.Baralho;
import baralhos.BaralhoTradicionalBuilder;
import baralhos.BaralhoUnoBuilder;
import baralhos.DiretorBaralho;

public class MainBaralho {
    public static void main(String[] args) {
        // Criando baralho tradicional

        DiretorBaralho diretor = new DiretorBaralho(new BaralhoTradicionalBuilder());
        diretor.construirBaralho();
        Baralho baralhoTradicional = diretor.getBaralho();
        System.out.println("Baralho Tradicional:");
        System.out.println("Size: " + baralhoTradicional.size());
        System.out.println(baralhoTradicional);




//        diretor = new DiretorBaralho(new BaralhoUnoBuilder());
//        diretor.construirBaralho();
//        Baralho baralho = diretor.getBaralho();
//        System.out.println(baralho.size());
//        System.out.println("Baralho Uno:");
//        System.out.println(baralho);


    }
}
