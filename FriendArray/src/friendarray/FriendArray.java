/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package friendarray;
import java.util.*;
import java.time.*;
import java.io.*;
/**
 *
 * @author Michael
 */
public class FriendArray {

    static int size = 0;
    private static Friend friendArr[] = new Friend [15];
    /**
     * @param args the command line arguments
     */
    public  FriendArray(){
        try{
            Scanner scFile = new Scanner (new File("FriendsDates.txt"));
            String line, name;
            LocalDate DOB;
            while(scFile.hasNext()){
                line = scFile.next();
                Scanner scLine = new Scanner (line).useDelimiter("#");
                name = scLine.next();
                DOB = LocalDate.parse(scLine.next());
                
                scLine.close();
                System.out.println(name);
                friendArr[size] = new Friend(name, DOB);
                size++;
            }
            scFile.close();
        }catch(FileNotFoundException f){
            System.out.println("The file was not found");
        }
    }
    public Friend getFriend(int pos){
        return friendArr[pos];
    }

   public void sortByName(){
       boolean sorted = false;
       while(!sorted){
               sorted = true;
       for(int i = 0; i<size-1; i++){
            Friend tmp = friendArr[i];
                    if(friendArr[i].getName().compareTo(friendArr[i+1].getName())>0){
                        friendArr[i]= friendArr[i+1];
                        friendArr[i+1] = tmp;
                        sorted = false;
                    }
       }}
      
   }
   public void sortByAge(){
          boolean sorted = false;
       while(!sorted){
               sorted = true;
       for(int i = 0; i<size-1; i++){
            Friend tmp = friendArr[i];
                    if(friendArr[i].getAge()>friendArr[i+1].getAge()){
                        friendArr[i]= friendArr[i+1];
                        friendArr[i+1] = tmp;
                        sorted = false;
                    }
       }}
       
   }
   public Friend search(String name){
       
       for (int i = 0; i<size; i++){
           if(friendArr[i].getName().equalsIgnoreCase(name)){
            
           return friendArr[i];
               
           }       
       }
       return null;
   }
   public String toString(){
       String tmp = "";
       for (int i = 0; i<size; i++)
       {
           
           tmp = tmp+friendArr[i] + "\n";
       }
       System.out.println(size);
       return tmp;
       
   }
    
}
