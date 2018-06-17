/* Display pyramid */

import java.util.Scanner;

public class Ex_05_17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of lines: ");
    int lines = input.nextInt();
    input.close();
    int i = 1;
    while (i < lines) {
      System.out.println();
      i++;
    }
  }
}