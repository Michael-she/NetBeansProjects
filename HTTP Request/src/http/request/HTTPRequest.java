/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package http.request;

import java.io.*;
import java.net.*;

/**
 *
 * @author Michael
 */
public class HTTPRequest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        while(true){
            try{
            System.out.println(getChuckNorrisJoke());
            System.out.println("");
            Thread.sleep(5000);
            }catch(Exception e){
                System.out.println("LOL: "+e);
            }
            
        }
    
    }
    
    
    public static String getChuckNorrisJoke(){
            try{
        URL url = new URL("https://api.chucknorris.io/jokes/random");
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
String [] outputArr = stringResponse.split(":");



for(int i = 0; i<outputArr.length; i++){
 // System.out.println(i + ": " +outputArr[i]);  
}
            //System.out.println(outputArr[13]);
            String output = outputArr[13].substring(0, outputArr[13].length()-1);
            return output;
            
        }catch(MalformedURLException e){
            System.out.println("The URL is cronkey");
                   
            
        }catch(ProtocolException e){
            
            System.err.println("Protacol Exception....");
        }
        catch(Exception e){
            System.err.println("Error..." + e);
        }
        return "-1";
    }
    
}
