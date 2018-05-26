/* Random character */

public class Ex_04_16 {

   public static void main(String[] args) {
      
      int letter = (int)(Math.random() * ((90 - 65) + 1) + 65);
      System.out.print((char)letter);
      
   }
}
