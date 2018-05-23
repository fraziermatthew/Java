/* Sum the digits in an integer */

import java.util.Scanner;
public class Ex_02_06 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number between 0 and 1000: ");
      int n = input.nextInt();
      int result;
      if (n > 99)
         result = n/100 + n%10 + (n/10)%10;
      else if (n > 9)
         result = n%10 + n/10;
      else
         result = n;
      System.out.println("The sum of the digits is " + result);
          
   }
}
