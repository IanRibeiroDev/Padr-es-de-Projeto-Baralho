// Fig. 7.11: DeckOfCardsTest.java
// Aplicativo de embaralhar e distribuir cartas.

import baralho.Baralho;
import factory.BaralhoFactory;
import factory.BaralhoTradicionalFactory;
import factory.BaralhoUnoFactory;

public class MainBaralho
{
   // executa o aplicativo
   public static void main( String args[] )
   {
      BaralhoFactory factory = new BaralhoTradicionalFactory();
      Baralho baralho = factory.criarBaralho();
      //myDeckOfCards.shuffle(); // coloca Cards em ordem aleat�ria
 
      
      // imprime todas as 52 cartas na ordem em que elas s�o distribu�das
      System.out.println( "Size: " + baralho.size());
      System.out.println( baralho);

      System.out.println( "Removendo 26 cartas a partir do topo do baralho: ");
      
      for ( int i = 0; i < 26; i++ )
      {
    	  System.out.printf( "%-20s\n",baralho.dealCard());
         // distribui e imprime 4 Cards
        // System.out.printf( "%-20s%-20s%-20s%-20s\n",
         //   myDeckOfCards.dealCard(), myDeckOfCards.dealCard(), 
         //   myDeckOfCards.dealCard(), myDeckOfCards.dealCard() );
      } // for final
      System.out.println( "Size: " + baralho.size());
      System.out.println( baralho);

      factory = new BaralhoUnoFactory();
      baralho = factory.criarBaralho();
      System.out.println("\nBaralho Uno:");
      System.out.println("Size: " + baralho.size());
      System.out.println(baralho);
      
   }
}

