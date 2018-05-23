/* Area and perimeter of a circle */

public class Ex_01_08 {

   public static void main(String[] args) {
      
      double areaCircle = 0, perimeterCircle = 0, radiusCircle = 5.5;
      perimeterCircle = 2 * radiusCircle * pi;
      areaCircle = radiusCircle * radiusCircle * pi;
      System.out.println("Perimeter = " + perimeterCircle + ", Area = " + areaCircle);
        
   }
}
