/* Convert letter grade to number */

import java.util.Scanner;
public class Ex_04_14 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a letter grade: ");
      String grade = input.next();
      
      // Simple Approach
      /*if (grade.equals("A"))
         System.out.print("The number value for grade " + grade + " is 4");
      else if(grade.equals("B"))
         System.out.print("The number value for grade " + grade + " is 3");
      else if(grade.equals("C"))
         System.out.print("The number value for grade " + grade + " is 2");
      else if(grade.equals("D"))
         System.out.print("The number value for grade " + grade + " is 1");
      else if(grade.equals("F"))
         System.out.print("The number value for grade " + grade + " is 0");
      else
         System.out.print(grade + " is an invalid grade");
      */
      
      // Better Approach
      if ((int)grade.charAt(0) < 65 || (int)grade.charAt(0) > 70)
         System.out.print(grade + " is an invalid grade");
      else {
         int n = 0;
         switch (grade) {
            case "A":
               n++;
            case "B":
               n++;
            case "C":
               n++;
            case "D":
               n++;
            case "F":
         }
         System.out.print("The number value for grade " + grade + " is " + n);
      }
         
   }
}
