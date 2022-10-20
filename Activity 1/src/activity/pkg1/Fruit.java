/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg1;

/**
 *
 * @author mshep23
 */
public class Fruit {
    
    private String description;
    private int qty;
private double costPrice;
private double sellingPrice;

public static final int MARKUP = 75;
public static int totalQty;
public static double totalCost;



public Fruit(String d, int q, double c){
    
    description = d;
    qty = q;
    costPrice = c;
    
              sellingPrice = costPrice + costPrice/100.0*MARKUP;
   
}

public String toString(){
    
  
    
    return"Fruit name: " + description + "\t Quantity: " + qty +"\t Cost Price" + costPrice +"\t Selling Price: " + sellingPrice;
    
    
}
    

public static void Gooi(){
    
    System.out.println("yeet" );
}

}
