/**
 *
 *  @author fraziermatthew
 *  
 *  This program will download a `number.txt` file from a remote server
 *  and then load the data into an array named `numbers`.
 *  
 *  If we use the index of each element as **x** value and 
 *  use the value of each element as **y** value and plot a figure, it shows something like this:
 *  ![Plot](https://i.v2ex.co/G88QDHXZl.png)
 *  
 *  The element value inside this array is initially **increasing** until reaches the maximum, then **decreasing**. 
 *  
 *  Objectives:
 *  1).   What's the **summation of all elements** of this array?
 *  2).   What's the **average value of all elements** of this array? 
 *  3).   What's the **Peak element's value (largest element's value)** of this figure?
 *  4).   What's the **Peak element's index (largest element's index)** of this figure? 
 *  5).   How many elements are at the **increasing side (include the peak element)** of this figure?
 *  6).   How many elements are at the **decreasing side (include the peak element)** of this figure? 
 */

import java.net.*;
import java.util.Scanner;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.util.regex.*;

public class PeakPoint
{
   public static void main(String[] args)
   {
      double[] numbers = new double[7564];
   
      /* download and save tmp.txt from a remote server
         load the data into number array */
      try{
         URL website = new URL("https://www.cs.wcupa.edu/schen/csc142/number.txt");
         ReadableByteChannel rbc = Channels.newChannel(website.openStream());
         FileOutputStream fos = new FileOutputStream("number.txt");
         fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
         Scanner dataFile = new Scanner(new File("number.txt"));
         int count = -1;
         while(dataFile.hasNext()){
            numbers[++count] = Double.parseDouble(dataFile.nextLine());
         }
      }
      catch(Exception ex){
         System.out.println(ex);
         System.out.println("You got an error, File not found on server");
      }
      
      //   1).   What's the **summation of all elements** of this array?
      long sum = 0;
      for(int i = 0; i< numbers.length; i++){
         sum += numbers[i]; // Add each element of the array
      }
      System.out.printf("Summation of all elements of this array: %,d\n", sum);
      
      //   2).   What's the **average value of all elements** of this array?
      double avg = (double)(sum) / numbers.length;
      System.out.printf("Average value of all elements of this array: %,f\n", avg);
      
      //   3).   What's the **Peak element's value (largest element's value)** of this figure?
      //   4).   What's the **Peak element's index (largest element's index)** of this figure?
      //   5).   How many elements are at the **increasing side (include the peak element)** of this figure?
      //   6).   How many elements are at the **decreasing side (include the peak element)** of this figure?
      for (int i = 1; i < numbers.length; i++){
         if (numbers[i] < numbers[i - 1]){
            // Reached the peak (starting to decline)
            System.out.printf("Peak element's value (largest element's value): %,.1f\n" + 
               "Peak element's index (largest element's index): %,d\n" +
               "Number of elements on the increasing side (including the peak element) of this figure: %,d\n" + 
               "Number of elements on the decreasing side (including the peak element) of this figure: %,d\n", 
               numbers[i - 1], i - 1, i, numbers.length - i + 1);
            break;
         }
      }   
   }
}

