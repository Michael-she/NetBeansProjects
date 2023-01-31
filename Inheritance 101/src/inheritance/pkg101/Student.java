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
public class Student extends person{
    private String school;
    private int grade;
    
   
    public Student(){
        
    }
    public Student(String f, LocalDate dob, char gender, String s, int g){
        
        super(f,dob,gender);
        school = s;
        grade = g;
    }
    
    public String toString(){
        return "Student: " + getName() + " attends: " + school;
    }
    
    
}
