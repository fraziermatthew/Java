/* Conversion from miles to kilometers */

public class Ex_05_03 {

   public static void main(String[] args) {
      
      int num = 10;
      System.out.printf("%-10s%-10s\n", "Miles","Kilometers");
      for (double i = 1; i <= num; i++) 
         System.out.printf("%-10d%-10.3f\n", (int)i, i*1.609);

   }
}
