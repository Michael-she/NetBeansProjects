/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patterns.test;

/**
 *
 * @author mgshe
 */
public class PatternsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for(int i = 1; i<100; i=i+2){
            counter++;
            System.out.print("COUNT :" + counter+"\t");
            System.out.print(i);
            System.out.print("\t" + (100-i));
            System.out.println();
            sum = sum+i;
        }
        System.out.println("SUM = " + sum);
    }
    
}
