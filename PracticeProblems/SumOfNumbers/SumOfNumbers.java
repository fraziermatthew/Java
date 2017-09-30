import java.util.Scanner;
public class SumOfNumbers{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Please input n1: ");
      int n1 = input.nextInt();
      System.out.print("Please input n2: ");
      int n2 = input.nextInt();
      
      if (n1 < 0 || n2 < 0){
         System.out.print("Output: Invalid input");
      }
      else{
         int sum = 0;
         for(int i = 1; i <= n1; i += n2){
            sum += i;
         }
         System.out.print("Output: " + sum);
      }
   }
}