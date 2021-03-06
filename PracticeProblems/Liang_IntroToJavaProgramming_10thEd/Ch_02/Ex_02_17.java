/* Science: wind-chill temperature */

import java.util.Scanner;
public class Ex_02_17 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the temperature in Fahrenheit between -58 °F and 41 °F: ");
      double temp = input.nextDouble();
      System.out.println("Enter the wind speed (>=2) in miles per hour: ");
      double windSpeed = input.nextDouble();
      double windChillIndex = 35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * windSpeed * Math.pow(windSpeed, 0.16);
      System.out.println("The wind chill index is " + windChillIndex);
                   
   }
}
