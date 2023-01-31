/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.pkg101;

import java.time.LocalDate;

/**
 *
 * @author Michael
 */
public class person {
    private String name;
    private LocalDate dob;
    private char gender;

    public person() {
    }

    public person(String name, LocalDate dob, char gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public char getGender() {
        return gender;
    }
    
     public String toString(){
         return "Name= "+name+", Dob= " + dob + ", Gender = " + gender;
     }
}
