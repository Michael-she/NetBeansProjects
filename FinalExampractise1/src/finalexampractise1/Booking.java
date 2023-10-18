/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalexampractise1;

import java.time.LocalDate;

/**
 *
 * @author mgshe
 */
public class Booking {
    private LocalDate Date;
    private Handyman hm;
    private int houseId;
    private char task;
    private String taskDesc;
    
    public static final char TASKPLUMBING = 'b';
    public static final char TASKELECTRICAL = 'e';
    public static final char TASKPAINTING = 'a';
    
    private static int totalEectrical = 0;
    
    
    
    public Booking(LocalDate bd, Handyman h, int hid, char t){
        Date = bd;
        hm = h;
        houseId = hid;
        task = t;
        
        
    }
    
    private String getTaskDesc (){
        if(task == TASKPLUMBING){
            return "Plumbing";
        }else if(task == TASKPAINTING){
            return "Painting";
        }else if(task == TASKELECTRICAL){
            totalEectrical++;
            return "Electrical";
        }
        return "Invalid";
        
    }
    
    public char getTask(){
        return task;
    }
    
    public Handyman getHm(){
        return  hm;
               
    }
    
    public static int getTotalElectrical(){
        return totalEectrical;
    }
    
    
    public String getBookingDetails(){
        
        return houseId+"#"+Date.toString()+"#"+(LocalDate.ofEpochDay(Date.toEpochDay()+15))+"#"+hm.getName()+"#"+getTaskDesc();
    }
    
    
}
