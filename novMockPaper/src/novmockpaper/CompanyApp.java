/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novmockpaper;

/**
 *
 * @author User
 */
public class CompanyApp {
    public static void main(String args[]){
        try{
        CompanyManager cm = new CompanyManager();
        System.out.println(cm.toString());
        }
        catch(Exception e){
            System.out.println("Error in App " + e); 
        }
               
    }
    
}
