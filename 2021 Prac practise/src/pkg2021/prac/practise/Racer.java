/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nov2022;
import java.time.LocalDate;
/**
 *
 * @author User
 */
public class Racer 
{
    private String name, rank, type;
    LocalDate dob;
    
    public Racer (String n ,LocalDate d, String r, String t)
    {
        name =n;
        dob = d;
        rank = r;
        type = t;
            
    }    

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String getType() {
        return type;
    }

    public LocalDate getDob() {
        return dob;
    }
    public String toString ()
    {
        String r;
        r = name + " " + dob + " (" + rank + ") ";
    if(type.equalsIgnoreCase("D"))
    {
        r = r +  " Driver";
    }
    else
    {
        r = r + " Navigator";
    }
    return r;
    }

}

