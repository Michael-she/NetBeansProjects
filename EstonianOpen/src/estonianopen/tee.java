/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estonianopen;

import java.util.Scanner;

/**
 *
 * @author mgshe
 */
public class tee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scIn = new Scanner(System.in).useDelimiter(" ");
        
        double heatEnergy = Double.parseDouble(scIn.next());
        double heatTime = Double.parseDouble(scIn.next());  //The numbber of seconds needed to heat by one degree
        
        double heatCost = Double.parseDouble(scIn.next());
        
        double degreesLost = Double.parseDouble(scIn.next())/60.0; //number of degrees cooled in one Second;
        
        
        heatTime = -1/heatTime; //Convert to degrees per second
        
        
        heatCost *= 60;
        
        System.out.println(Math.round(heatCost*100)/100.0);
                
        
        double heatUpCost = heatEnergy/heatTime;
        
        double currentCooldownTempreature = 0;
        
        double currentHeatUpTempreature = 0;
        
        
        
        double c2 = (100-(heatUpCost*3600)) -100 ;
        
        //System.out.println(c2);
        //System.out.println(((heatTime-degreesLost)*1.0));
        
        double intpt = c2/((degreesLost-heatTime)*1.0);
        
        //System.out.println(intpt);
        
        double ycord = (100-(heatUpCost*3600)+(heatUpCost*intpt));
        
        
        
        
        if(ycord<22){
            
            System.out.println((100-22)*heatEnergy);
            
            
        }else{
            
            System.out.println(Math.abs((100-ycord)*heatEnergy));
            
        }
        
        
    }
    
}
