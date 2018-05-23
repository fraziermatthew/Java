/* Current time */

import java.util.Scanner;
public class Ex_02_08 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the time zone offset to GMT: ");
      int tzOffset = input.nextInt();
      long 	totalMilliSec 	= System.currentTimeMillis(),
         	totalSec 		= totalMilliSec / 1000,
         	currSec 		= totalSec % 60,
         	totalMin 		= totalSec / 60,
         	currMin			= totalMin % 60,
         	totalHour		= totalMin / 60,
         	currHour		= (totalHour % 24) + tzOffset;
      System.out.println("The current time is " + currHour + ":" + currMin + ":" + currSec);
      
   }
}
