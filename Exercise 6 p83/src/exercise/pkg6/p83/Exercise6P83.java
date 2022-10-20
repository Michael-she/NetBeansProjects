/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg6.p83;

/**
 *
 * @author mshep23
 */
public class Exercise6P83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*   public Client(String c, String a, double b){
        clientName = c;
        accountNumber = a;
        balance = b;
        
             
        
    }*/
    
        Client dave = new Client("Dave Lebronski", "24456",100);
        
        System.out.println(dave.getClientName());
        System.out.println(dave.getAccountNumber());
        System.out.println(dave.getBalance());
       dave.changeName();
        System.out.println(dave.getClientName());
        
        
    }
    
}
