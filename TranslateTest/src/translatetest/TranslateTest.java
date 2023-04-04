/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package translatetest;

import java.io.*;
import java.net.*;

/**
 *
 * @author Michael
 */
public class TranslateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
            try{
           
getHTML();
// System.out.println(getChuckNorrisJoke());
            System.out.println("");
            Thread.sleep(5000);
            }catch(Exception e){
                System.out.println("LOL: "+e);
            }
            
        
    
    }
    
    
    
    public static void getHTML() throws Exception{
URL url = new URL("https://translate.google.com/?sl=en&tl=af&text=hello%20world&op=translate");
InputStream is = url.openStream();
int ptr = 0;
StringBuffer buffer = new StringBuffer();
while ((ptr = is.read()) != -1) {
    buffer.append((char)ptr);
}


        System.out.println(buffer);
        
    }
    public static String getChuckNorrisJoke(){
            try{
        URL url = new URL("https://translate.google.com/?sl=en&tl=af&text=hello%20world&op=translate");
HttpURLConnection con = (HttpURLConnection) url.openConnection();
con.setRequestMethod("GET");
int status = con.getResponseCode();
String inputLine = "";
       //     System.out.println(status);
            
BufferedReader in = new BufferedReader(
  new InputStreamReader(con.getInputStream()));

StringBuffer content = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    content.append(inputLine);
}


in.close();

String stringResponse =""+ content;

                //System.out.println(stringResposse);
    return stringResponse;
}catch(Exception e){
                System.out.println("EXception " +e);
    
}
     return "";
    }
}
