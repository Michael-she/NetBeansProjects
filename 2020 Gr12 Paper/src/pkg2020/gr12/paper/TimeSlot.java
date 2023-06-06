/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2020.gr12.paper;

/**
 *
 * @author mgshe
 */
public class TimeSlot {
    private String counsellor;
    
    private int startHour;
    
    private boolean isAvailable = true;
    
   
    
    public TimeSlot(String inCS, int inSH){
        
        counsellor = inCS;
        startHour = inSH;
        
    }
    
    
    public String getCounsellor(){
        
        return counsellor;
    }
    
    public int getStartHour(){
        return startHour;
    }
    
    public boolean getIsAvailable(){
        return isAvailable;
    }
    
    private int getEndHour(){
        return startHour+1;
    }
    
    public void bookSlot(){
        
        isAvailable = false;
    }
    
    public String toString(){
        
        return getCounsellor()+": "+getStartHour()+":00 - "+getEndHour()+":00";
    }
    
    
    
}
