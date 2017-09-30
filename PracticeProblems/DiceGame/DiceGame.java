public class DiceGame{
   public static void main(String[] args){
      String winner;
      int Awins = 0, Bwins = 0, count = 0;
      
      while ((Awins < 2) && (Bwins < 2)){
         int k1, k2;
         k1 = (int)(Math.random() * 6) + 1;
         k2 = (int)(Math.random() * 6) + 1;
         String M = (k1 >= k2) ? Integer.toString(k1) + Integer.toString(k2) : 
                                 Integer.toString(k2) + Integer.toString(k1);
         System.out.println("Player 1 rolls: " + k1 + ", " + k2 + ", the highest number is " + M);
      
         int k3, k4;
         k3 = (int)(Math.random() * 6) + 1;
         k4 = (int)(Math.random() * 6) + 1;
         String N = (k3 >= k4) ? Integer.toString(k3) + Integer.toString(k4) : 
                                 Integer.toString(k4) + Integer.toString(k3);
         System.out.println("Player 2 rolls: " + k3 + ", " + k4 + ", the highest number is " + N);
      
         if (Integer.parseInt(M) > Integer.parseInt(N)){
            winner = "player A wins";
            Awins++;
         }
         else if(Integer.parseInt(N) > Integer.parseInt(M)){
            winner = "player B wins";
            Bwins++;
         }
         else{
            winner = "draw";
         }
         System.out.println("Result: " + winner);
      }
   }
}