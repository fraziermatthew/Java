/* Find the number of years */

import java.util.Scanner;
public class Ex_02_07 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number of minutes: ");
      int minutes = input.nextInt();
      int day = 1440,      // # of minutes in one day
          year = day*365,  // # of minutes in one year
          resultYear = minutes / year, 
          minutesLeft = minutes - resultYear * 365 * 24 * 60, 
          resultDay = minutesLeft/day;
      System.out.println(minutes + " minutes is approximately " + 
         resultYear + " years and " + resultDay + " days");
       
   }
}
