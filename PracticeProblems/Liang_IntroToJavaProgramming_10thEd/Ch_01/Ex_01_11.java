/* Population projection */

public class Ex_01_11 {

   public static void main(String[] args) {
      
      secPerYear = 365 * 24 * 60 * 60;
      long currentPop = 312032486, birth = secPerYear/7, immigrant = secPerYear/45, death = secPerYear/13;
      System.out.println("The 5 year population is " + (currentPop + 5 * (birth - death + immigrant)) );
        
   }
}
