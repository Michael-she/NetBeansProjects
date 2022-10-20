package exercise.pkg6.p83;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mshep23
 */
public class Client {
    private String clientName;
    private String accountNumber;
    private double balance;
    
    public Client(){
        
    }
    public Client(String c, String a, double b){
        clientName = c;
        accountNumber = a;
        balance = b;
        
             
        
    }
    
    public void setClientName(String c){
        clientName  = c;
        
        
    }
    public void setAccountNumber(String a){
        accountNumber = a;
    }
    public void setBalance(double b){
        balance = b;
    }
    
    public String getClientName(){
        return clientName;
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    
    public double getBalance(){
        
        return balance;
    }
    
    public String changeName(){
        int space = clientName.indexOf(" ");
        String firstName = clientName.substring(0,space);
        String lastName = clientName.substring(space+1, clientName.length());
        
        clientName = lastName+" "+firstName;
        return(clientName);
    }
    
    
    
}
