/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VanNiekerk;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Owners {
    
    public int ownerID; 
    public String ownerName;
    public LocalDate dateCollected;
    public double ratWorth;
    public int ratsOwned;
    public boolean indie;
    public String nationality;

    public Owners(int ownerID, String ownerName, LocalDate dateCollected, double ratWorth, int ratsOwned, boolean indie, String nationality) {
        this.ownerID = ownerID;
        this.ownerName = ownerName;
        this.dateCollected = dateCollected;
        this.ratWorth = ratWorth;
        this.ratsOwned = ratsOwned;
        this.indie = indie;
        this.nationality = nationality;
    }

    public Owners(String ownerName, LocalDate dateCollected, double ratWorth, int ratsOwned, boolean indie, String nationality) {
        this.ownerName = ownerName;
        this.dateCollected = dateCollected;
        this.ratWorth = ratWorth;
        this.ratsOwned = ratsOwned;
        this.indie = indie;
        this.nationality = nationality;
    }

    public Owners(int ownerID) {
        this.ownerID = ownerID;
    }

    public Owners() {
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public LocalDate getDateCollected() {
        return dateCollected;
    }

    public void setDateCollected(LocalDate dateCollected) {
        this.dateCollected = dateCollected;
    }

    public double getRatWorth() {
        return ratWorth;
    }

    public void setRatWorth(double ratWorth) {
        this.ratWorth = ratWorth;
    }

    public int getRatsOwned() {
        return ratsOwned;
    }

    public void setRatsOwned(int ratsOwned) {
        this.ratsOwned = ratsOwned;
    }

    public boolean isIndie() {
        return indie;
    }

    public void setIndie(boolean indie) {
        this.indie = indie;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return ownerName + " dateCollected: " + dateCollected + " R" + ratWorth;
    }
    
    
    
    
}
