/* Check SSN */

import java.util.Scanner;
public class Ex_04_21 {
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a SSN: ");
      String s = input.nextLine();
      
      int n = 0;
      boolean isValid = true;
      while(n < s.length() ) {
         if (Character.isLetter(s.charAt(n)) || s.charAt(3) != '-' || s.charAt(6) != '-')
            isValid = false;
         n++;
      }
      
      if (isValid)
         System.out.print(s + " is a valid social security number");
      else 
         System.out.print(s + " is an invalid social security number");
   
   }
}
