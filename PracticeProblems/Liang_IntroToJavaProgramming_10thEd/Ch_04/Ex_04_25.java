/* Generate vehicle plate numbers */

public class Ex_04_25 {
   
   public static void main(String[] args) {
      
      int p1 = (int)(Math.random() * ((90 - 65) + 1) + 65),
          p2 = (int)(Math.random() * ((90 - 65) + 1) + 65),
          p3 = (int)(Math.random() * ((90 - 65) + 1) + 65),
          n1 = (int)(Math.random() * ((9 - 0) + 1) + 0),
          n2 = (int)(Math.random() * ((9 - 0) + 1) + 0),
          n3 = (int)(Math.random() * ((9 - 0) + 1) + 0),
          n4 = (int)(Math.random() * ((9 - 0) + 1) + 0);
          
      System.out.print((char)p1 + "" + (char)p2 + "" + (char)p3 + "" + n1 + n2 + n3 + n4);
   }
}
