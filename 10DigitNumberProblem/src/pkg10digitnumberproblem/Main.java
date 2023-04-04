package pkg10digitnumberproblem;



import javax.swing.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numberStr = "7500000000";
        //int number = 1;
        
        int x = 0;
        while(!checkNumber(numberStr)){
        
       numberStr = newNumber(numberStr);
      x++;
      
      if(x==1000000){
          System.out.println(numberStr);
          x=0;
      }
        
        }
        
        System.out.println("--------FOUND IT----------");
        
        System.out.println(numberStr);
        
    }
    
    
    static boolean checkNumber(String number){
        boolean output = true;
        int numberOfDigits[] = {0,0,0,0,0,0,0,0,0,0};
        
        for(int i = 0; i<10; i++){
            int workingDigit = Integer.parseInt("" + number.charAt(i));
            numberOfDigits[workingDigit]++;
            
        }
        
        
        for(int i = 0; i<10; i++){
         long workingDigit = Integer.parseInt("" + number.charAt(i));
         
         if(workingDigit != numberOfDigits[i]){
             output = false;
         }
            
        }
        
        
        
        
        return output;
    }
    
    static String newNumber(String oldNumber){
        
        long numberInt = Long.parseLong(oldNumber);
        numberInt++;
        long power = (long) Math.log10(numberInt);
         //System.out.println(power);
        
         String outString ="";
         
         for (int i = 0; i<(9-power); i++){
             
            outString+="0"; 
         }
         
         outString+=""+numberInt;
         
         
        return outString;
    }
    
}


//michael is a cretin and hates everybody