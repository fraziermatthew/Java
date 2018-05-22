import java.util.Scanner;
public class Ex_03_11 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("This program will display the number of days in a given month of a particular year.");
      
      System.out.println("Enter in the month (by digit - i.e. January = 1): ");      
      int month = input.nextInt();
      
      System.out.println("Enter in the year: (using 4 digits - i.e. 2017): ");
      int year = input.nextInt();
      
      int numOfDays = 0; 
      String monthName = "";
      
      // Calculate the number of days in that month given the year
      switch(month){
         case 1:
            numOfDays = 31;
            monthName = "January";
            break;
         case 2:
            if (year % 4 == 0)
               numOfDays = 29;
            else
               numOfDays = 28;
            monthName = "February";
            break;
         case 3:
            numOfDays = 31;
            monthName = "March";
            break;
         case 4:
            numOfDays = 30;
            monthName = "April";
            break;
         case 5:
            numOfDays = 31;
            monthName = "May";
            break;
         case 6:
            numOfDays = 30;
            monthName = "June";
            break;
         case 7:
            numOfDays = 31;
            monthName = "July";
            break;
         case 8:
            numOfDays = 31;
            monthName = "August";
            break;
         case 9:
            numOfDays = 30;
            monthName = "September";
            break;
         case 10:
            numOfDays = 31;
            monthName = "October";
            break;
         case 11:
            numOfDays = 30;
            monthName = "November";
            break;
         case 12:
            numOfDays = 31;
            monthName = "December";
            break;
      }
      
      System.out.println(monthName + " " + year + " has " + numOfDays + " days.");
   }
}
