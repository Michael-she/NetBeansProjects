/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package friendarray;
import javax.swing.*;
/**
 *
 * @author Michael
 */
public class FriendArrUI {
    public static void main(String[] args){
        
        FriendArray fa = new FriendArray();
        System.out.println(fa);
          System.out.println("\n");
        fa.sortByName();
        System.out.println(fa);
          System.out.println("\n");
        fa.sortByAge();
        System.out.println(fa);
          System.out.println("\n");
          String name = JOptionPane.showInputDialog("Please enter a name to search for");
          
          Friend friendSearched = fa.search(name);
          
          if(friendSearched!=null){
              System.out.println("FRIEND FOUND: " + friendSearched);
          }
          else{
              System.out.println("NO RESULT FOUND");
          }
          
        
        System.out.println("\n");
        
    }
}
