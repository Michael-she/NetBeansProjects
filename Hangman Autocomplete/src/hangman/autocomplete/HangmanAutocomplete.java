/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.awt.BorderLayout;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class HangmanAutocomplete {

    /**
     * @param args the command line arguments
     */
    
    
      private static volatile boolean wPressed = false;
    public static boolean isWPressed() {
        synchronized (HangmanAutocomplete.class) {
            return wPressed;
        
    }}
    
    
    public static void main(String[] args) {
        
      
        
        
        
        String words [] = new String [1000];
        String yes[] = new String [1000];
        
        String wordsLong [] =  new String [500000];
        String yesLong[] = new String [500000];
        
        try{
        Scanner scFileShort = new Scanner(new File("words1000.txt"));
        Scanner scFile = new Scanner(new File("words.txt"));
        
        
        int x = 0;
        while(scFileShort.hasNextLine()){
            
            words[x] = scFileShort.nextLine();
            x++;
           // System.out.println("Line Count"+ x);
        }
        
        
            System.out.println("Line Count"+ x);
            
            int hangmanSize = Integer.parseInt(JOptionPane.showInputDialog("How many letters?"));
            
            String wordsWithLetterCount [] = new String[1000];
            int wordsWithLetterCountSize = 0;
            for (int i = 0; i<x; i++){
                if(words[i].length() == hangmanSize){
                    
                    wordsWithLetterCount[wordsWithLetterCountSize] = words[i];
                 
                   // System.out.println(wordsWithLetterCount[wordsWithLetterCountSize]);
                                    
                    wordsWithLetterCountSize++;
                
                }
                
            }
            System.out.println(wordsWithLetterCount[0]);
                System.out.println("words with " +hangmanSize+" letters: "+wordsWithLetterCountSize);
                
                
                String guess = "";
                char disallowedLetters[] = new char[100];
                
                
                int disallowedCharPos = 0;
                  System.out.println(wordsWithLetterCount[0]);
                while(!guess.equalsIgnoreCase("-1")){
                    int resultSize = 0;
                    guess = JOptionPane.showInputDialog("Plase input the word, use * to show unknown");
                    
                   disallowedLetters[disallowedCharPos] =  JOptionPane.showInputDialog("Was there a bad guess, input * if not").charAt(0);
                    disallowedCharPos++;
                    
                    char guessArr[][] = new char [100][2];
                    int guessSize = 0;
                    
                    for(int i = 0; i<guess.length(); i++){
                        if(guess.charAt(i) != '*'){
                        guessArr[guessSize][0] = guess.charAt(i);
                        guessArr[guessSize][1] =(char) i;
                        guessSize++;
                        
                        }
                    }
                    for(int i = 0; i<yes.length; i++){
                    yes[i] = "";
                }
                      
                    for(int i = 0 ; i<wordsWithLetterCountSize; i++){
                        boolean toAdd = true;
                        
                        String word = wordsWithLetterCount[i];
                         
                        
                        for(int j = 0; j<100; j++){
                            for(int k = 0; k<word.length(); k++){
                            if(Character.toUpperCase(word.charAt(k)) ==Character.toUpperCase(disallowedLetters[j])){
                                
                                toAdd = false;
                            }
                            
                            }
                            for(int k = 0; k<guessSize; k++){
                                if(guessArr[k][0]!=word.charAt((int)guessArr[k][1])){
                                    
                                    toAdd = false;
                                    
                                }
                                
                            }
                            
                            for(int k = 0; k<word.length(); k++){
                            
                            }
                        }
                        if(toAdd){
                            System.out.println("resultsize = " + resultSize);
                            yes[resultSize] = word;
                            resultSize++;
                            
                        }
                        
                        
                        
                        
                        
                    }
                    try{
                   Runtime.getRuntime().exec("cls");    
                    }
                    catch(Exception e){
                        
                        
                    }
                    for(int i = 0; i<resultSize; i++){
                        
                        System.out.println(yes[i]);
                    }
                    
                
                
                
                
                    System.out.println(resultSize+" results");
        }}
        
        catch(FileNotFoundException e){
            System.out.println("The File was not found");
            
        }
    }
    
}
