/** 
 *
 *  @author fraziermatthew
 *
 *  ![Dice Picture](https://i.v2ex.co/c5U4785Ns.png)

 *  **Dice** are small throwable objects with multiple resting positions, 
 *  used for generating random numbers. 
 *  Dice are suitable as gambling devices for games like craps and are also used in non-gambling tabletop games.
 *     
 *  In fact, mathetically, each dice can be considered as a **cube**. 
 *  In geometry, a **cube** is a three-dimensional solid object bounded by six square faces, 
 *  facets or sides, with three meeting at each vertex. 
 *     
 *  ![Cube Picture](https://i.v2ex.co/z53l2lt5s.png)
 *     
 *  ### Volume
 *  Recall that a **cube** has all edges the **same length** 
 *  (See [Cube](http://www.mathopenref.com/cube.html) definition). 
 *  The volume of a cube is found by multiplying the length of any edge by itself twice. 
 *  So if the length of an edge is `4`, the volume is `4 x 4 x 4 = 64`
 *     
 *  Or as a formula:
 *  Volume = a * a * a (where `a` is the length of any edge of the cube)
 *     
 *  ### Surface Area
 *     
 *  In words, the **surface area of a cube** is the area of the six squares that cover it. 
 *  The area of one of them is a*a. 
 *  Since these are all the same, you can **multiply one of them by six**, 
 *  so the surface area of a cube is 6 times one of the sides squared.
 *    
 *  Or as a formula:
 *  Surface Area = 6 * a * a (where `a` is the length of any edge of the cube)
 *     
 *  Objectives:
 *  1).   Calculate and return the `volume` of a cube?
 *  2).   Calculate and return the `surface area` of a cube?
 */

import java.util.Scanner;

public class Cube
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please input the length of the edge (a): ");
      double a = keyboard.nextDouble();
      double volume = calVolume(a);
      double surfaceArea = calSurface(a);
      System.out.println("The length of the edge (a) is: " + a);
      System.out.println("The volume of the cube is: " + volume);
      System.out.println("The surface area of the cube is: " + surfaceArea);
   
   }

   //   1).   Calculate and return the `volume` of a cube?
   /**
    *
    * @parm a length of one side of cube
    * @return volume of cube
    */
   public static double calVolume(double a){
      return Math.pow(a, 3);
   }
   
   //   2).   Calculate and return the `surface area` of a cube?
   /**
    *
    * @parm a length of one side of cube
    * @return surface area of cube
    */
   public static double calSurface(double a){
      return Math.pow(a, 2) * 6;
   }
}