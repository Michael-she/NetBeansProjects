package javaapplication11;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package javaapplication11;

import java.io.InputStream;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author mgshe
 */



public class lightsabre {
    
    static long numArmour;
    static long numbreaks;
    public static void main(String [] args){
        
        
        for(int i = 2; i<10; i++){
            for(int j = 2; j<10; j++){
        
               // System.out.println(i+" "+j);
      //Scanner inputLine = new Scanner(System.in);
        
        
        
        
        
        
       numArmour = i-1;//inputLine.nextLong();//Integer.parseInt(JOptionPane.showInputDialog(""));
         numbreaks = j; //inputLine.nextLong();//Integer.parseInt(JOptionPane.showInputDialog("numbreask"));
         
         int other = other();
        long ogNumBreaks = numbreaks;
         long ogNumArmour = numArmour;
         
         int attempts = 0;
        
        
         while(numbreaks>1 && numArmour>2){
             
             
             
             numArmour= (numArmour)/2;
             //System.out.println(numArmour +"   "+numbreaks);
             
             numbreaks--;
             attempts++;
            
         }
//         System.out.println("NEW");
//          System.out.println(numArmour +"   "+numbreaks);
//          System.out.println("----");
         while(numbreaks > 1 && numArmour>1){
             
             
            
             
                 numArmour= (numArmour)*2/3;
             
             if(numArmour%2 ==0){
                  numArmour--;
             }
          //System.out.println(numArmour +"   "+numbreaks);
             attempts++;
            // numbreaks--;
            // System.out.println(numArmour);
             
             
         }
         
         
         
          //System.out.println(numArmour);
        
         //attempts++;
         if(numArmour>2){
           //  attempts--;
         }
        
         attempts+=numArmour;
         
         
         if(other!=attempts){
             System.out.println("------");
             System.out.println(attempts+"   "+other);
             System.out.println(ogNumArmour+"   "+ogNumBreaks);
             System.out.println(numArmour);
         }
         
         //return 0;
    }}}
    
    
   

   static int other(){
       
     long numArmourOther = numArmour;
long numbreaksOther = numbreaks;
    
        
        
        
        
      //Scanner inputLine = new Scanner(System.in);
        
        
        
        
        
        
       //numArmourOther = inputLine.nextLong();//Integer.parseInt(JOptionPane.showInputDialog(""));
        // numbreaksOther =  inputLine.nextLong();//Integer.parseInt(JOptionPane.showInputDialog("numbreask"));
        long ognumbreaksOther = numArmourOther;
         
         
         int attempts = 0;
        
         if(numbreaksOther == 1){
             System.out.println(numArmourOther);
         }else{
         
         while(numbreaksOther > 1 && numArmourOther>0){
             
             
             if(ognumbreaksOther < numbreaksOther *2/3){
                 numArmourOther= (numArmourOther)/2;
             }
             else{
                 numArmourOther= (numArmourOther)*2/3;
             }
             if(numArmourOther%2 ==0){
                  numArmourOther--;
             }
            
             attempts++;
            // numbreaksOther--;
            // System.out.println(numArmourOther);
             
             
         }
         
         
         
          //System.out.println(numArmourOther);
        
         //attempts++;
        // attempts+=numArmourOther;
         //System.out.println(attempts);
         
         
    }
   
   return attempts;
   
   }
    }
          


