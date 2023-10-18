/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estonianopen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author mgshe
 */
public class WordMatch {
    public static void main(String [] args){
        try{
            
            String completeSentence = "";
        
        Scanner scFile = new Scanner(new File("Estonian.txt"));
       
        int maxWordLength = 0;
        String wordListStr [] = new String[1000000];
        char prevChar = 'z';
        int index = 0;
        while(scFile.hasNextLine()){
            String word = scFile.nextLine().split("/")[0];
            if(word.charAt(0)!= prevChar){
                System.out.println(word.charAt(0));
                prevChar = word.charAt(0);
            }
            
            wordListStr [index]= word;
            
            index++;
            
            
            if(word.length() > maxWordLength){
                
                maxWordLength = word.length();
            }
            
        }
        
        String wordList [][] = new String[maxWordLength+1][index];
        String wordListSorted [][] = new String[maxWordLength+1][index];
        int letterNum [] = new int [maxWordLength+1];
        for(int i = 0 ; i<index; i++){
           
            wordList[wordListStr[i].length()][letterNum[wordListStr[i].length()]] = wordListStr[i].toLowerCase();
             String unSortedWord = wordList[wordListStr[i].length()][letterNum[wordListStr[i].length()]];
            
               boolean sorted = false;
               char wordCharArr []= new char [unSortedWord.length()];
               wordCharArr = unSortedWord.toLowerCase().toCharArray();
               while(!sorted){
                   sorted = true;
                   for(int j = 0; j<wordCharArr.length-1; j++){
                       if(wordCharArr[j]>wordCharArr[j+1]){
                           sorted = false;
                           
                           char c = wordCharArr[j];
                           wordCharArr[j] = wordCharArr[j+1];
                           wordCharArr [j+1] = c;
                                   
                           
                           
                       }
                       
                       
                   }
                   
                   
                   
                   
                   wordListSorted[wordListStr[i].length()][letterNum[wordListStr[i].length()]] = Arrays.toString(wordCharArr);
                   
                   
               }
            
            letterNum[wordListStr[i].length()]++;
            
            
        }
        
         System.out.println("Done");
        
        for(int i = 0; i<letterNum[1]; i++){
            
            
            System.out.println(wordList[3][i]);
            
        }
        
        
        Scanner scInput = new Scanner(new File("input_000.txt"));
        
       String consonantsSTR = scInput.nextLine();
       String vowelsStr = scInput.nextLine();
       
       
       char symbols []= {',' ,'.','!'};
       
      
       String consonats[] = consonantsSTR.split(" ");
       String vowels [] = vowelsStr.split(" ");
       
       
       
       int numWords = 0;
       if(consonats.length >vowels.length){
           
           numWords = consonats.length;
           
       }else{
           numWords= vowels.length;
       }
       
       for(int i = 0; i< numWords; i++){
           
           
            for(int f = 0; f<symbols.length; f++){
       if(symbols[f] == consonats[i].charAt(consonats[i].length()-1)  ){
           consonats[i] = consonats[i].substring(0, consonats[i].length()-1);
           
           
       }
       if(symbols[f] == vowels[i].charAt(vowels[i].length()-1)  ){
           vowels[i] = vowels[i].substring(0, vowels[i].length()-1);
           
           
       }
       }
            
            
            
       int wordLength = consonats[i].length()+vowels[i].length();
       String currentWord = consonats[i]+vowels[i];
       currentWord = currentWord.toLowerCase();
       String currentWordUnsorted = currentWord;
       char letters [] = currentWord.toLowerCase().toCharArray();
       boolean sorted = false;
           
            
               while(!sorted){
                   sorted = true;
                   for(int j = 0; j<letters.length-1; j++){
                       if(letters[j]>letters[j+1]){
                           sorted = false;
                           
                           char c = letters[j];
                           letters[j] = letters[j+1];
                           letters [j+1] = c;
                                   
                           
                           
                       }
                       
                       
                   }
                   
                   
                   
                   
                  currentWord = Arrays.toString(letters);
                   
                   
               }
               
           System.out.println(currentWord);
      
           
           boolean wordFound = false;
       for(int j = 0; j<wordListSorted[wordLength].length; j++){
           //System.out.println(wordListSorted[wordLength][j]);
           if(wordListSorted[wordLength][j] == null){
               if(!wordFound){
               System.out.println("NO WORD FOUND FOR " + currentWordUnsorted);
               completeSentence+= " [No word FOR " + currentWordUnsorted+"] "; 
               }
               break;
           }
          if(wordListSorted[wordLength][j].equalsIgnoreCase(currentWord)){
              
              System.out.println(wordListSorted[wordLength][j] + "IS EQUAL TO " + currentWord);
              if(wordFound){
                  completeSentence+= " OR";
              }
              completeSentence+=" "+wordList[wordLength][j];
              wordFound = true;
              
              
          }else{
             //  System.out.println(wordListSorted[wordLength][j] + " NOT " + currentWord);
                
          }
           
           
           
           
           
       }
       
           
               }
            System.out.println(" -- FINAL SENTENCE ---");
            System.out.println(completeSentence);
        
        
        }catch (FileNotFoundException e){
            
            System.out.println("File not found");
        }
        
        
    }
    
    
    
    
}
