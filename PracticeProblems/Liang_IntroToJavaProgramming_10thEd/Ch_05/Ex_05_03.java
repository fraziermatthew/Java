/* Conversion from kilograms to pounds */

public class Ex_05_03 {

   public static void main(String[] args) {
      
      int num = 199;
      System.out.printf("%-10s%-10s\n", "Kilograms","Pounds");
      for (double i = 1; i < num; i++) 
         System.out.printf("%-10d%-10.1f\n", (int)i, i*2.2);

   }
}
