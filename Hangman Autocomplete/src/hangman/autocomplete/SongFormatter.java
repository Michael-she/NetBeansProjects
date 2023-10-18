/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman.autocomplete;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mgshe
 */
public class SongFormatter {
    
    public static void main(String [] args) throws IOException{
        try{
        BufferedReader brFile = new BufferedReader(new FileReader(new File ("allsongs.txt")));
        
        int numLines = 515576;
        
        
         
        String Songs [][] = new String [numLines][4];
       
        
        for(int i = 0; i<numLines; i++){
            
            System.out.println(brFi);
            
            String s[] = brFile.readLine().split("<SEP>");
            
            
            Songs[i] = s;
            
            
        }
        
         for(int i = 0; i<numLines; i++){
            
            char cArr [] = Songs[i][3].toCharArray();
            String reAssembledSong = "";
            for(int j = 0; j<cArr.length; j++){
                
                
                
            }
            
            
        }
        
        
        
        int numResults = numLines;

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        
        boolean disallowedCharacters [] = new boolean[100];
        
        
        
        boolean allowedCharacters [] = new boolean[100];
                    System.out.println("Enter the number of characters in the song name");
        int numCharacters = Integer.parseInt(userInput.readLine());
        
        String eligibleSongs[][] = new String [numResults][4];
         String legalSongs [] [] = new String[numLines][4];
        numResults = 0;
        for( int i = 0; i<numLines; i++){
            if(numCharacters == Songs[i][3].length()){
                eligibleSongs[i] = Songs[i];
                numResults++;
                
                System.out.println(eligibleSongs[i][3]);
                
            }
            
            
        }
        
        char assembledString[] = new char [numCharacters];
        
        for(int i = 0; i<numCharacters; i++){
            
            assembledString[i] = '*';
            
        }
        
        while(numResults > 1){
            System.out.println("Word Letters (letter Pos)");
            String userInputStr = userInput.readLine();
            
            
            char letter = userInputStr.charAt(0);
            userInputStr = userInputStr.substring(1);
            
            int pos = Integer.parseInt(userInputStr);
            
            
            assembledString[pos-1] = letter;
            
            for(int i = 0; i<assembledString.length; i++){
                
                System.out.print(assembledString[i]);
                
            }
            System.out.println("");
            
            
            int newResults = 0;
            for(int i = 0; i<numResults; i++){
                String songName = eligibleSongs[i][3];
                boolean match = true;
                for(int j = 0; j<numCharacters; j++){
                    if(assembledString[j]!='*' && assembledString[j]!=songName.charAt(j)){
                     
                        match = false;
                        
                    }
                    if(match){
                      //  legalSongs [newResults] = eligibleSongs[]
                    }
                                       
                }               
            }
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
        }catch(FileNotFoundException e){
            
            System.out.println("The file was not found");
        }
    }
    
    
}
