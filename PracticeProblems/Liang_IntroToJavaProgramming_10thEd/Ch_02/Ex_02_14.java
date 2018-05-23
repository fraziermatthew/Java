/* Health application: computing BMI */

import java.util.Scanner;
public class Ex_02_14 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter weight in pounds: ");
      double weight = input.nextDouble() * 0.45359237;
      System.out.println("Enter height in inches: ");
      double height = input.nextDouble() * 0.0254;
      double BMI = weight / (height * height);
      System.out.println("BMI is " + BMI);
                   
   }
}
