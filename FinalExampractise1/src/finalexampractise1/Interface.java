/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalexampractise1;

/**
 *
 * @author mgshe
 */
public class Interface {
    public static void main(String [] args){
        
        MantainanceManager m = new MantainanceManager();
        
        System.out.println(m.listAllHM());
        
        
        m.processBookings();
        
        m.toFile();
        
        
        
    }
}
