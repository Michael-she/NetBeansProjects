/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.open.book.paper;

/**
 *
 * @author Michael
 */
public class InventoryUI {
    public static void main(String [] args){
        
        InventoryManager inventory = new InventoryManager();
        System.out.println(inventory.toString());
        inventory.sortByValue();
        System.out.println(inventory.toString());
        System.out.println(inventory.bestWeapon());
        System.out.println(inventory.scrapArmour());
                
        
        
    }
}
