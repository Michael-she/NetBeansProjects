import java.io.*;
import java.util.*;

public class older_bracelet {
	static long T;
	static long level;

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		//T = input.nextLong();
		//CODE HERE
                T =Long.parseLong("15");
               
      level = 1;
      long maxBossAttempted = 0;
      //1 4 9 16 25
      //3 5 7 9;
      
      
      
      long nextBossNum = 0;
      long currentTurn = 0;
      while(currentTurn < T){
          nextBossNum++;
          maxBossAttempted = nextBossNum*nextBossNum;
          //  System.out.println(maxBossAttempted);
          currentTurn+=maxBossAttempted;
            
          
          
          
          
      }
    
      currentTurn -= maxBossAttempted;
      level = T-currentTurn;
      
      //level--;
                
                
		System.out.println(level);
	}
}