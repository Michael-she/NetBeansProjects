/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2022.gr.pkg12.paper;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mgshe
 */
public class Officer extends CrewMember{
    
    private int rank;
    
    private LocalDate datePromoted;
    
    public static int numPromotedOfficers = 0;
    
    public Officer(String inFN, int inCID, String inDT, int inRK, String inDP){
        
        super(inFN, inCID, inDT);
        //System.out.println("Offoicer");
        rank = inRK;
        
        
        //inDP = inDP.subString(6,9)+"-"+in
        datePromoted = LocalDate.parse(inDP, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        
        
    }
    
    public int getRank(){
        return rank;
    }
    
    public String getTitle(){
    
    switch (rank){
        case 1:
            return "Ensign";
        case 2:
            return "Lieutenant";
        case 3:
            return "Lt Commander";
        case 4:
            return "Commander";
        case 5:
            return "Captain";
        default:
            return "Error";
    }
    }
    
    public void promote(){
        
        if(rank<5){
            rank++;
            numPromotedOfficers++;
            datePromoted = LocalDate.now();
        }
        
    }
    
    public String toString(){
        
        return super.toString() +" "+getTitle();
    }
    
    
}
