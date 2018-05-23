/* Science: wind-chill temperature */

import java.util.Scanner;
public class Ex_03_20 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the temperature in Fahrenheit: ");
      double temp = input.nextDouble();
      
      if (temp < -58 || temp > 48) {
         System.out.println("invalid temperature");
         System.exit(1);
      }
      
      System.out.println("Enter the wind speed: ");
      double windSpeed = input.nextDouble();
      
      if (windSpeed < 2) {
         System.out.println("invalid wind speed");
         System.exit(1);
      }
      
      double windChillIndex = 35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * windSpeed * Math.pow(windSpeed, 0.16);
      System.out.println("The wind chill index is " + windChillIndex);
                   
   }
}
