/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.open.book.paper;

import java.io.*;
import java.time.*;
import java.util.*;

/**
 *
 * @author Michael
 */
public class InventoryManager {
    
    private Equipment equipmentArr[] = new Equipment [100];
    private int arrSize = 0;
    
    
    public InventoryManager(){
        try{
        Scanner scFile = new Scanner( new File("Inventory.txt"));
        while(scFile.hasNextLine()){
            Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
            String description = scLine.next();
            LocalDate dateFound = LocalDate.parse(scLine.next());
            double value = scLine.nextDouble();
            
            int tmp = scLine.nextInt();
            
            if(scLine.hasNext()){
                int defence = tmp;
                int durability = scLine.nextInt();
                equipmentArr[arrSize] = new Armour(description, dateFound, value, defence, durability);
                
                
                
            }
            else{
                int attPower = tmp;
                 equipmentArr[arrSize] = new Weapon(description, dateFound, value, attPower);
            }
            arrSize++;
            
        }
        
        
        
        
        }catch(FileNotFoundException e){
            System.out.println("The File was not found");
        }
    }
    
    public String toString(){
        String outString = "";
        for(int i = 0; i<arrSize; i++){
            
           outString =  equipmentArr[i].toString() + "\n";
            
        }
        return outString;
    }
    
    
    public void sortByValue(){
       boolean sorted = false;
       while(!sorted){
       sorted = true;
       for(int i = 0 ; i<arrSize-1; i++){
           if(equipmentArr[i].getValue() < equipmentArr[i+1].getValue()){
               Equipment tmp = equipmentArr[i];
               
               equipmentArr[i] = equipmentArr[i+1];
               equipmentArr[i+1] = tmp;
            sorted = false;
           }
           
           
       
       }
       
    }
    }
    
    public Weapon bestWeapon(){
        Weapon bestWeapon = null;
        
       for (int i = 0 ; i<arrSize; i++){
           if(equipmentArr[i] instanceof Weapon){
               if(Objects.isNull(bestWeapon)){
                   
                   equipmentArr[i] = bestWeapon;
               }
               
              Weapon tmp =  (Weapon) equipmentArr[i];
           if(bestWeapon.getAttPower()<tmp.getAttPower()){
               
               
           }
           
           
       }}
       return bestWeapon;
    }
    
    public String scrapArmour(){
        int indexPos = 0;
       int index []  = new int [3];
       index [0] = -1;
       index [ 1] = -1;
       index[2] = -1;
        
       for(int i = 0; i<3; i++){
       
        for (int j = 0 ; j<arrSize; j++){
           if(equipmentArr[i] instanceof Armour){
              if(index[i] == -1){
                  index[i] = j;
              
              }
              
               
              Armour tmp =  (Armour) equipmentArr[j];
              Armour tmp2 =  (Armour) equipmentArr[index[i]];
           if(tmp.getDurability()>tmp2.getDurability() && index [0] != j&& index [1] != j&& index [2] != j ){
               index[i] = j;
               
           }
        
           }
           
        }
    }
       
       String returnString = equipmentArr[index[0]].getDescription() + "\n"+equipmentArr[index[1]].getDescription() + "\n"+equipmentArr[index[2]].getDescription() + "\n";
    return returnString;
}
    
}


