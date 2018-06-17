/* Compute the greatest common divisor  */

import java.util.Scanner;

public class Ex_05_14 {
  public static void main(String[] args) {
    // Create Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter tow integers
    System.out.print("Enter the first integer: ");
    int n1 = input.nextInt();
    System.out.print("Enter the second integer: ");
    int n2 = input.nextInt();
    input.close();

    int d = Math.min(n1, n2);
    int gcd = d;
    boolean isDone = false;
    while (!isDone) {
      if ((n1 % d == 0) && (n2 % d == 0)) {
          gcd = d;
          isDone = true;
      }
      d--;
    }

    System.out.println("The greatest common divisor for "
        + n1 + " and " + n2 + " is " + gcd);
  }
}