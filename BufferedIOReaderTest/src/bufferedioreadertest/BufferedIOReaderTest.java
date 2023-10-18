/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bufferedioreadertest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mgshe
 */
public class BufferedIOReaderTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
       BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
       
       String input = buff.readLine();
       
       
        System.out.println(input);
        
         input = buff.readLine();
       
       
        System.out.println(input);
        
        
    }
    
}
