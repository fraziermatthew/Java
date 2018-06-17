/* Display the ASCII character table */

public class Ex_05_15 {
  public static void main(String[] args) {
    int ascii = 33;
    int line = 1;
    while (ascii <= 126) {
      if (line % 10 == 0) {
        System.out.println((char)ascii + " ");
      }
      else {
        System.out.print((char)ascii);
      }
      ascii++;
      line++;
    }
  }
}