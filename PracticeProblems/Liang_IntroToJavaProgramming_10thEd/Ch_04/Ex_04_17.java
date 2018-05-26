/* Days of a month */

import java.util.Scanner;
public class Ex_04_17 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a year: ");
      int year = input.nextInt();
      System.out.print("Enter a month: ");
      String month = input.next();
      
      int days = 0;
      switch(month) {
         case "Feb":
            if (year % 4 == 0 || year % 400 == 0)
               days = 29;
            else 
               days = 28;
            break;
         case "Apr":
         case "Jun":
         case "Sep":
         case "Nov":
            days = 30;
         default:
            days = 31;
      }
      System.out.print(month + " " + year + " has " + days + " days");
   }
}
