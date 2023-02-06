


package pkg2019.past.paper;

import java.util.Objects;
import java.time.*;
/**
 *
 * @author mgshe
 */
public class Tractor {
    
    
    
    private String brand;
    private int year;
    private int horsePower;
    private Attachment attachment;

    public Tractor(String brand, int year, int horsePower) {
        this.brand = brand;
        this.year = year;
        this.horsePower = horsePower;
       
    }

    public String getBrand() {
        
        
        return brand;
      
         
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public Attachment getAttachment() {
        return attachment;
    }
    
    
    public String toString(){
        
        if(Objects.isNull(attachment)){
        return brand;
                
                }else{
            return "IDK";
        }
        
    }
    
    
    
    
    
    
}
