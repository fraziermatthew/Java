/* Game: scissor, rock, paper */

import java.util.Scanner;
public class Ex_03_17 {

   public static void main(String[] args) {
      
      System.out.println("scissor (0), rock (1), paper (2): ");
      Scanner input = new Scanner(System.in);
      int guess = input.nextInt();
      // (Math.random * max - min + 1) + min
      int answer = (int)(Math.random() * 4);
      
      String computer;
      if (answer == 0)
         computer = "scissor";
      else if (answer == 1)
         computer = "rock";
      else
         computer = "paper";
      
      String player;
      if (guess == 0)
         player = "scissor";
      else if (guess == 1)
         player = "rock";
      else
         player = "paper";
      
      if (answer == guess)
         System.out.println("The computer is " + computer + ". You are " + player + " too. It is a draw");
      
      if (computer == "scissor" && player == "paper")
         System.out.println("The computer is " + computer + ". You are " + player + ". You lose");
      if (computer == "rock" && player == "scissor")
         System.out.println("The computer is " + computer + ". You are " + player + ". You lose");
      if (computer == "paper" && player == "rock")
         System.out.println("The computer is " + computer + ". You are " + player + ". You lose");
      
      if (computer == "paper" && player == "scissor")
         System.out.println("The computer is " + computer + ". You are " + player + ". You win");
      if (computer == "scissor" && player == "rock")
         System.out.println("The computer is " + computer + ". You are " + player + ". You win");
      if (computer == "rock" && player == "paper")
         System.out.println("The computer is " + computer + ". You are " + player + ". You win");
         
   }
}
