/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buttons;

import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author mgshe
 */
public class buttons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          String inputLine = new Scanner(System.in).nextLine();
        
        //System.out.println(inputLine);
        
        StringTokenizer tonkenizer = new StringTokenizer(inputLine, " ");
        
        int multiplier = Integer.parseInt(tonkenizer.nextToken());
        int initial = Integer.parseInt(tonkenizer.nextToken());
        int target = Integer.parseInt(tonkenizer.nextToken());
        
        int nearestFactor = 0;
                
                int buttonPresses = 0;
                
                
                
              nearestFactor = initial;
              if(target>nearestFactor){
              
              if(target%multiplier!=0){
                  target++;
                  buttonPresses++;
                  
                  
              }
              
              
              
              while(target%(multiplier*nearestFactor)!= 0){
                  nearestFactor--;
                  
                  System.out.println(nearestFactor);
                  buttonPresses++;
              }
               System.out.println("FACTOR FOUND");
              
                while(nearestFactor!=target){
                    nearestFactor*=multiplier;
                    buttonPresses++;
                    System.out.println(nearestFactor*multiplier);
                }
                
                System.out.println(buttonPresses);
                
                }else if (target == initial){
                     System.out.println(buttonPresses);
                }else{
                    
                    buttonPresses = initial-target;
                    System.out.println(buttonPresses);
                    
                    
                }
                
    }
    
}
