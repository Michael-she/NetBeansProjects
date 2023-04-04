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
public class Armour extends Equipment{
    
    private int defence;
    private int durability;
    
    public Armour(String inDS, LocalDate inDF, double inVL, int inDEF, int inDUR){
        super(inDS, inDF, inVL);
        defence = inDEF;
        durability = inDUR;
        
        
        
    }

    public int getDefence() {
        return defence;
    }

    public int getDurability() {
        return durability;
    }
    
    public double getValue(){
        double newValue = super.getValue() * (durability/100.0);
        return newValue;
    }
    
    public String toString(){
        
        return super.getDescription() + " ["+ super.getDateFound()+"] R" + getValue() +"Defence: "+getDefence()+ " (" + getDurability()+")";
    }
    
    
}
