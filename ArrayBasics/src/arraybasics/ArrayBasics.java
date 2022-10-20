/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraybasics;

/**
 *
 * @author rnr
 */
public class ArrayBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //datatype identifier value
        //type name value
            //declaring a variable
            //assigning a value
        int num = 10;
        
        double amount;
        
        amount = 10.2;
        
        //declaring an array
        //datatype identifier[] (note the square brackets)
        int arr[];
        
        //initialise the size of the array
        arr = new int[10];
        
        //an array is composed of elements
        //each element has a index in that array
        //the first element is at index 0
        //the last element's index is at size/length of the array -1
        
        //accessing any element
        //array reference[index]
        System.out.println(arr[0]);
        //storing a value into the array
        //array reference[index]
        arr[0] = 77;
        System.out.println(arr[0]);
        
        arr[1] = 88;
        arr[2] = 123;
        arr[3] = 500;
        
        System.out.println(arr[1] + " " + arr[2] + " " + arr[3]);
        
        System.out.println(arr.length);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] :" + arr[i]);
        }
        
        double accounts[] = new double[20];
        
        //populating an array
        //with random real numbers in the range 1.00 - 100.99
        for (int i = 0; i < accounts.length; i++) {
            
            double random = (Math.random() * 100) + 1;
            random = Math.round(random * 100) / 100.0;
            
            accounts[i] = random;
        }
        
        //display all the data in the array
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("accounts[" + i + "] : " + accounts[i]);
        }
       // System.out.println("Hello there");
        //total
        //average
        //max (and its index in the array)
        //min (and its index)
        //count the number of values above the average
        
    }
    
}
