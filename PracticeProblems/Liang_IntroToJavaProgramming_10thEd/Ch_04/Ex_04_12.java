/* Hex to binary */

import java.util.Scanner;
public class Ex_04_12 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a hex digit: ");
      char c = input.next().charAt(0);
      if ((int)c > 70 || (int)c < 65)
         System.out.print(c + " is an invalid input ");
      else {
         int d = Integer.parseInt(Character.toString(c), 16);
         String b = Integer.toBinaryString(d);
         System.out.print("The binary value is " + b);
      }
      
    }
}
