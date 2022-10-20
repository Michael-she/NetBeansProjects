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
public class ArrayManagerUI {
    public static void main (String args[])
    {
        //instantiate the object
        ArrayManager am = new ArrayManager();
        //call its methods
        //reminder the toString method is invoked 
        //whenever an object reference in placed
        //into a println
        System.out.println(am);
        am.bubbleSort();
        System.out.println(am);
        
        System.out.println(am.findPerson("Bob"));
        
       // am.removeElement(0);
        System.out.println("Hello World");    
    am.removeDuplicates();
    System.out.println("\n\n\n\n\n");
    System.out.println(am);
    
    
    }
}
