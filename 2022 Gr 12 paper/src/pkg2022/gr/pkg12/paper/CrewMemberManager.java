/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2022.gr.pkg12.paper;

import java.util.*;
import java.io.*;

/**
 *
 * @author mgshe
 */
public class CrewMemberManager {
    private CrewMember cArr[] = new CrewMember[80];
    
    private int size = 0;

    public CrewMemberManager() {
        try{
            Scanner ScFile = new Scanner(new File("crewmembers.txt"));
            
            while(ScFile.hasNextLine()){
                
                Scanner ScLine = new Scanner (ScFile.nextLine()).useDelimiter("#");
                
                String fullName = ScLine.next();
               // System.out.print("FullName: "+fullName);
                int crewID = ScLine.nextInt();
               // System.out.print("\tCrew ID: "+crewID);
                String department = ScLine.next();
               // System.out.print("\t Department "+department);
                if(ScLine.hasNext()){
                    int rank = ScLine.nextInt();
                   // System.out.print("\t Rank "+rank);
                    String datePromotedString = ScLine.next();
                    //System.out.print("\t datePromoted "+datePromotedString);
                    cArr[size] = new Officer(fullName, crewID, department, rank, datePromotedString);
                }else{
                    cArr[size] = new CrewMember(fullName, crewID, department);
                }
               // System.out.println("");
                size++;
                
                
                
            }
            
            
            
        }catch(FileNotFoundException e){
            System.out.println("The file was not found");
        }
    }
    
    public String toString(){
        String returnStr = "";
        
        for(int i  = 0 ; i<size; i++){
            returnStr += cArr[i].toString()+"\n";
        }
        
        return returnStr;
    }
    
    public int findCrewMember(int inCID){
        
        for(int i = 0; i<size; i++){
            
            if(cArr[i].getCrewID() == inCID){
                return i;
            }
            
        }
        return -1;
    }
    
}
