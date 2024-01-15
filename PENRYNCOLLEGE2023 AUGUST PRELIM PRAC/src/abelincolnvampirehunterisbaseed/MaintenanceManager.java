/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abelincolnvampirehunterisbaseed;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author cvnie
 */
public class MaintenanceManager {
    
    private Handyman hArry[] = new Handyman [30];
    private int size = 0;
    private Booking bArr[] = new Booking [100];
    private int bSize = 0;
    
    public MaintenanceManager ()
    {
        try
        {
            Scanner sc = new Scanner (new File ("handyman.txt"));
            
            while (sc.hasNext())
            {
                String line = sc.nextLine();
                String tokens[] = line.split(",");
                int id = Integer.parseInt(tokens[0]);
                String fn = tokens[1];
                String ln = tokens[2];
                
                if (tokens.length > 3)
                {
                    String cn = tokens[3];
                    hArry[size] = new CertHandyman (id, fn, ln, cn);
                    
                }
                else
                {
                    hArry[size] = new Handyman (id, fn, ln);
                }
               
                size++;
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
    
    public String listAllHM()
    {
        String r = "";
        
        for (int i = 0; i < size; i++) {
            r += hArry[i].toString() + "\n";
            
        }
        
        return r;
    }
    
    public Handyman findHM (int pos)
    {
        boolean found = false;
        int i = -1;
        Handyman r = null;
        
        while (i < size - 1 && found == false)
        {
            i++;
            if (hArry[i].getId() == pos)
            {
                found = true;
               
                r = hArry[i];
            }
            
        }
        
        return r;
        
    }
    
    public void processBookings ()
    {
        try
        {
            Scanner sc = new Scanner (new File ("bookings.txt"));
            while (sc.hasNext())
            {
                String line = sc.nextLine();
                String tokens[] = line.split(",");
                LocalDate bd ;
                int id = Integer.parseInt(tokens[1]);
                int hid  = Integer.parseInt (tokens[2]);
                char task = tokens[3].charAt(0);
                
                if (!(findHM(id) == null))
                {
                    bArr[bSize] = new Booking (bd, findHM(id), hid, task);
                    bSize++;
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
    
    public void toFile ()
    {
        try
        {
            FileWriter fw = new FileWriter (new File ("output.txt"));
            
            for (int i = 0; i < bSize; i++) {
                fw.write(bArr[i].getBookingDetails());
                if (bArr[i].getTask() == 'e')
                    if (! (bArr[i].getHm() instanceof CertHandyman))
                    {
                        fw.write("*** not certified");
                    }
                fw.write("\n");
                
            }
            
            fw.write("Total Electrical Bookings:" + Booking.getTotalElectrical() );
            fw.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
    
}
