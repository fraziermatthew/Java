/* Find the Unicode of a character */

import java.util.Scanner;
public class Ex_04_09 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a character: ");
      char c = input.next().charAt(0);
      System.out.print("The Unicode for the character " + c + " is " + (int)c);

   }
}
