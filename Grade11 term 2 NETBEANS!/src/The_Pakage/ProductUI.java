/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package The_Pakage;

/**
 *
 * @author mshep23
 */
public class ProductUI {
  public static void main(String[] args){
      
   Product eggs = new Product();
   
   Product milk = new Product("milk", 'c', 30, 12, 103.25);
   
   System.out.println(milk.toString());
      
      System.out.println(eggs);
      
      
  }  
}
