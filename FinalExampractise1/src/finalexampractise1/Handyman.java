/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalexampractise1;

/**
 *
 * @author mgshe
 */
public class Handyman {
 
   private int id;
   private String firstName, lastName;
   
   public Handyman(int i, String fn, String ln){
       
       id = i;
       firstName = fn;
       lastName = ln;
       
   }
    
   
   public int getID(){
       return id;
   }
    
   public String getName(){
       return firstName.toLowerCase() +lastName.toUpperCase().charAt(0);
   }
   
   
   
   public String toString(){
       
       
       return getName() +" ("+getID()+")";
       
   }
    
}
