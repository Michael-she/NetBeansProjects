/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package michael_shepstone_programming_challenge;

import javax.swing.JOptionPane;

/**
 *
 * @author mgshe
 */
public class Question3 {
    
     public static void main(String[] args) {
       String inStr = JOptionPane.showInputDialog("Input your array, seperated by commas.\n This input should be surrounded with the parenthesis that indicate an array ");
         int target = Integer.parseInt(JOptionPane.showInputDialog("Please input te target number"));
         
         inStr = inStr.substring(1, inStr.length()-1);
         
         String inStrArr [] = inStr.split(",");
         
         
         
       int arr[] = new int [inStrArr.length];
       
       
       for(int i = 0; i<inStrArr.length; i++){
           if(i!=0){
           inStrArr[i] = inStrArr[i].substring(1);
           }
           arr[i] = Integer.parseInt(inStrArr[i]);
           
           //System.out.println(arr[i]);
       }
       
       int solutionsArr [][] = new int [inStrArr.length*inStrArr.length][2];
       
       int solutionsCount = 0;
       
       
       for(int i = 0; i<inStrArr.length; i++){
            for(int j = i; j<inStrArr.length; j++){
           
                
                if( (arr[i]+arr[j]) == target){
                    
                    solutionsArr [solutionsCount][0] = i;
                    solutionsArr [solutionsCount][1] = j;
                    solutionsCount++;
                           
                }
                
                
           
       }
       
       
       
    }
       
       if(solutionsCount == 0){
           System.out.println("None");
       }
       
      for(int i = 0; i<solutionsCount; i++){
          if(i>0){
              System.out.print(" or ");
          }
          
          System.out.print("["+solutionsArr [i][0] + ", "+solutionsArr [i][1] +"]");
          
          
      }
    
}
     
}
