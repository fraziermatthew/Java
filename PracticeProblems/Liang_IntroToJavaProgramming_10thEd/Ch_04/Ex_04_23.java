/* Financial application: payroll */

import java.util.Scanner;
public class Ex_04_23 {
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter employee's name: ");
      String name = input.nextLine();
      
      System.out.print("Enter number of hours worked in a week: ");
      double hours = input.nextDouble();
      
      System.out.print("Enter hourly pay rate: ");
      double rate = input.nextDouble();
      
      System.out.print("Enter federal tax withholding rate: ");
      double fedTax = input.nextDouble();
      
      System.out.println("Enter state tax withholding rate: ");
      double stateTax = input.nextDouble();
      
      double grossPay = hours * rate,
             fedWith = grossPay * fedTax,
             stateWith = grossPay * stateTax,
             totalDed = fedWith + stateWith,
             netPay = grossPay - totalDed;
      
      System.out.println("Employee Name: " + name);
      System.out.println("Hours Worked: " + hours);
      System.out.println("Pay Rate: $" + rate);
      System.out.println("Gross Pay: $" + grossPay);
      System.out.println("Deductions:");
      System.out.println("    Federal Withholding (" + fedTax + "%): $" + fedWith);
      System.out.println("    State Withholding (" + stateTax + "%): $" + stateWith);
      System.out.println("    Total Deduction: " + totalDed);
      System.out.println("Net Pay: $" + netPay);
   }
}
