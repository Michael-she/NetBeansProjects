/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deferentationcalculator;

import javax.swing.*;

/**
 *
 * @author Michael
 */
public class DeferentationCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String inFormula = JOptionPane.showInputDialog("Put in the formula");
        
        String terms [] = new String [50];
        int termCount = 0;
        for(int i = 0; i<inFormula.length(); i++){
           if(inFormula.charAt(i) == '+'){
               termCount++;
           } 
        }
        termCount++;
       inFormula =  inFormula.replace('+', ':');
        System.out.println(inFormula);
      terms = inFormula.split(":");
        
      
        System.out.println("TERM COUNT:" + termCount);
        for(int i = 0; i<termCount; i++){
            
            
            
            //Chain Rule
            if(terms[i].contains("x")){
                int xpos = terms[i].indexOf("x");
                int power = 1;
                int coefficant = 1;
               // System.out.println("Contains X");
                
                //Check if the x has a power notation following it
                if(terms[i].length()-1 > xpos){
                    power = Integer.parseInt(""+terms[i].charAt(xpos+2));
                   // System.out.println(power);
                    
                }
                if(xpos>0){
                    coefficant = Integer.parseInt(""+terms[i].charAt(xpos-1));
                    
                }
                
                if(power == 1 && coefficant ==1){
                    terms[i] = "1";
                    
                }
                else  if(power == 1){
                    terms[i] = coefficant+"";
                }
                else {
                    terms [i] = (power*coefficant)+"x^"+(power-1);
                }
                System.out.println("HERE"); 
               
            }else{
                terms[i] = ""+0;
            }
            
            if(!terms[i].isBlank()){
            System.out.println(terms[i]);
            }
        }
        
        // TODO code application logic here
    }
    
}
