/* Conversion from kilograms to pounds and pounds to kilograms */

public class Ex_05_05 {

   public static void main(String[] args) {
      
      int num = 199;
      System.out.printf("%-10s%-10s|  %-10s%-10s\n", "Kilograms","Pounds", "Pounds", "Kilograms");
      for (double i = 1, j = 20; i <= num; i+=2, j+=5) 
         System.out.printf("%-10d%-10.1f|  %-10d%-10.2f\n", (int)i, i*2.2, (int)j, j/2.2);

   }
}
