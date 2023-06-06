/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2020.gr12.paper;

/**
 *
 * @author mgshe
 */

public class Client {
    private String clientName;
    private String preferredCounsellor;
    private int earliestHour;
        
    public Client() {
        
    }

    public Client(String inCN, String inPC, int inEH){
        clientName = inCN;
        preferredCounsellor = inPC;
        earliestHour = inEH;
        
        if(earliestHour > 16){
            earliestHour = 16;
        }
        
    }
    
    public String getClientName(){
        return clientName;
    }
    
    public String getPreferredCounsellor(){
        return preferredCounsellor;
    }
    
    public int getEarliestHour(){
        return earliestHour;
    }
    
    public String toString(){
        return clientName+"\t"+preferredCounsellor+"\tEarliest "+earliestHour+":00";
    }
    
    
    
    
    
}
