/* Find future dates */

import java.util.Scanner;
public class Ex_03_05 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter today's day: ");
   	
      int day = input.nextInt();
      String dow = "";
      switch (day){
         case 0:
            dow = "Sunday"; 
            break;
         case 1:
            dow = "Monday"; 
            break;
         case 2:
            dow = "Tuesday"; 
            break;
         case 3:
            dow = "Wednesday"; 
            break;
         case 4:
            dow = "Thursday"; 
            break;
         case 5:
            dow = "Friday"; 
            break;
         case 6:
            dow = "Saturday"; 
            break;
      }
   
      System.out.println("Enter the number of days elapsed since today: ");
      int futDay = input.nextInt();
      int result = day + futDay % 7;
      switch (result){
         case 0:
            System.out.println("Today is " + dow + " and the future day is Sunday");
            break;
         case 1:
            System.out.println("Today is " + dow + " and the future day is Monday");
            break;
         case 2:
            System.out.println("Today is " + dow + " and the future day is Tuesday");
            break;
         case 3:
            System.out.println("Today is " + dow + " and the future day is Wednesday");
            break;
         case 4:
            System.out.println("Today is " + dow + " and the future day is Thursday");
            break;
         case 5:
            System.out.println("Today is " + dow + " and the future day is Friday");
            break;
         case 6:
            System.out.println("Today is " + dow + " and the future day is Saturday");
            break;
      }
      
   }
}
