/* Find the largest n such that n^3 < 12,000  */

public class Ex_05_13 {
  public static void main(String[] args) {
    int n = 0;
    boolean isDone = false;
    while (!isDone) {
      n++;
      if (Math.pow(n, 3) > 12000) {
        isDone = true;
      }
    }
    System.out.println(n - 1);
  }
}