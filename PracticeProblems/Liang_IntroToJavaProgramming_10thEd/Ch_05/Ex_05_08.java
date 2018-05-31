/* Find the highest score */

import java.util.Scanner;
public class Ex_05_08 {

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
      
      int max = score[0];
      for (int j = 0; j < score.length; j++) 
         if (score[j] > max)
            max = j;
      
      System.out.println(name[max]);
      System.out.println(score[max]);
   }
}
