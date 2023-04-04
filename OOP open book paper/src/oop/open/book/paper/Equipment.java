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
public class Equipment {
    private String description;
    private LocalDate dateFound;
    private double value;
    
    
    
    public Equipment(String inDS, LocalDate inDF, double inVL){
        description = inDS;
        dateFound = inDF;
        value = inVL;
        
        
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDateFound() {
        return dateFound;
    }

    public double getValue() {
        return value;
    }
    
    public String toString(){
        
        return description +" ["+ dateFound+"] R" + value;
    }
    
}
