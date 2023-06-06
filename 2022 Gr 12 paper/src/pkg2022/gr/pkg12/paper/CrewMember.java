/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2022.gr.pkg12.paper;

/**
 *
 * @author mgshe
 */
public class CrewMember {

   private String fullName;
   private int crewID;
   private String department;
   public static int numPromotedCrew = 0;
   
   public CrewMember(String inFN, int inCID, String inDT){
      // System.out.println("Crew member");
       fullName = inFN;
       crewID = inCID;
       department = inDT;       
       
   }
   
   public String getFullName(){
       return fullName;
   }
   public int getCrewID(){
       return crewID;
   }
   
   public String getDepartment(){
       return department;
   }
   
   public String toString(){
       return fullName + "\tCrew ID:"+crewID+"\t[" +department+"]";
   }
           
    
}
