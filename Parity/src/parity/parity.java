import java.io.*;
import java.util.*;

public class parity {
	static int N;
	static ArrayList<Integer> odds = new ArrayList<>();
   static ArrayList<Integer> evens = new ArrayList<>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		// YOUR CODE HERE
                
                
                
                
		for (int i = 1; i<=N; i++){
                    if(i%2 == 0){
                        evens.add( i);
                       // System.out.println("EVEN");
                        
                    }
                    else{
                        
                        odds.add(i);
                        //oddCounter ++;
                    }
                                     
                }
                
		for (int _i = 0; _i < odds.size(); _i++) {
			System.out.print(odds.get(_i));
			System.out.print(_i == odds.size()-1 ? '\n' : ' ');
		}
      
      for (int _i = 0; _i < evens.size(); _i++) {
			System.out.print(evens.get(_i));
			System.out.print(_i == evens.size()-1 ? '\n' : ' ');
		}

	}
}