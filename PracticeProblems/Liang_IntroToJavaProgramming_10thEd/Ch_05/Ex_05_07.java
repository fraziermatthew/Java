/* Financial application: compute future tuition */

public class Ex_05_07 {

   public static void main(String[] args) {
      
      double tuition = 10000;
      double interest = 1.05;
      for (int i = 0; i < 10; i++)
         tuition *= interest;
      double totalCost = tuition * 4;
      System.out.printf("The cost of tuition after 10 years is $%,.2f\n", tuition);
      System.out.printf("The total cost for 4 years of tuition is $%,.2f", totalCost);
   
   }
}
