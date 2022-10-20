/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shark.activity;

/**
 *
 * @author Michael
 */
public class SharkTracker {

    /**
     * @param args the command line arguments
     */
   private String tag;
   private double length;
   private char MorF;
   private String GPSLocation;
   
   public SharkTracker(String t, double len, char mf, String gps){
       tag = t;
       length = len;
       MorF = mf;
       GPSLocation = gps;
   }
   public String getTag(){
       return tag;
   }
   public double getLength(){
       return length;
   } 
   public char getMorF(){
       return MorF;
              
   }
   public String getGPSLocation(){
       return GPSLocation;
               
   }
   
   public String toString(){
       return tag+" , "+length+"m ["+MorF+"]\t"+GPSLocation;
   }
   
   
   
   
   
}
