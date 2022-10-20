/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//carpet
package codingolympiad;

import java.util.*;
import javax.swing.*;
/**
 *
 * @author mshep23
 */
public class CodingOlympiad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String carpetDetails = JOptionPane.showInputDialog("Please input the carpet ID string");
        
        
        char letterValues [] = new char [carpetDetails.length()];
        
        int uniqueLetters = 0;
        
        for(int i = 0; i<carpetDetails.length(); i++){
            
            letterValues[i] =  carpetDetails.charAt(i);
            boolean foundDuplicate = false;
            for(int h = 0; h<i; h++){
              //  System.out.println(letterValues[i]+ "  "+letterValues[h]);
                if(letterValues[i]==letterValues[h]){
                    foundDuplicate = true;
                    
                }
            }
            if(foundDuplicate == false){
                uniqueLetters++;
            }
        }
       
        int price = uniqueLetters*carpetDetails.length();
        System.out.println("The length of the carpet: " + carpetDetails.length());
        System.out.println("Unique colours in the carpet :" + uniqueLetters);
        System.out.println("The price is: "+price);
        
    }
    
}
