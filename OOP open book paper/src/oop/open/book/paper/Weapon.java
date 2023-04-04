/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.open.book.paper;
import java.time.*;
/**
 *
 * @author Michael
 */
public class Weapon extends Equipment {
    
    private int attPower;
    
    
    public Weapon(String inDS, LocalDate inDF, double inVL, int inAP){
        super(inDS, inDF, inVL);
        
        attPower = inAP;
        
        
    }

    public int getAttPower() {
        return attPower;
    }
    
    
    public double getValue(){
        double newValue = super.getValue() * (attPower/2.0);
        return newValue;
    }
    
    
   
    
    
}
