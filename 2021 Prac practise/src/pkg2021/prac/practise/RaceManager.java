/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2021.prac.practise;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class RaceManager 
{
    
    Racer raceArr[] = new Racer[800];
    
  public void RaceManager(){
    try{
        Scanner sc = new Scanner (new File("raceteams.txt"));
        int i  = 0;
        while(sc.hasNextLine())
        {
            String teamLine = sc.nextLine(); 
            // he may not give us the date in a convenient format - if it is in a weird format - u need to use the date time formatter
            String driverLine = sc.nextLine();
            String navLine = sc.nextLine();
            String teamine = sc.nextLine();
            String tokens [] = driverLine.split("#");
            Racer driver = new Racer (tokens[0], LocalDate.parse(tokens[1]), tokens[2],tokens[3]);
            tokens = navLine.split("#");
            Racer navi = new Racer (tokens[0], LocalDate.parse(tokens[1]), tokens[2],tokens[3]);
             tokens = teamine.split("#");
            Racer team = new Racer (tokens[0], LocalDate.parse(tokens[1]), tokens[2],tokens[3]);
raceArr[i] = team;
i++;
            
            
        }
        sc.close();
       
        
    } catch(Exception e) {
        System.out.println(" Error");
    }
  }
      
  public String Hello(){
      
      
      
      return "Hello";
  }
  
  public String toString(){
      for (int i  = 0; i<raceArr.length(); i ++){
      System.out.println(raceArr[i]);
      
  }
      
      
  }


}
