import java.util.Scanner;

public class Ex_03_13 {

   public static void main(String[] args) {
   
      /* Financial application: compute taxes */
      // Create Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt the user to enter filing status
      System.out.print("(0-single filer, 1-married jointly or " +
         "qualifying widow(er), 2-married separately, 3-head of " + 
         "household) \nEnter the filing status: ");
         
      int status = input.nextInt();
      
      // Prompt the user to enter taxable income
      System.out.print("Enter the taxable income: ");
      double income = input.nextDouble();
      
      // Compute tax
      double tax = 0;
      
      if (status == 0) {
         if (income <= 9325)
            tax = income * 0.10;
         else if (income <= 37950)
            tax = 9325 * 0.10 + (income - 9325) * 1.5;
         else if (income <= 91900)
            tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
               (income - 37950) * 0.25;
         else if (income <= 191650)
            tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
               (88250 - 37950) * 0.25 + (income - 91900) * 0.28;
         else if (income <= 416700)
            tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
               (88250 - 37950) * 0.25 + (191650 - 91900) * 0.28 + 
               (income - 191650) * 0.33;
         else if (income <= 418400)
            tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
               (88250 - 37950) * 0.25 + (191650 - 91900) * 0.28 + 
               (416700 - 191650) * 0.33 + (income - 416700) * 0.35;
         else
            tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
               (88250 - 37950) * 0.25 + (191650 - 91900) * 0.28 + 
               (416700 - 191650) * 0.33 + (418400 - 416700) * 0.35 + 
               (income - 418400) * 0.396;
      }
      else if (status == 1) {
         if (income <= 18650)
            tax = income * 0.10;
         else if (income <= 75900)
            tax = 18650 * 0.10 + (income - 18650) * 1.5;
         else if (income <= 153100)
            tax = 18650 * 0.10 + (75900 - 18650) * 0.15 +
               (income - 75900) * 0.25;
         else if (income <= 233350)
            tax = 18650 * 0.10 + (75900 - 18650) * 0.15 +
               (88250 - 75900) * 0.25 + (income - 153100) * 0.28;
         else if (income <= 416700)
            tax = 18650 * 0.10 + (75900 - 18650) * 0.15 +
               (88250 - 75900) * 0.25 + (233350 - 153100) * 0.28 + 
               (income - 233350) * 0.33;
         else if (income <= 470000)
            tax = 18650 * 0.10 + (75900 - 18650) * 0.15 +
               (88250 - 75900) * 0.25 + (233350 - 153100) * 0.28 + 
               (416700 - 233350) * 0.33 + (income - 416700) * 0.35;
         else
            tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
               (88250 - 37950) * 0.25 + (191650 - 91900) * 0.28 + 
               (416700 - 191650) * 0.33 + (470000 - 416700) * 0.35 +
               (income - 470000) * 0.396;
      }
      else if (status == 2) {
         if (income <= 9325)
            tax = income * 0.10;
         else if (income <= 37950)
            tax = 9325 * 0.10 + (income - 9325) * 1.5;
         else if (income <= 76550)
            tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
               (income - 37950) * 0.25;
         else if (income <= 116675)
            tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
               (88250 - 37950) * 0.25 + (income - 76550) * 0.28;
         else if (income <= 208350)
            tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
               (88250 - 37950) * 0.25 + (116675 - 76550) * 0.28 + 
               (income - 116675) * 0.33;
         else if (income <= 235350)
            tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
               (88250 - 37950) * 0.25 + (116675 - 76550) * 0.28 + 
               (208350 - 116675) * 0.33 + (income - 208350) * 0.35;
         else
            tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
               (88250 - 37950) * 0.25 + (191650 - 91900) * 0.28 + 
               (208350 - 191650) * 0.33 + (235350 - 208350) * 0.35 +
               (income - 235350) * 0.396;
      }
      else if (status == 3) {
         if (income <= 13350)
            tax = income * 0.10;
         else if (income <= 50800)
            tax = 13350 * 0.10 + (income - 13350) * 1.5;
         else if (income <= 153100)
            tax = 13350 * 0.10 + (50800 - 13350) * 0.15 +
               (income - 50800) * 0.25;
         else if (income <= 212500)
            tax = 13350 * 0.10 + (50800 - 13350) * 0.15 +
               (88250 - 50800) * 0.25 + (income - 153100) * 0.28;
         else if (income <= 416700)
            tax = 13350 * 0.10 + (50800 - 13350) * 0.15 +
               (88250 - 50800) * 0.25 + (212500 - 153100) * 0.28 + 
               (income - 212500) * 0.33;
         else if (income <= 444550)
            tax = 13350 * 0.10 + (50800 - 13350) * 0.15 +
               (88250 - 50800) * 0.25 + (212500 - 153100) * 0.28 + 
               (416700 - 212500) * 0.33 + (income - 416700) * 0.35;
         else
            tax = 9325 * 0.10 + (37950 - 9325) * 0.15 +
               (88250 - 37950) * 0.25 + (191650 - 91900) * 0.28 + 
               (416700 - 191650) * 0.33 + (444550 - 416700) * 0.35 +
               (income - 444550) * 0.396;
      }
      else  {
         System.out.println("Error: invalid status");
         System.exit(1);
      }
      
      // Display the result
      System.out.println("Tax is " + (int)(tax * 100) / 100.0);
   }
}
