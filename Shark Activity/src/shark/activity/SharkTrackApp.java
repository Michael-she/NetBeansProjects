/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shark.activity;

/**
 *
 * @author Michael
 */
public class SharkTrackApp {
    
   public static STManager sharks = new STManager();
    
    public static void main(String [] args){
        
        
        
        System.out.println(sharks);
        System.out.println(sharks.averageFemaleLength());
        System.out.println(sharks.biggestMaleShark());
        
        SharkTracker newShark = new SharkTracker("GTI", 6.08, 'M', "34: 8:45.78:S,18:28:25.17:E");
        
        sharks.addShark(newShark, 10);
        sharks.sortByTag();
        System.out.println(sharks);
       // System.out.println("DEBUG OUUTPUT BREAK ______________________");
        System.out.println(sharks.intlGPSFormat());
        
        
        
        
    }
    
    
    
}
