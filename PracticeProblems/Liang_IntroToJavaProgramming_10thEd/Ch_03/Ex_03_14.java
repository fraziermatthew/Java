/* Game: heads or tails */

import java.util.Scanner;
public class Ex_03_14 {

   public static void main(String[] args) {
   
      
      // Flip coin
      double answer = Math.round(Math.random());
      System.out.println("A coin has been flipped!");
      String coin = (answer < 0) ? "heads" : "tails";
      
      // Create Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt the user to guess answer
      System.out.print("Guess whether the coin is heads (0) or tails (1): ");
      int guess = input.nextInt();     
      
      // Display the result
      if (answer == guess)
         System.out.println("You are correct! The coin is " + coin + ".");
      else
         System.out.println("You are not correct. The coin is " + coin);
         
   }
}
