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
public class Trades {
    
    public int tSN;
    public String seller;
    public String buyer;
    public String rat;
    public double tradeVal; 
    public LocalDate dateTraded;
    public int tradeTier;
    public boolean RTAC;

    public Trades(int tSN, String seller, String buyer, String rat, double tradeVal, LocalDate dateTraded, int tradeTier, boolean RTAC) {
        this.tSN = tSN;
        this.seller = seller;
        this.buyer = buyer;
        this.rat = rat;
        this.tradeVal = tradeVal;
        this.dateTraded = dateTraded;
        this.tradeTier = tradeTier;
        this.RTAC = RTAC;
    }

    public Trades(String seller, String buyer, String rat, double tradeVal, LocalDate dateTraded, int tradeTier, boolean RTAC) {
        this.seller = seller;
        this.buyer = buyer;
        this.rat = rat;
        this.tradeVal = tradeVal;
        this.dateTraded = dateTraded;
        this.tradeTier = tradeTier;
        this.RTAC = RTAC;
    }

    public Trades(int tSN) {
        this.tSN = tSN;
    }

    public Trades() {
    }

    public int gettSN() {
        return tSN;
    }

    public void settSN(int tSN) {
        this.tSN = tSN;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getRat() {
        return rat;
    }

    public void setRat(String rat) {
        this.rat = rat;
    }

    public double getTradeVal() {
        return tradeVal;
    }

    public void setTradeVal(double tradeVal) {
        this.tradeVal = tradeVal;
    }

    public LocalDate getDateTraded() {
        return dateTraded;
    }

    public void setDateTraded(LocalDate dateTraded) {
        this.dateTraded = dateTraded;
    }

    public int getTradeTier() {
        return tradeTier;
    }

    public void setTradeTier(int tradeTier) {
        this.tradeTier = tradeTier;
    }

    public boolean isRTAC() {
        return RTAC;
    }

    public void setRTAC(boolean RTAC) {
        this.RTAC = RTAC;
    }

    public String toString() {
        return "Trades{" + "seller=" + seller + ", buyer=" + buyer + ", rat=" + rat + ", tradeVal=" + tradeVal + ", dateTraded=" + dateTraded + ", tradeTier=" + tradeTier + ", RTAC=" + RTAC + '}';
    }
     
        
     
     
     
}
