/* Count positive and negative numbers and compute the average of numbers */

import java.util.Scanner;

public class Ex_05_01 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer, the input ends if it is 0: ");
      int countPos = 0, countNeg = 0, n = input.nextInt();
      double total = 0, avg = 0;
      
      if (n == 0)
         System.out.print("No numbers are entered except 0");
      else {
         while (n != 0) {
            total += n;
            if (n > 0)
               countPos++;
            if (n < 0)
               countNeg++;
            n = input.nextInt();
         }
         
         avg = total / (countPos + countNeg);
         
         System.out.println("The number of positives is " + countPos);
         System.out.println("The number of negatives is " + countNeg);
         System.out.println("The total is " + total);
         System.out.println("The average is " + avg);

         input.close();
      }
   }
}
