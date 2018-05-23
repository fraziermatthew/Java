/* Science: day of the week */

import java.util.Scanner;
public class Ex_03_21 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter year: (e.g., 2012): ");
      int j = input.nextInt(), k = j;

      System.out.print("Enter month: 1-12: ");
      int m = input.nextInt();
      
      System.out.print("Enter the day of the month: ");
      int q = input.nextInt();
      
      if (m == 1) {
         m = 13;
         j -= 1;
         k -= 1;
      }
      else if (m == 2) {
         m = 14;
         j -= 1;
         k -= 1;
      }
      
      j /= 100;
      k %= 100;
      
      int h = ( q + ( (26 * (m + 1)) / 10) + k + (k/4) + (j/4) + 5 * j ) % 7;
      String dayOfWeek [] = {"Saturday", "Sunday", "Monday", 
                             "Tuesday", "Wednesday", "Thursday", "Friday"};                     
      System.out.println("Day of the week is " + dayOfWeek[h]);
      
   }
}
