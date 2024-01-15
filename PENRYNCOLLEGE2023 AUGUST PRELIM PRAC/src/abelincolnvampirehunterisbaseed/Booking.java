/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abelincolnvampirehunterisbaseed;

import java.time.LocalDateTime;

/**
 *
 * @author cvnie
 */
public class Booking {
    
    private LocalDateTime bookDate;
    private Handyman hm;
    private int houseld;
    private char task;
    private String taskDesc;
    
    public static final char TASKPLUMBING = 'b';
    public static final char TASKELECTRICAL = 'e';
    public static final char TASKPAINTING = 'a';
    private static int totalElectrical;
    
    public Booking (LocalDateTime bd, Handyman h, int hid, char t)
    {
        bookDate = bd;
        hm = h;
        houseld = hid;
        task = t;
    }
    
    private String getTaskDesc ()
    {
        if (task == TASKPLUMBING )
        {
            return "Plumbing";
        }
        if (task == TASKELECTRICAL )
        {
            return "Electrical";
        }
        if (task == TASKPAINTING )
        {
            return "Painting";
        }
        return "invalid";
    }

    public char getTask() {
        return task;
    }
    
    public Handyman getHm ()
    {
        return hm;
    }

    public static int getTotalElectrical() {
        return totalElectrical;
    }
    
    
    public String getBookingDetails ()
    {
        return houseld + "#" + bookDate + "#" + bookDate.plusDays(15) + "#" + hm.getFirstName() + "#" + getTaskDesc();
    }
    
    
    
}
