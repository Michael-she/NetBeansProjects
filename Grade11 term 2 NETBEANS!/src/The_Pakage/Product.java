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
public class Product {
    
    
    
    private String name;
    private char category;
    private double costPrice;
    private int quantity;
    private double markup;
    
   
    
    public Product(){
          
        
        
    }
    public Product(String n, char c, double cp, int q, double m){
        
        name = n;
        category = c;
        costPrice = cp;
        quantity = q;
        markup = m;
        
    }
    //accsessor method
    //typed method (returns data)
    public String getName(){
        
      return(name);          
    }
    
    public char getCategory(){
        
        return(category);
    }
    
    public double getCostPrice(){
        return(costPrice);
    }
    public int getQuantity(){
       return(quantity);
    }
    
    public double getMarkup(){
        return(markup);
    }
    
    public void setMarkup(double m){
        
        markup = m;
        
    }
    public double getSellingPrice(){
        //int sellingPrice = 0;
        return(Math.round(((costPrice*markup/100+costPrice)*100))/100.0);
        
    }
    
    public String toString(){
     
        String returnStr = "";
        returnStr += name + " , ";
        returnStr += "[" + category + "] - " ;
        returnStr += quantity + " in stock @R";
        returnStr += getSellingPrice();
        
        return (returnStr);
        
        
    }
    
    
    
    
}
