/* Print a table */

public class Ex_01_04 {

   public static void main(String[] args) {
      
      int num = 5;
      System.out.printf("%-7s%-7s%-7s\n", "a","a^2","a^3");
      for (int i = 1; i < num; i++) 
         System.out.printf("%-7d%-7d%-7d\n", i, i*i, i*i*i);
   	
   }
}
