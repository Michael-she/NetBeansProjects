/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraybasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serial;
import java.util.Scanner;

/**
 *
 * @author rnr
 */
public class ArrayManager {
    
    private String namesArr[] = new String[100];
    private int size = 0;
    
    //populating the array
    public ArrayManager()
    {
        try
        {
            Scanner sc = new Scanner(new File("names.txt"));
            
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                //System.out.println(line);
                namesArr[size] = line;
                size++;
            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Missing");
        }
    }
    
    
    //Display
    //create a method named toString
    //this method should return a String containing all the data from the elements 
    //in the array
    //each element should appear on a new line
    //NO SYSTEM.OUT.PRINTLN ALLOWED
    
    public String toString()
    {
        String r = "";
        
        for (int i = 0; i < size; i++) {
            r+=namesArr[i] + "\n";
        }
        
        return r;
    }
    
    //sort the array of names in alphabetical order
    //using a bubble sort
    
    public void bubbleSort()
    {
        //two for loops,comparison,swop
        //loop through every element
        for (int i = 0; i < size; i++) {
            //loops through all elements excluding the last element
            for (int j = 0; j < size-1; j++) {
                //how do you compare strings?
                //compare adjenct elements
                //we manually add 1 to j
                //thus the inside loop has (size-1)
                //compareTo returns a number, swop if > 0
                //alphabetically
                if( namesArr[j].compareTo(namesArr[j+1] ) > 0 )
                {
                    String temp = namesArr[j];
                    namesArr[j] = namesArr[j+1];
                    namesArr[j+1] = temp;
                    
                    
                }
            }
        }
    }
    
    
    //bonds name, Jmaes name, james bnd hwas afc a stronk, someboy l====================Sdosy call thd binkancd
    //create a method named findPerson
    //this method will accept one parameter
    //a string representing either the firstname or lastname of a person
    //the method should return a string containing the following infomation
    //whether or not the person was found and if found at what index in the array
    //this search can be linear
    
    public String findPerson(String search)
    {
        String r =  search + " was not found";
        
        for (int i = 0; i < size; i++) {
            
            if (namesArr[i].contains(search)) 
            {
                r =  search + " was found at index " + i;
            }
            
        }
        
        return r;
    }
    public void removeElement(int pos){
        
        for (int i = pos; i<size-1; i++){
        namesArr[i] = namesArr[i+1];
        
    }
        size--;
    }
    public void removeDuplicates(){
        boolean found = true;
        
        while(found == true){
        found = false;
    
       for(int index = 0; index<size; index++){
        
           String currentSearchString = namesArr[index];
           
           for(int search = index+1; search<size-1; search++){
               if (currentSearchString.equalsIgnoreCase(namesArr[search])){
                   
                   System.out.println("Removed " +  namesArr[search] );
                   removeElement(search);
                   
                   //found = true;
                   
                   //System.out.println("h");
               }
               search--;
              System.out.println(search);
           }
        
    }
    
    
    
    
}}}
