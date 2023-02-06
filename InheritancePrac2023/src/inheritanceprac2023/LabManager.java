/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceprac2023;

import java.util.*;
import java.io.*;
/**
 *
 * @author Michael
 */
public class LabManager {
   
        
         Culture labCultures[] = new Culture[200];
        private int size = 0;
        
        public LabManager(){
            try{
            Scanner scFile = new Scanner(new File("samples.txt"));
            
            while(scFile.hasNextLine()){
                String fileLine = scFile.nextLine();
                String tokenArray[] = fileLine.split("#");
                
                double bioMass = Double.parseDouble(tokenArray[0]);
                double nutrients = Double.parseDouble(tokenArray[1]);
                String batchNumber = tokenArray[2];
                
                if(tokenArray.length == 3){
                    labCultures[size] = new Culture(bioMass, nutrients, batchNumber);
                    
                }else{
                    String product = tokenArray[3];
                    labCultures[size]  = new GMCulture(bioMass, nutrients, batchNumber, product);
                }
                
                
                size++;
            }
            scFile.close();
            }
            catch(FileNotFoundException e){
                System.out.println("You are a dumbass who cant find the file");
            }
        }
        
  
    public String toString(){
    String outStr = "";
        
        for(int i = 0; i<size; i++){
         
         outStr +=  labCultures[i] + "\n";
         
     }   
    return outStr;
}
    
    
    public int CountGM(){
        int GMCount = 0;
        
        for(int i = 0 ; i<size; i++){
            
            if(labCultures[i] instanceof GMCulture){
                
                
            }
            
            
        }
        return 0;
        
}
}
