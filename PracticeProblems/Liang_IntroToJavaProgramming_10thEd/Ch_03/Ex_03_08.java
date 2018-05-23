/* Sort three integers */

import java.util.Scanner;
public class Ex_03_08 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter in three integers");
      int number = input.nextInt(),
          digit1 = number / 100 % 10,
          digit2 = number / 10 % 10,
          digit3 = number / 1 % 10;
          
      if (digit1 <= digit2 && digit2 <= digit3) 
         System.out.println(digit1 + ", " + digit2 + ", " + digit3);
      if (digit1 <= digit3 && digit3 <= digit2) 
         System.out.println(digit1 + ", " + digit3 + ", " + digit2);
      if (digit2 <= digit1 && digit1 <= digit3) 
         System.out.println(digit2 + ", " + digit1 + ", " + digit3);
      if (digit2 <= digit3 && digit3 <= digit1) 
         System.out.println(digit2 + ", " + digit3 + ", " + digit1);
      if (digit3 <= digit1 && digit1 <= digit2) 
         System.out.println(digit3 + ", " + digit1 + ", " + digit2);
      if (digit3 <= digit2 && digit2 <= digit1) 
         System.out.println(digit3 + ", " + digit2 + ", " + digit1);   
           
   }
}
