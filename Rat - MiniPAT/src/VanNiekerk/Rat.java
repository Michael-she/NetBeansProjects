/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VanNiekerk;

import java.time.LocalDate;

/**
 *
 * @author cvnie
 */
public class Rat {
    
    private int id;
    private int price;
    private double health;
    private boolean statrat;
    private String ratname;
    private LocalDate collection;
    
    public Rat (int d, String r, int p, double h, boolean sr, LocalDate c)
    {
        id = d;
        ratname = r ;
        price = p;
        health = h;
        statrat = sr;
        collection = c;
    }

    public Rat(int price, double health, boolean statrat, String ratname, LocalDate collection) {
        this.price = price;
        this.health = health;
        this.statrat = statrat;
        this.ratname = ratname;
        this.collection = collection;
    }

    public Rat(int id) {
        this.id = id;
    }
    
    
    
    
    
    public Rat()
    {
        
    }

    
    public String toString() 
    {
        return ratname + " " + " WEAR: " + health + " R" + price + " StatRat:" + statrat;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public double getHealth() {
        return health;
    }

    public boolean isStatrat() {
        return statrat;
    }

    public String getRatname() {
        return ratname;
    }

    public LocalDate getCollection() {
        return collection;
    }
    
    
    
    
    
}
