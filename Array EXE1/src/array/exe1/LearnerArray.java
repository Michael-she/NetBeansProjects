/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array.exe1;

import java.io.*;
import java.util.*;
public class LearnerArray {
    int size = 0;
    Learner learnerArr []= new Learner[150];
    
    public LearnerArray(){
        try{
        Scanner scFile = new Scanner(new File("LearnersMarks.txt"));
        System.out.println("The file was found");
        while (scFile.hasNext()){
            
            Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("%");
            
           String name = scLine.next();
           int t1 = scLine.nextInt();
           int t2 = scLine.nextInt();
           int t3 = scLine.nextInt();
           
           learnerArr[size] = new Learner(name, t1, t2, t3);
            size++;
            
        }
        
        
        
        
        }catch(FileNotFoundException f){
            System.out.println("The file was not found");
        }
    }
    
    @Override
    public String toString(){
        
       String outStr = "";
        for (int i = 0; i<size; i++){
            outStr += "\n\n" + learnerArr[i].toString();
        }
        return outStr;
        
    }
    
    public String getStundentsAverage(){
        String outStr = "";
        for (int i = 0; i<size; i++){
            outStr += "\n\n" + learnerArr[i].getFirstName()+" "+learnerArr[i].getSurname()+" :"+learnerArr[i].getAverage();
        }
        return outStr;
    }
    
    public String getBestmark(){
        
        String outStr = "";
        for (int i = 0; i<size; i++){
           outStr += "\n\n" + learnerArr[i].getFullName()+" :"+learnerArr[i].getHighestMark()+" - In Term :"+learnerArr[i].getHighestTerm();
       
        }
        return outStr;
    }
    public void sortArr(){
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for(int i = 0; i<size-1; i++){
                
                if(learnerArr[i].getFullName().compareTo(learnerArr[i+1].getFullName())>0){
                    
                    
                    Learner tmp = learnerArr[i];
                    learnerArr[i] = learnerArr[i+1];
                    learnerArr[i+1] = tmp; 
                    sorted = false;
                    
                }
                
            }
            
        }
        
    }
    public String searchLearner(String n){
        for (int i = 0; i<size; i++){
            if(learnerArr[i].getFullName().equalsIgnoreCase(n) || learnerArr[i].getFirstName().equalsIgnoreCase(n)){
                return learnerArr[i].toString();
            }
            
        }
        return null;
    }
    
}
