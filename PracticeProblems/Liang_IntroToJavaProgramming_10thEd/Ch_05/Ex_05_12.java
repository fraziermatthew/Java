/* Find the smallest n such that n^2 > 12,000  */

public class Ex_05_12 {
  public static void main(String[] args) {
    int n = 0;
    boolean isDone = false;
    while (!isDone) {
      n++;
      if (Math.pow(n, 2) > 12000) {
        isDone = true;
      }
    }
    System.out.println(n);
  }
}