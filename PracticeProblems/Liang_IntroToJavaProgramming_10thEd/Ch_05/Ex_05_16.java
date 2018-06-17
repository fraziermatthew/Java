/* Find the factors of an integer */

import java.util.Scanner;

public class Ex_05_17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a integer greater than 0: ");
    int n = input.nextInt();
    input.close();
    int i = 2;
    while (n / i != 1) {
      if (n % i == 0) {
        System.out.print(i + ", ");
        n /= i;
      } else {
        i++;
      }
    }
  }
}