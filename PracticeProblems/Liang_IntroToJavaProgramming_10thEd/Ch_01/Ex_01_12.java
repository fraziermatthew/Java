/* Average speed in kilometers */

public class Ex_01_12 {

   public static void main(String[] args) {
      
		double avgSpeed = ( 24 / (1 + (40 + 35.0 / 60) / 60) * 1.6 );
		System.out.println("The runner ran " + avgSpeed + " kilometers per hour");
        
   }
}
