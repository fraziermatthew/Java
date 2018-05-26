/* Order three cities */

import java.util.Scanner;
public class Ex_04_24 {
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first city: ");
      String c1 = input.nextLine();
      
      System.out.print("Enter the second city: ");
      String c2 = input.nextLine();
      
      System.out.print("Enter the third city: ");
      String c3 = input.nextLine();
      
      if ( (int)c1.charAt(0) < (int)c2.charAt(0) && (int)c2.charAt(0) < (int)c3.charAt(0) )
         System.out.print("The three cities in alphabetical order are " + c1 + ' ' + c2 + ' ' + c3);
      
      else if ( (int)c1.charAt(0) < (int)c3.charAt(0) && (int)c3.charAt(0) < (int)c2.charAt(0) )
         System.out.print("The three cities in alphabetical order are " + c1 + ' ' + c3 + ' ' + c2);
      
      else if ( (int)c2.charAt(0) < (int)c1.charAt(0) && (int)c1.charAt(0) < (int)c3.charAt(0) )
         System.out.print("The three cities in alphabetical order are " + c2 + ' ' + c1 + ' ' + c3);
      
      else if ( (int)c2.charAt(0) < (int)c3.charAt(0) && (int)c3.charAt(0) < (int)c1.charAt(0) )
         System.out.print("The three cities in alphabetical order are " + c2 + ' ' + c3 + ' ' + c1);
      
      else if ( (int)c3.charAt(0) < (int)c2.charAt(0) && (int)c2.charAt(0) < (int)c1.charAt(0) )
         System.out.print("The three cities in alphabetical order are " + c3 + ' ' + c2 + ' ' + c1);
         
      else if ( (int)c3.charAt(0) < (int)c1.charAt(0) && (int)c1.charAt(0) < (int)c2.charAt(0) )
         System.out.print("The three cities in alphabetical order are " + c3 + ' ' + c1 + ' ' + c2);
         
   }
}
