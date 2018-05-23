/* Game: add three numbers */

import java.util.Scanner;
public class Ex_03_02 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      int n1 = (int)(System.currentTimeMillis() % 10), 
          n2 = (int)(System.currentTimeMillis() / 7 % 10), 
          n3 = (int)(System.currentTimeMillis() / 9 % 10);
      
      System.out.println("What is " + n1 + " + " + n2 + " + " + n3);
      
      int answer = input.nextInt();
      System.out.println(n1 + " + " + n2 + " + " + n3 + 
         " = " + answer + " is " + (n1 + n2 + n3 == answer) );
      
   }
}
