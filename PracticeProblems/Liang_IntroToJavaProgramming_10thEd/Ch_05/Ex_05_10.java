/* Find numbers divisible by 5 and 6 */

public class Ex_05_10 {
  public static void main(String[] args) {
    for (int i = 100, j = 1; i <= 1000; i++) {
      if ((i % 5 == 0) && (i % 6 == 0)) {
        if (j % 10 == 0) {
          System.out.println(i + " ");
          j++;
        } else {
          System.out.print(i + " ");
          j++;
        }
      }
    }
  }
}
