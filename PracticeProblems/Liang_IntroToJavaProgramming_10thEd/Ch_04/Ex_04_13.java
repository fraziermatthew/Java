/* Vowel or constant? */

import java.util.Scanner;
public class Ex_04_13 {

   public static void main(String[] args) {
      
      String vowels = "aeiouAEIOU";
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a letter: ");
      String c = input.next();
      
      if ( (int)c.charAt(0) < 65 || (int)c.charAt(0) > 90 &&
           (int)c.charAt(0) < 97 || (int)c.charAt(0) > 122 )
         System.out.print(c + " is an invalid input");
      else if (vowels.contains(c))
         System.out.print(c + " is a vowel");
      else if (!vowels.contains(c))
         System.out.print(c + " is a constant");
          
   }
}
