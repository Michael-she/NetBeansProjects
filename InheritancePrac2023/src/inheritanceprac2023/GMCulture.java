/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceprac2023;

/**
 *
 * @author Michael
 */
public class GMCulture extends Culture {
    
    private String product;
    
 public GMCulture(double inBM, double inNU, String inBN, String inPT){
     super (inBM, inNU, inBN);
     product = inPT;
     
 }
 
 public String toString(){
    
    return super.toString() + " Product: " + product;
}
    
    
    
}
