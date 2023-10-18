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
public class Question1 {
    
     public static void main(String[] args) {
         
         String inStr = JOptionPane.showInputDialog("Input your array, seperated by commas.\n This input should be surrounded with the parenthesis that indicate an array ");
         
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
       
       
       int totalInversions = 0;
               
               for(int i = 0; i<arr.length; i++){
                   for(int j = i; j<arr.length; j++){
                       
                       if(arr[i]>arr[j]){
                           totalInversions++;
                       }
                       
                       
                   }
                   
                   
                   
               }
               System.out.println(totalInversions);
        
        
    }
     
}
