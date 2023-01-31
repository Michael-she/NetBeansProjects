/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2021.prac.practise;

import java.time.LocalTime;

/**
 *
 * @author User
 */
public class RaceTeam 
{
    private String teamName, carMake;
    
    private Racer driver, navigator;
    private LocalTime[] stages = new LocalTime[4];
    
    public RaceTeam (String tn, String cm , Racer d, Racer n)
    {
        teamName = tn;
        carMake = cm;
        driver = d;
        navigator =n;
    }

    public String getTeamName() {
        return teamName;
    }

    public Racer getDriver() {
        return driver;
    }
    public void loadStageTimes(LocalTime s[])
    {
        stages = s;
    }
    public LocalTime getStage(int pos)
    {
        return stages[pos-1];
    }
    public String toString()
    {
        String r ="";
        r = "Team " + teamName + "(" + carMake +" ) \n";
         r = r+ "Driver " + driver.getName()+ " \n";
         r  =  r+ "Navigator " + navigator.getName()+" \n";
         r = r+ "Stage Times";
         
         if(stages[0] ==null)
         {
            r = r + "--No Results Loaded --";
         }
         else
         {
             for (int i = 0; i < 4; i++) {
                 r+= "\t" + (i+1) + stages[1] + "\n" ;
             }
         }
        return r;
    }
 }
