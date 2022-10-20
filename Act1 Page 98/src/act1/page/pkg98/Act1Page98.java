




package act1.page.pkg98;
import java.time.*;
/**

 *
 * @author mshep23
 */


    /**
     * @param args the command line arguments
     */

public class Act1Page98 {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        
        System.out.println(dateTime);
        
        System.out.println(" Year: " + dateTime.getYear() + "\n Month: " + dateTime.getMonth() + "\n Month Value: "  +dateTime.getMonthValue()+"\n Day: " + dateTime.getDayOfMonth());
        System.out.println(" Hour: "+dateTime.getHour()+ "\n minute: " + dateTime.getMinute()+"\n Second: " + dateTime.getSecond());
        
        
        LocalDate date = LocalDate.now();
        
        System.out.println(date);
        System.out.println(" Year: " + date.getYear() + "\n Month: " + date.getMonth() + "\n Month Value: "  +date.getMonthValue()+"\n Day: " + date.getDayOfMonth());
        
        LocalTime time = LocalTime.now();
           System.out.println(" Hour: "+time.getHour()+ "\n minute: " + time.getMinute()+"\n Second: " + time.getSecond());
      
        System.out.println(time);
        
try{
        
            LocalDate dateTime1 = LocalDate.of(2021, 2, 29);
            
            System.out.println(dateTime1);
}
catch(DateTimeException d){
    System.out.println("Invalid Date");
}
            
            
    }
    
}
