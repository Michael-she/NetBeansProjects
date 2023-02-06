/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pkg2019.past.paper;

/**
 *
 * @author mgshe
 */
public class Attachment {

   private String type;
   private String model;
   private int minPow;

    public Attachment() {
    }

    public Attachment(String type, String model, int minPow) {
        this.type = type;
        this.model = model;
        this.minPow = minPow;
    }

    public String getModel() {
        return model;
    }

    public int getMinPow() {
        return minPow;
    }
   
    
    
    public String toString(){
        
        
        
        
        return type + "Attachment - ("+model+") ["+minPow+"HP req]";
    }
   
}
