/* Conversion from miles to kilometers and kilometers to miles */

public class Ex_05_06 {

   public static void main(String[] args) {
      
      int num = 10;
      System.out.printf("%-15s%-15s|  %-15s%-15s\n", "Miles","Kilometers", "Kilometers", "Miles");
      for (double i = 1, j = 20; i <= num; i++, j+=5) 
         System.out.printf("%-15d%-15.3f|  %-15d%-15.3f\n", (int)i, i*1.609, (int)j, j/1.609);

   }
}
