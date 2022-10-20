/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package friendarray;
import java.time.*;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Michael
 */
public class Friend {
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    
    public Friend(String n, LocalDate d){
        name = n;
        dateOfBirth = d;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        LocalDate now = LocalDate.now();
        int age = Period.between(dateOfBirth, now).getYears();
        
        return age;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setDOB(String d){
        dateOfBirth = LocalDate.parse(d, DateTimeFormatter.ofPattern("dd,mm,yyyy"));
               
    }
    
    public String toString(){
        
        
        return name+" "+ getAge();
        
    }




}

