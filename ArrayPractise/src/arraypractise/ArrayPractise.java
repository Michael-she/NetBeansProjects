/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractise;

/**
 *
 * @author mshep23
 */
public class ArrayPractise {

   static double testArray[][] = new double[2000][2000];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testArray[100][100] = 121.55;
        System.out.println(testArray[100][100]);
        
       System.out.println(""); 
          System.out.println("");
            System.out.println("");
            
            for (int i = 0; i < 2000; i++) {
           for (int v = 0; v < 200s0; v++) {
            testArray[i][v] = Math.random()*500-250;
            testArray[i][v] = Math.round(testArray[i][v]*100)/100.0;
        } 
            
        }
            
        for (int i = 0; i < 2000; i++) {
            
           for (int v = 0; v < 2000; v++) {
             //  testArray[i][v] = i*200+v;
               if(testArray[i][v]>=0){
                  System.out.print(" ");
                   
               }else{
                   
                   testArray[i][v]= testArray[i][v]*(-1);
               }
               
             //  if(testArray[i][v]%1==0){
             //       System.out.print(".0");
             //  }
               
               
               System.out.print("\t ");
               
               
              if(testArray[i][v]<10){
              System.out.print(0);
              }
               if(testArray[i][v]<100){
              System.out.print(0);
              }
            System.out.print(testArray[i][v]);
            if((testArray[i][v]*10)%1==0){
                    System.out.print("0");
               }
            System.out.print(" ");
        } 
            System.out.println("");
        }
                
    }
    
}
