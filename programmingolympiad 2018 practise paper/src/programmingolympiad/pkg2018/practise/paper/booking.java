/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package programmingolympiad.pkg2018.practise.paper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author mgshe
 */
public class booking {
    public static void main(String[] args) throws IOException {
        
               InputStreamReader isr = new InputStreamReader(System.in);
               BufferedReader br = new BufferedReader(isr);
               
              
               String inStr = br.readLine();
               
               String numbers []= inStr.split(" ");
                
               long  numPeople =  Long.parseLong(numbers[0]);
                       long numParties = Integer.parseInt(numbers[1]);
                       
                       
                       for(int i = 0; i<numParties; i++){
                           
                           String nextLine = br.readLine();
                          
                           numbers = nextLine.split(" ");
                           
                           long min = Long.parseLong(numbers[0]);
                           long max = Long.parseLong(numbers[1]);
                           
                           
                           
                           long upperLimit = numPeople/min ;
                           long lowerLimit ;
                           
                           
                           if( numPeople%max != 0 ){
                               
                               lowerLimit= numPeople/max+1 ;
                           }else{
                               lowerLimit= numPeople/max;
                           }
                           
                          // long currentDiff = (upperLimit-lowerLimit)/2;
                           
                           long currentEstimate = lowerLimit;
                                   
                          // System.out.println(min + "    "+ numPeople/currentEstimate+ "    "+max);
                           
                           boolean minRoomsFound = false;
                           if(numPeople/currentEstimate<=max && numPeople/currentEstimate>=min){
                               //System.out.println("Passed");
                                minRoomsFound = true;
                                
                                
                                long oldRemainder =   ( numPeople%currentEstimate);
                                long currentExp = 1000000000;
                               
                                long newRemainder= oldRemainder+1;
                                
                                boolean firstRun = true;
                           while(numPeople%currentEstimate !=0){
                               //System.out.println("Current off" +numPeople%currentEstimate);
                               if(firstRun && numPeople>currentExp){
                                   firstRun = false;
                               for(int j = 0; j<10; j++){
                                   oldRemainder =   numPeople/currentEstimate;
                                   newRemainder= oldRemainder;
                                  // System.out.println("OLD  "+oldRemainder+" NEW  "+newRemainder);
                               while(oldRemainder==newRemainder){
                                   
                                   currentEstimate+=currentExp;
                                   // System.out.println("Hunting "+currentEstimate+" --- Current EXP: "+currentExp+" OLD  "+oldRemainder+" NEW  "+newRemainder);
                                   oldRemainder = newRemainder;
                                   newRemainder = numPeople/currentEstimate;
                                  if(currentExp == 0){
                                      break;
                                  }
                                   
                               }
                               currentEstimate-=currentExp;
                               
                               currentExp/=10;
                               
                               }}
                               currentEstimate++;
                              // System.out.println("Hunting "+currentEstimate);
                               
                               if(numPeople/(currentEstimate*1.0)>max ||numPeople/(currentEstimate*1.0)<min ){
                                   minRoomsFound = false;
                                  // System.out.println("break");
                                   break;
                                   
                               }
                           }}
                           
                           if(minRoomsFound){
                               System.out.println(currentEstimate);
                           }
                           else{
                               System.out.println(-1);
                           }
                           
                           
                           
                           
                           
                       }
                       
                        
        
                       
                
    }
}
