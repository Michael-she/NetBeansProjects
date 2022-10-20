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
public class ArrayPopulation {
    public static void main (String args[])
    {
        //randomly populate an array with letters A-F 
        //any other letter will stop the population
        
        char letters[] = new char[50];
        
        int size = 0;
        char randomLetter = (char)  ( (int)(Math.random() * 26) + 65 );
        
        while( size  < letters.length && randomLetter < 'Z')
        {
            //add the letter to the array
            letters[size] = randomLetter;
            size++;
            //generate new letter
            randomLetter = (char)  ( (int)(Math.random() * 26) + 65 );
        
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Letters[" + i + "] : " + letters[i]);
        }
        
        System.out.println("Size : " + size);
        
        //Sequential search
        char search = 'F';
        System.out.println("Searching for the letter '" + search + "'");
        int pos = -1;
     
        for (int i = 0; i < size ; i++) {
            if (search == letters[i] ) {
                pos = i;
               
            }
        }
        
        if (pos != -1) {
            System.out.println("Found the letter '" + search + "' at index " + pos);
        }
        else
        {
            System.out.println("No such letter in the array");
        }
        
        //sequential search with a flag
        
        boolean found = false;
        search = 'A';
        pos = -1;
        
        while(!found & pos < size)
        {
            pos++;
            if(letters[pos] == search)
            {
                found = true;
            }
        }
        
        if (found) 
        {
            System.out.println("Found letter " + search + " at pos " + pos);
        }
        else
        {
            System.out.println("Item not found");
        }
        
        
        
            
    }
}
