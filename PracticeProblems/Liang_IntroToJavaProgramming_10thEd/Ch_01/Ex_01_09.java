/* Area and perimeter of a rectangle */

public class Ex_01_09 {

   public static void main(String[] args) {
      
      double areaRectangle = 0, perimeterRectangle = 0, widthRectangle = 4.5, heightRectangle = 7.9;
      perimeterRectangle = widthRectangle * 2 + heightRectangle * 2;
      areaRectangle = widthRectangle * heightRectangle;
      System.out.println("Perimeter = " + perimeterRectangle + ", Area = " + areaRectangle);
        
   }
}
