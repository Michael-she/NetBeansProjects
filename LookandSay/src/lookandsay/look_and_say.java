import java.io.*;
import java.util.*;

public class look_and_say {
	static String T_1;
	static int n;
	static String T_n;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
               
		T_1 = input.nextLine();
		n = input.nextInt();
		// YOUR CODE HERE
		
                int numbers []  = new int [10];
                
                String currentTerm = T_1;
                
                
                T_n = T_1;
                
                for(int i = 1; i <n; i++){
                   
                    for(int j = 0; j<numbers.length; j++){
                        numbers[j] = 0;
                        
                        
                    }
                    
                    char tmpOld = currentTerm.charAt(0);
                    
                    int repeats = 1;
                    String nextNum = "";
                    if((currentTerm.length()==1)){
                    
                    
                        
                        nextNum = "1" + tmpOld;
                        
                    }
                    
                    
                    
                    
                    if(!(currentTerm.length()==1)){
                        if(currentTerm.charAt(0) == currentTerm.charAt(1)){
                            
                            
                        }
                    for (int j = 1; j<currentTerm.length(); j++){
                        
                        char tmp = currentTerm.charAt(j);
                      //  System.out.println("LOOKING AT: " + tmp);
                       if(tmp == tmpOld){
                           
                           repeats++;
                         //  System.out.println("REPEAT - " + repeats);
                       }else{
                           nextNum += repeats;
                           
                           
                           
                           nextNum += tmpOld;
                           // System.out.println("REPEAT END" + repeats );
                          //   System.out.println("NEXT NUMBER" + nextNum );
                           repeats = 1;
                          
                       }
                       
                       tmpOld = tmp;
                        
                        
                        
                    }
                   nextNum+=repeats;
                    nextNum += tmpOld;
                    
                }
                
             //    System.out.println(nextNum);
                    currentTerm = nextNum;
                    T_n = nextNum;
                
                }
                
                
                
                
                
		System.out.println(T_n);
	}
}