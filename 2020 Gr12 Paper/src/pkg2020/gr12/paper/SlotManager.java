/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2020.gr12.paper;

import java.io.*;
import java.util.*;

/**
 *
 * @author mgshe
 */
public class SlotManager {
    int clientCount = 0;
    Client  cArr [] = new Client[20];
    int counsellorCount = 0;
    TimeSlot tArr [] = new TimeSlot[40];
    
    int timeslotCount = 0;
    public SlotManager(){
        try{
        Scanner ScFile = new Scanner(new File("clients.txt"));
        while(ScFile.hasNextLine()){
            String nameTmp = ScFile.nextLine();
            String preferredCounsellor= ScFile.nextLine();
            int preferedTimeSlotTmp = Integer.parseInt(ScFile.nextLine());
            cArr[clientCount] = new Client(nameTmp, preferredCounsellor, preferedTimeSlotTmp);
            clientCount++;
        }
        
        ScFile.close();
        
        }catch(FileNotFoundException e){
            System.out.println("The file was not found..."+e);
        }
    }
    
    
    public String displayAllClients(){
        String returnStr = "";
        
        for(int i = 0; i<clientCount; i++){
            returnStr += cArr[i].toString()+"\n";
            
        }
        
        return returnStr;
    }
    
    public void generateTimeSlots(){
        try{
        Scanner scFile = new Scanner(new File("counsellors.txt")).useDelimiter(",");
        
        while(scFile.hasNext()){
            String counsellorName = scFile.next();
            System.out.println(counsellorName);
                    
            for(int i = 0; i < 9; i++){
                if(i!= 4){
                tArr[timeslotCount] = new TimeSlot(counsellorName, 8+i);
                timeslotCount++;
                        }
            }
            
        }
        
        
        }catch (FileNotFoundException e){
            
            System.out.println("The file was not found");
        }
    }
    
    public String displayAvailableTimeSlots(){
        String returnStr = "";
        
        for(int i = 0; i<timeslotCount; i++){
            
            returnStr+= tArr[i].toString()+"\n";
            
        }
        
        
        return returnStr;
    }
    
    
    public String createBookedSlotArray(){
        String returnString = "Appointments:\n";

        for(int i = 0; i<clientCount; i++){
            
            Client c = cArr[i];
            
            String preferredCounsellor = c.getPreferredCounsellor();
            
            boolean booked = false;
             System.out.println(c);
            for(int j = 0; j<timeslotCount; j++){
                
                
                if(tArr[j].getCounsellor().equals(preferredCounsellor)){
                    System.out.println("\t"+tArr[j] +"Sesstion start "+ tArr[j].getStartHour() +"\t User earliest: "+c.getEarliestHour());
                    
                    if(tArr[j].getStartHour()>=c.getEarliestHour()){
                        
                    if(tArr[j].getIsAvailable()){
                    System.out.println(tArr[j]);
                    }
                    if(tArr[j].getIsAvailable() && !booked){
                    tArr[j].bookSlot();
                    returnString += c.getClientName() +"("+c.getEarliestHour()+") to see "+tArr[j].toString()+"\n";
                    System.out.println("\t\t MATCH FOUND");
                    booked = true;
                    }
                    else{
                        System.out.println("Skipped");
                    }
                }}
                
               
                
            }
            
             if(!booked){
                    System.out.println("Failed");
                }
        }

        return returnString;        
    }
    
    
}
