/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shark.activity;
import java.io.*;
import java.util.*;
/**
 *
 * @author Michael
 */
public class STManager {
   SharkTracker [] sharks = new SharkTracker[100];
   
   int size = 0;
   
   public STManager(){
       try{
         
           Scanner scFile = new Scanner(new File("SAORI.txt"));
           System.out.println("The file was found");
           while(scFile.hasNextLine()){
               Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter("#");
               // public SharkTracker(String t, double len, char mf, String gps){
               String tag = scLine.next();
               double length = scLine.nextDouble();
               char gend = scLine.next().charAt(0);
               String GPS = scLine.next();
               
               sharks[size] = new SharkTracker(tag, length, gend, GPS);
               size++;
               
           }
           
           
           
       }
       catch(FileNotFoundException f){
           System.out.println("The file was not found");
       }
       
       
   }
   
   public String toString(){
       String tmpOut = "";
       for (int i = 0; i<size; i++){
           tmpOut+= "\n"+sharks[i].toString();
       }
       return tmpOut;
   }
    
    public double averageFemaleLength(){
        double aveLength = 0;
        double totLength = 0;
        int numFemales = 0;
        for (int i = 0; i<size; i++){
            if(sharks[i].getMorF() =='F'){
                totLength+=sharks[i].getLength();
                numFemales++;
                
            }
            
        }
        
        aveLength = totLength/(aveLength*1.0);   
        aveLength = (Math.round(aveLength*100))/100.0;
        return aveLength;
    }
    
    public SharkTracker biggestMaleShark(){
        double largest = 0;
        SharkTracker largestShark = null;
        for(int i =0; i<size; i++){
            if(sharks[i].getMorF()=='M'&& sharks[i].getLength()>largest){
                largest = sharks[i].getLength();
                largestShark = sharks[i];
                
                
            }
        }
        return largestShark;
    }
    
    public void sortByTag(){
        boolean sorted = false;
                
                while(!sorted){
                    sorted = true;
                    for (int i = 0; i<size-1; i++){
                        if(sharks[i].getTag().compareTo(sharks[i+1].getTag())>0){
                            SharkTracker tmp = sharks[i];
                            sharks[i] = sharks[i+1];
                            sharks [i+1] = tmp;
                            sorted = false;
                            
                            
                            
                        }
                    }
                }
    }
    
    public void addShark(SharkTracker sharkToAdd, int pos){
        pos = pos-1;
        if(sharks[pos]!=null){
            for(int i = size; i>pos; i--){
                sharks[i+1] = sharks[i];
                
            }
            
        }
        sharks[pos] = sharkToAdd;
        size++;
        
        
    }
    
    public String deleteShark(String tagToDel){
        
        for(int i = 0; i >size; i++){
            if(tagToDel.equalsIgnoreCase(sharks[i].getTag())){
                
                for(int o = i; o<size-1;o++){
                    sharks[o] = sharks[o+1];
                    
                }
                sharks[size] = null;
                
                size--;
                
                return "SHARK DELETED AT POSITION " + i;
            }
            
        }
        return "No sharks matching tag found";
    }
    
    
    public String intlGPSFormat(){
        String outStr = "";
        for (int v = 0; v<size; v++){
        Scanner GPSLine = new Scanner (sharks[v].getGPSLocation()).useDelimiter(",");
        String outGPS ="";
        
        for (int i = 0; i<2; i++){
            //was initially going to use seperate scanners and variables for latitude and longitude, but a loop was sufficant and there was no real need to change the variable name
        String lat = GPSLine.next();
       
        
        Scanner latLine = new Scanner(lat).useDelimiter(":");

        
        String newLat = latLine.next()+(char)176+latLine.next()+"'"+latLine.next()+"\""+latLine.next();
        
        outGPS += newLat+" , ";
        
        }
                outGPS = outGPS.substring(0, outGPS.length()-3);
        outStr+=sharks[v].getTag()+" "+outGPS+"\n";
        
        }
        return outStr;
    }
    
}
