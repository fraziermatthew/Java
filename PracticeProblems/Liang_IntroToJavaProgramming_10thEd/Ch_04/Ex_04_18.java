/* Student major and status */

import java.util.Scanner;
public class Ex_04_18 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter two characters: ");
      String ms = input.next(), 
         major = "",
         status = "";
      
      if (ms.charAt(0) == 'M')
         major = "Mathematics";
      else if (ms.charAt(0) == 'C')
         major = "Computer Science";
      else if (ms.charAt(0) == 'I')
         major = "Information Technology";
      
      if (ms.charAt(1) == '1')
         status = "Freshman";
      else if (ms.charAt(1) == '2')
         status = "Sophomore";
      else if (ms.charAt(1) == '3')
         status = "Junior"; 
      else if (ms.charAt(1) >= '4')
         status = "Senior"; 
         
      if (major == "")  
         System.out.print("Invalid input");
      else
         System.out.print(major + ' ' + status);
         
   }
}
