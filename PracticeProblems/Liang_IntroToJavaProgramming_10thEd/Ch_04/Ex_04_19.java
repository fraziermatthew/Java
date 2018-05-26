/* Business: check ISBN-10 */

import java.util.Scanner;
public class Ex_04_19 {
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the first 9 digits of an ISBN as integer: ");
      
      String isbn = input.next();
      int isbnInt = Integer.parseInt(isbn);
      int d9 = (isbnInt / 1) % 10,
          d8 = (isbnInt / 10) % 10,
          d7 = (isbnInt / 100) % 10,
          d6 = (isbnInt / 1000) % 10,
          d5 = (isbnInt / 10000) % 10,
          d4 = (isbnInt / 100000) % 10,
          d3 = (isbnInt / 1000000) % 10,
          d2 = (isbnInt / 10000000) % 10,
          d1 = (isbnInt / 100000000) % 10,
          checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
                      d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
      
      if (checksum == 10)
         System.out.println("The ISBN-10 number is " + isbn + "X");
      else
         System.out.println("The ISBN-10 number is " + isbn + "" + checksum);
         
   }
}
