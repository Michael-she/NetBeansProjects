/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hexnumbers;

/**
 *
 * @author mgshe
 */

   import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Hexnumbers {



    public static void main(String[] args) {
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        // Nested loops to generate 32-bit hexadecimal numbers (This will take a very long time)
        for (int i0 = 0; i0 < 16; i0++)
            for (int i1 = 2; i1 < 16; i1++)
                for (int i2 = 2; i2 < 16; i2++)
                    for (int i3 = 14; i3 < 16; i3++)
                        for (int i4 = 8; i4 < 16; i4++)
                            for (int i5 = 3; i5 < 16; i5++)
                                for (int i6 = 0; i6 < 16; i6++)
                                    for (int i7 = 0; i7 < 16; i7++) {
                                        String hexNumber = "" + hexDigits[i0] + hexDigits[i1] + hexDigits[i2] + hexDigits[i3]
                                                          + hexDigits[i4] + hexDigits[i5] + hexDigits[i6] + hexDigits[i7];
                                        
                                        queryWebsite(hexNumber);
                                        System.out.print("  ");
                                        System.out.println(hexNumber);
                                        
                                    }
    }
    
    public static void queryWebsite(String hexNumber) {
        String urlString = "https://www.betway.co.za/sport/soccer/int/friendly_games/egypt-v-russia/0?datefilter=202309111800&eventId=" + hexNumber + "-0000-0000-0000-000000000000";
        

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            String response ="";

            while ((line = in.readLine()) != null) {
                response += line;
            }
            if(response.contains("Put the game on pause!")){
                System.out.print(" - fail");
                
            }else{
                System.out.print(" WHOO HOO");
            }
            
            
            in.close();

            // Now `response` contains the server's response to your query.
            // Do something with it, like storing it or processing it.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
