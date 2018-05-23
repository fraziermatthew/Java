/* Palindrome number */

import java.util.Scanner;
public class Ex_03_12 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a three-digit integer: ");      
      int number = input.nextInt();
      
      if (number% 10 == number/100)
         System.out.println(number + " is a palindrome");
      else
         System.out.println(number + " is not a palindrome");
         
   }
}
