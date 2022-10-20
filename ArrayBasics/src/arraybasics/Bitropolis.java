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
public class Bitropolis {
    public static void main (String args[])
    {
        //declare and initialize a size for the array
        int blocks[] = new int[200];
        
        //population
        for (int i = 0; i < blocks.length; i++) {
            int bitizens = (int) (Math.random() * 901) + 100;
            blocks[i] = bitizens;
        }
        
        //display
        System.out.println("**********************");
        System.out.println("City of Bitropolis");
        System.out.println("**********************");
        for (int i = 0; i < blocks.length; i++) {
            System.out.println("Block [" + i + "] " + blocks[i] );
        }
        
        //summary data
        int total = 0;
        
        //assumes that the max and min refer to indexes in the array
        int max = 0;
        int min = 0;

        for (int i = 0; i < blocks.length; i++) {
            total+=blocks[i];
            
            if (blocks[max] < blocks[i]) {
                max = i;
            }            
            if (blocks[min] > blocks[i]) {
                min = i;               
            }
        }

        
        System.out.println("Summary Data");
        System.out.println("Average : " + (total/blocks.length));
        System.out.println("The block with the higest population is Block " + max + " with " +  blocks[max] + " bitizens");
        System.out.println("The block with the lowest population is Block " + min  + " with " + blocks[min] + " bitizens");
        
    }
}
