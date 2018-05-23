/* Print a table */

public class Ex_02_18 {

   public static void main(String[] args) {
      
      int a1 = 1, b1 = 2;
      System.out.printf("%-7s%-7s%-7s\n", "a", "b", "pow(a,b)");
      for (; a1 < 6; a1++, b1++)
         System.out.printf("%-7s%-7s%-7s\n", a1, b1, (int)Math.pow(a1, b1));
   	                  
   }
}
