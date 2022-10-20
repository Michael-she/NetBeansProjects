/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array.exe1;
import javax.swing.*;
/**
 *
 * @author Michael
 */
public class LearnerArrayUI {

public static void main(String[] args){
    LearnerArray learners =  new LearnerArray();
    System.out.println(learners.toString());
    System.out.println(learners.getStundentsAverage());
    System.out.println(learners.getBestmark());
    learners.sortArr();
    System.out.println(learners);
    
    String searchName = JOptionPane.showInputDialog("What is the name that you would like to search for?");
String result = learners.searchLearner(searchName);
if(result != null){
    System.out.println("RESULT FOUND: \n"+result);
}else{
    System.out.println("The name was not found");
}
            
            
            }    
}
