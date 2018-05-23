/* Convert Celsius to Fahrenheit */

import java.util.Scanner;
public class Ex_02_01 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter in a degree (in Celsius)");	
      double celsius = input.nextDouble();
      double farenheit = (9.0/5) * celsius + 32;
      System.out.println(celsius + " Celsius is " + farenheit + " Farenheit");
      
   }
}
