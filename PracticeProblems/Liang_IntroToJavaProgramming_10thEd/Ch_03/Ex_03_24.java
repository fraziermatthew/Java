/* Game: pick a card */

public class Ex_03_24 {

   public static void main(String[] args) {
      
      // (Math.random() * max - min + 1) + min
      int suit = (int)(Math.random() * 4);
      int card = (int)(Math.random() * 13);
      String suitCard[] = {"Hearts", "Clubs", "Diamonds", "Spades"},
             numCard[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
      System.out.print("The card you picked is " + numCard[card] + " of " + suitCard[suit]);
      
   }
}
