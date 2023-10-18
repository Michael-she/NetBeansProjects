/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author mgshe
 */
public class NewClass {
     public static void main(String[] args) {
        // TODO code application logic here
        
        int multiplier = 2;
        int initial = 4;
        int target = 6;
        
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
                  
                  System.out.println(nearestFactor*multiplier);
                  buttonPresses++;
              }
              
              
                while(nearestFactor!=target){
                    nearestFactor*=multiplier;
                    buttonPresses++;
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
