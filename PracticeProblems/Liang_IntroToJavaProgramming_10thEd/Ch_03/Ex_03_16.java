/* Random point */

public class Ex_03_16 {

   public static void main(String[] args) {
   
      // Display a random coordinate in a rectangle
      // (Math.random() * max - min) + min
      int x = (int)(Math.random() * 101) - 50, y = (int)(Math.random() * 201) - 100;
      
      System.out.println("Random coordinate is x = " + x + " and y = " + y);
      
   }
}
