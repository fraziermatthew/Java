/* Process a string */

import java.util.Scanner;
public class Ex_04_20 {
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s = input.nextLine();
      System.out.print(s.length() + " " + s.charAt(0));
         
   }
}
