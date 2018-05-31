/* Find the two highest score */

import java.util.Scanner;
public class Ex_05_09 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter in the number of students: ");
      int num = input.nextInt();
      int[] score = new int[num];
      String[] name = new String[num];
      
      for (int i = 0; i < num; i++) {
         System.out.print("Enter in the students name: ");
         name[i] = input.next();
         System.out.print("Enter in the students score: ");
         score[i] = input.nextInt();
      }
      
      if (num == 1) {
         System.out.println("Only one person entered");
         System.out.println(name[0]);
         System.out.println(score[0]);
      }
      
      
   }
}
