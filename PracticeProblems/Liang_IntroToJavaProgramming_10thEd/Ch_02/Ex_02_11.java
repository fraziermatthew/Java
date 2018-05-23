/* Population projection */

import java.util.Scanner;
public class Ex_02_11 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number of years: ");
      int yearPop = input.nextInt(),
          secPerYear = 365 * 24 * 60 * 60;
      long currentPop = 312032486, birth = secPerYear/7, immigrant = secPerYear/45, death = secPerYear/13;
      System.out.println("The " + yearPop + " year population is " + (currentPop + yearPop * (birth - death + immigrant)) );
             
   }
}
