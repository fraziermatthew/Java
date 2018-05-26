/* Phone key pads */

import java.util.Scanner;
public class Ex_04_15 {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a letter grade: ");
      String letter = input.next();      
      
      if ((int)letter.charAt(0) < 65 || (int)letter.charAt(0) > 90 &&
              (int)letter.charAt(0) < 97 || (int)letter.charAt(0) > 122 )
         System.out.print(letter + " is an invalid input");
      else {
         int n = 1;
         switch (letter) {
            case "W": case "X": case "Y": case "Z": case "w": case "x": case "y": case "z":
               n++;
            case "T": case "U": case "V": case "t": case "u": case "v":
               n++;
            case "P": case "Q": case "R": case "S": case "p": case "q": case "r": case "s":
               n++;
            case "M": case "N": case "O": case "m": case "n": case "o":
               n++;
            case "J": case "K": case "L": case "j": case "k": case "l":
               n++;
            case "G": case "H": case "I": case "g": case "h": case "i":
               n++;
            case "D": case "E": case "F": case "d": case "e": case "f":
               n++;
            case "A": case "B": case "C": case "a": case "b": case "c":
               n++;
         }
         System.out.print("The corresponding number is " + n);
      }
         
   }
}
