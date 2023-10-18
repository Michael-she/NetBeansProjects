/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalexampractise1;

import com.sun.tools.javac.Main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author mgshe
 */
public class MantainanceManager {
 
    
    Handyman hArray[] = new Handyman[30];
    int numHandymen = 0;
    private Booking bookArr[] = new Booking[100];
    private int bookingCounter = 0;
    
    
    public MantainanceManager() {
        try{
            Scanner scFile = new Scanner(new File("handyman.txt"));
            
            while(scFile.hasNextLine()){
                
                String hmanStr[] = scFile.nextLine().split(",");
                
                if(hmanStr.length == 4){
                    
                   hArray[numHandymen] =  new CertHandyman(Integer.parseInt(hmanStr[0]), hmanStr[1], hmanStr[2], hmanStr[3] );
                    
                }if(hmanStr.length == 3){
                    
                    hArray[numHandymen] = new Handyman(Integer.parseInt(hmanStr[0]), hmanStr[1], hmanStr[2]);
                    
                }
                
                
                numHandymen++;
                
                
            }
            
            
            
            
            
        }catch (FileNotFoundException e){
            
            
            System.out.println("The file was not found");
        }
        
        
    }
    
    
    
    
    public String listAllHM(){
        
        
        String returnStr = "";
        
        for(int i = 0; i<numHandymen; i++){
            returnStr += hArray[i].toString() + "\n";
            
        }
        
        return returnStr;
    }
    
    
    public Handyman findHM(int staffID){
        
        for(int i = 0; i<numHandymen; i++){
            
            if(hArray[i].getID() == staffID){
                
                return hArray[i];
                
            }
            
        }
        
        return null;
        
        
    }
    
    
    public void processBookings(){
        try{
            Scanner scFile = new Scanner(new File ("bookings.txt"));
            
            while(scFile.hasNextLine()){
                
                String line[] = scFile.nextLine().split(",");
                
                
                if(!(findHM(Integer.parseInt(line[1])) == null)){
                bookArr[bookingCounter] = new Booking(LocalDate.parse(line[0],DateTimeFormatter.ofPattern("dd/MM/uuuu")), findHM(Integer.parseInt(line[1])), Integer.parseInt(line[2]), line[3].charAt(0));
                bookingCounter++;
                }
                
            
            } 
                
                
            }catch(FileNotFoundException e){
                    
                    
                    
                    }
            
            
        }
    
    
    public void toFile(){
        
        try{
        FileWriter fw = new FileWriter(new File("output.txt"));
        
        String fileString = "";
        
        for(int i = 0; i<bookingCounter; i++){
            fw.write(bookArr[i].getBookingDetails());
            if(bookArr[i].getTask() == 'e'){
                if(! (bookArr[i].getHm() instanceof CertHandyman)){
                    fw.write("*** not certified");
                    
                    
                    
                }
               
                
                
            }
            
             fw.write("\n");
            
        }
        
        fw.write("Total Electrical Bookings : "+ Booking.getTotalElectrical() );
        
        fw.close();
        }catch (IOException e){
            
            System.out.println("An IO Exception occoured");
            
        }
        
        
        
        
    }
    
    
    
}
