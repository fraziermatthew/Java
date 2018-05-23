/* Financial application: calculate interest */

import java.util.Scanner;
public class Ex_02_20 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%: ");
		double  balance = input.nextDouble(),
				intRate = input.nextDouble(),
				annualInterest = balance * (intRate/1200);
		System.out.println("The interest rate is " + annualInterest);
         
   }
}
