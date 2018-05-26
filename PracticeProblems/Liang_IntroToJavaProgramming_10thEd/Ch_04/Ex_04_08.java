/* Find the character of an ASCII code */

import java.util.Scanner;
public class Ex_04_08 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an ASCII code: ");
      int ascii = input.nextInt();
      System.out.print("The character for ASCII code " + ascii + " is " + (char)ascii);

   }
}
