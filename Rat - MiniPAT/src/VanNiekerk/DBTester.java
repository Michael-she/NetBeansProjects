/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VanNiekerk;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author cvnie
 */
public class DBTester {
    
    public static void main(String[] args) {
        
        DBManager db = new DBManager ();
        db.connectDB();
        db.disconnectDB();
        
        db.DisplayAllRats();
        db.findRatsWithName("Rat");
        
        System.out.println(LocalDate.now());
        
        ArrayList <String> words = new ArrayList <String> ();
        
        words.add("Monkey");
        
        System.out.println (words.size());
        System.out.println (words.get(0));
        
        for (int i = 0; i < words.size(); i++)
        {
            System.out.println (words.get(i));
            
        }
        
        
        Vector bag = new Vector();
        
        bag.add ("Orange");
        bag.add(1);
        
        Vector rats = db.getAllRats();
        Rat r = (Rat) rats.get(0);
        
        Rat f = new Rat(5, 0.05, true, "FunniRat", LocalDate.of (1995, 01, 01));
        db.addNewEntry(f);
        
        
        
        
    }
    
}
