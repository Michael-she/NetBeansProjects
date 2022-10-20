/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytest;

/**
 *
 * @author mshep23
 */
public class ArrayTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numArr[][]=new int [10][10];
        
        for(int j = 0; j<10; j++){
            numArr[j][0] = j;
        }
        
        String dotw [] = {"Monday", "Tuesay", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    
    for (int i = 0; i<dotw.length; i++){
        
        
        System.out.println(dotw[i] + ": "+ dotw[i].length());
    }
    
    }
    
}
