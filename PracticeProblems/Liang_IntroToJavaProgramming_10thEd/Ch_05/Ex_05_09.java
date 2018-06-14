/* Find the two highest score */

import java.util.Dictionary;
import java.util.Scanner;

public class Ex_05_09 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter in the number of students: ");
    int num = input.nextInt();
    Dictionary student = new Dictionary();

    for (int i = 0; i < num; i++) {
      System.out.print("Enter in the students name and score: ");
      student.add(input.next(), input.next());
    }
    input.close();

    // Check all other numbers
    int secHigh = -1;
    if (high == 0) {
       secHigh = 1;
      for (int i = 1; i < num; i++) {
        if (score[i] > secHigh)
        secHigh = i;
      }
    } else if (secHigh == num - 1) {
         secHigh = num - 2;
        for (int i = 0; i < num - 1; i++) {
          if (score[i] > secHigh)
            secHigh = i;
        }
    } else {
       secHigh = 0;
      for (int i = 0; i < num; i++) {
        if (high != i) {
          if (score[i] > secHigh) {
            secHigh = i;
          }
        }
      }
    }

    System.out.println("The 1st highest score is " + score[high] + " from " + name[high]);
    System.out.println("The 2nd highest score is " + score[secHigh] + " from " + name[secHigh]);
  }
}