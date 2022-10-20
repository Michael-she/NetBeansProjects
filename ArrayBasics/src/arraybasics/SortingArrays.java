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
public class SortingArrays {
    public static void main (String args[])
    {
        //declaring and initialising a literal array
        int numArr[] = {9,7,6,4,3};
        System.out.print("[ ");
            for (int j = 0; j < numArr.length; j++) {
                System.out.print(numArr[j] + " ");
            }
            System.out.println("]");
            
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-1; j++) {
                System.out.println("Compare " + numArr[j]  + " to " + numArr[j + 1] );
                
                if(numArr[j] > numArr[j+1])
                {
                    //swop the elements
                    System.out.println("Swop the elements");
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                            
                }
            }
            System.out.println("Pass " + i + " completed ");
            System.out.print("[ ");
            for (int j = 0; j < numArr.length; j++) {
                System.out.print(numArr[j] + " ");
            }
            System.out.println("]");
        }
        
        //efficient bubble sort
     
        for (int i = numArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
               
                if(numArr[j] < numArr[j+1])
                {
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                }
            }
        }
    
        //not efficient bubble sort
        for (int i = 0; i <  numArr.length; i++) {
            for (int j = 0; j < numArr.length - 1; j++) {
                if(numArr[j] < numArr[j+1])
                {
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                }
            }
        }
        
         System.out.print("[ ");
            for (int j = 0; j < numArr.length; j++) {
                System.out.print(numArr[j] + " ");
            }
            System.out.println("]");
        
        //selection sort
        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                System.out.println("Compare " + numArr[i]  + " to " + numArr[j] );
                
                if (numArr[i] > numArr[j]) {
                    
                    int temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                }
                System.out.print("[ ");
            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k] + " ");
            }
            System.out.println("]");
            }
        }
        
         System.out.print("[ ");
            for (int j = 0; j < numArr.length; j++) {
                System.out.print(numArr[j] + " ");
            }
            System.out.println("]");
        
    }
    
    
    
    
    
}
