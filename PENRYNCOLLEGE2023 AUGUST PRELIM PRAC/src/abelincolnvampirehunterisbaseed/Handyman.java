/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abelincolnvampirehunterisbaseed;

/**
 *
 * @author cvnie
 */
public class Handyman {
    
    private int id;
    private String firstName, lastName;

    public Handyman (int i, String fn, String ln)
    {
        id = i;
        firstName = fn;
        lastName = ln;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName + lastName.substring(0).toUpperCase();
    }
    
    public String toString ()
    {
        return getFirstName() + "(" + id + ")";
    }
    
    
    
    
    
}
