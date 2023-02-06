
package pkg2019.past.paper;

import java.time.LocalDate;

/**
 *
 * @author mgshe
 */
public class TestClass {
    public static void main(String [] args){
        
           LocalDate date = LocalDate.now();
           
           int month = date.getMonthValue();
           month++;
           date = LocalDate.parse("2022-12-08");
           
           System.out.println(date.getYear()+"-"+month+"-"+date.getDayOfMonth());
        
        
    }
}
