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
public class Question2 {
   
    
     public static void main(String[] args) {
        // TODO code application logic here
    
     String input = JOptionPane.showInputDialog("Please input your string");
     boolean StringValid = true;
     int arr [] = new int [input.length()]; 
     int arrayPos = 0;
     for(int i = 0; i<input.length(); i++){
         
         if(input.charAt(i) == '('){
             
             arr[arrayPos] = 1;
             arrayPos++;
             
         }else if(input.charAt(i) == ')'){
             arrayPos--;
             if(arrayPos == -1){
                 arrayPos = 0;
                 StringValid = false;
             }
             if(arr[arrayPos] == 1){
                 arr[arrayPos] = 0;
             }else{
                 StringValid = false;
             } 
         }
         
         if(input.charAt(i) == '['){
             
             arr[arrayPos] = 2;
             arrayPos++;
             
         }else if(input.charAt(i) == ']'){
             arrayPos--;
             if(arrayPos == -1){
                 arrayPos = 0;
                 StringValid = false;
             }
             if(arr[arrayPos] == 2){
                 arr[arrayPos] = 0;
             }else{
                 StringValid = false;
             } 
         }
         
         if(input.charAt(i) == '{'){
             
             arr[arrayPos] = 3;
             arrayPos++;
             
         }else if(input.charAt(i) == '}'){
             arrayPos--;
             if(arrayPos == -1){
                 arrayPos = 0;
                 StringValid = false;
             }
             if(arr[arrayPos] == 3){
                 arr[arrayPos] = 0;
             }else{
                 StringValid = false;
             } 
         }
         
     }
     
     if(arrayPos != 0){
                StringValid = false;
             }
         System.out.println(StringValid);
     
     }
}
