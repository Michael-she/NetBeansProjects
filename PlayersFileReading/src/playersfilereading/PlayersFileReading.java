
        
        


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playersfilereading;

/**
 *
 * @author mshep23
 */
import java.util.*;
import java.io.*;

public class PlayersFileReading {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numPlayers = 0;
        
       try{ 
    Scanner playerLine = new Scanner(new File("players.txt"));
    while(playerLine.hasNextLine()) {
        String playerLineString = playerLine.nextLine();
        
        numPlayers++;
        Scanner player = new Scanner(playerLineString).useDelimiter("#");
        String firstName = player.next();
        String lastName = player.next();
        int playerID = player.nextInt();
       
        int wins = player.nextInt();
        int losses = player.nextInt();
        int draws = player.nextInt();
        
        int points = wins*3 +draws;
        
        System.out.println(firstName + " " + lastName +" (" +playerID +") " + wins +" - " +losses+" - "+draws + "\tpoints:" + points);
        
    } 
    System.out.println(numPlayers + " players attended the event");
    
    
    int searchNum = 0;
        try{
            while(searchNum != -1){
                searchNum = Integer.parseInt(JOptionPane.showInputDialog("Input the number of the player that you woul like to search for"));
              
                Scanner playerLineSearch = new Scanner(new File("players.txt"));
              
             
}
    while(playerLineSearch.hasNextLine()) {
        String playerLineString = playerLine.nextLine();
        
        numPlayers++;
        Scanner player = new Scanner(playerLineString).useDelimiter("#");
        String firstName = player.next();
        String lastName = player.next();
        int playerID = player.nextInt();
       
        int wins = player.nextInt();
        int losses = player.nextInt();
        int draws = player.nextInt();

                
                
                
            }}catch(FileNotFoundException e){
            System.out.println("The File was not found");  
        
    }    catch(FileNotFoundException e){
            System.out.println("The File was not found");
}
}
    
}
