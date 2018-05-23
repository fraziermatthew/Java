/* Science: calculating energy */

import java.util.Scanner;
public class Ex_02_10 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the amount of water in kilograms: ");
      double water = input.nextDouble();
      System.out.println("Enter the inital temperature: ");
      double initTemp = input.nextDouble();
      System.out.println("Enter the final temperature: ");
      double finalTemp = input.nextDouble();
      double energy = water * (finalTemp - initTemp) * 4184;
      System.out.println("The energy needed is " + energy);
             
   }
}
