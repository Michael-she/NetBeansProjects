/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.pkg101;
import java.time.*;
/**
 *
 * @author Michael
 */
public class personTester {
    public static void main(String [] args){
        
        
        person person1 = new person("Jimmy", LocalDate.parse("1984-10-14"),'H' );
        
        System.out.println(person1.toString());
        
        person student1 = new Student("Larry!" , LocalDate.parse("1984-10-14"), 'g',"The school", 54);
        System.out.println(student1); 
   
    }
}
