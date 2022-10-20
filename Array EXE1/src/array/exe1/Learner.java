/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array.exe1;
import java.util.*;

/**
 *
 * @author Michael
 */
public class Learner {
    
    
private int[] marks = new int [3];
private String fullName;

public Learner(String n, int t1, int t2, int t3){
    fullName = n;
    marks[0] = t1;
    marks[1] = t2;
    marks[2] = t3;
    
}
public String getFullName(){
    
    return fullName;
}
public String getFirstName(){
    Scanner name = new Scanner(fullName).useDelimiter(" ");
    String firstName = name.next();
    return firstName;
    
}

public String getSurname(){
    Scanner name = new Scanner(fullName).useDelimiter(" ");
     name.next();
    String surname = name.next();
     return surname;
}
    

    public String toString() {
        return "Learner " + fullName + "\nMARKS: \n TERM 1:" + marks[0] +" \n TERM 2:" + marks[1] +" \n TERM 3:" + marks[2] ;
    }
    
    public double getAverage(){
        
        return (marks[0]+marks[1]+marks[2])/3.0;
    }
    
    public int getHighestMark(){
        int highestMark = marks[0];
        if(highestMark<marks[1]){
            highestMark = marks[1];
        }
        if(highestMark<marks[2]){
            highestMark = marks[2];
        }
        
        return highestMark;
    }


    
    
public int getHighestTerm(){
     int highestMark = marks[0];
     int highestTerm = 1;
        if(highestMark<marks[1]){
            highestMark = marks[1];
            highestTerm = 2;
        }
        if(highestMark<marks[2]){
            highestMark = marks[2];
            highestTerm = 3;
        }
        
        return highestTerm;
    
}




}