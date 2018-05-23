/* Algebra: solve 2 X 2 linear equations */

public class Ex_01_13 {

   public static void main(String[] args) {
      
		double a = 3.4, b = 50.2, e = 44.5, c = 2.1, d = 0.55, f = 5.9, x, y;
		x = (e*d - b*f) / (a*d - b*c);
		y = (a*f - e*c) / (a*d - b*c);
		System.out.println("x = " + x + ", y = " + y);
        
   }
}
