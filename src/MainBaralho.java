import baralhos.Baralho;
import builder.BaralhoTradicionalBuilder;
import builder.BaralhoUnoBuilder;
import builder.DiretorBaralho;

public class MainBaralho {
    public static void main(String[] args) {
        // Criando baralho tradicional

        DiretorBaralho diretor = new DiretorBaralho(new BaralhoTradicionalBuilder());
        diretor.make();
        Baralho baralhoTradicional = diretor.getBaralho();

        System.out.println("Baralho Tradicional:");
        System.out.println("Size: " + baralhoTradicional.size());
        System.out.println(baralhoTradicional);



        diretor.setBuilder(new BaralhoUnoBuilder());
        diretor.make();
        Baralho baralho = diretor.getBaralho();
        System.out.println(baralho.size());
        System.out.println("Baralho Uno:");
        System.out.println(baralho);


    }
}
