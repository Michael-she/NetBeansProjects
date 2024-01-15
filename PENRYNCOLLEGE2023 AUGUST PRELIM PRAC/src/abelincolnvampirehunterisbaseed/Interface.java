/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abelincolnvampirehunterisbaseed;

/**
 *
 * @author cvnie
 */
public class Interface {
    
    public static void main(String[] args) {
        
        
        MaintenanceManager mm = new MaintenanceManager();
        
        System.out.println(mm.listAllHM());
        
        mm.processBookings();
        mm.toFile();
        
    }
    
    
}
