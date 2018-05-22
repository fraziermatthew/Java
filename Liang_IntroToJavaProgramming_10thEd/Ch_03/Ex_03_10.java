import java.util.Scanner;
public class Ex_03_10 {
   public static void main(String[] args) {
      
   	// 1. Generate two random numbers under 100
      int   number1 = (int)(Math.random() * 100), 
            number2 = (int)(Math.random() * 100);
            
      // 2. Prompt the student to answer "What is numer1 + number2?"            
      System.out.println("What is " + number1 + " + " + number2 + "?");
      Scanner input = new Scanner(System.in);
      int answer = input.nextInt();
      
      // 3. Grade the answer and display the result
      if (number1 + number2 == answer)
         System.out.println("You are correct!");
      else {
         System.out.println("Your answer is wrong.");
         System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
      }
   }
}
