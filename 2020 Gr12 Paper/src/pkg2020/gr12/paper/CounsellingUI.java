/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2020.gr12.paper;

/**
 *
 * @author mgshe
 */
public class CounsellingUI {

 public static void main(String [] args){
     
     SlotManager sm = new SlotManager();
     
     //System.out.println(sm.displayAllClients());
     
     sm.generateTimeSlots();
     
    // System.out.println(sm.displayAvailableTimeSlots());
     
     System.out.println(sm.createBookedSlotArray());
     
 }

    
}
