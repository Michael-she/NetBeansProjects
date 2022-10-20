/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herogame;

/**
 *
 * @author mshep23
 */
public class HeroApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // public Hero(String n, double i, double s, double a){
        
        Hero spartacus = new Hero("Spartacus", 568.75, 864.23, 645.98);
        Hero daxos = new Hero ("Daxos", 675.25, 745.21, 478.55);
        
        System.out.println(spartacus);
        System.out.println(daxos);
        
        
        spartacus.setName("Spartacus the Undefeated");
        daxos.setName("Daxos of the Twin Blades");
                
        
        if(spartacus.getMaxHealthPoints()> daxos.getMaxHealthPoints()){
            System.out.print(spartacus.getName() +" is the stronger one of the two heroes with a max health points of: ");
            System.out.println(spartacus.getMaxHealthPoints());
            
        }else{
             System.out.print(daxos.getName() + " is the stronger one of the two heroes with a max health points of: ");
            System.out.println(daxos.getMaxHealthPoints());
        }
         
        
        
        if(spartacus.resistSpell(5, "int")){
            System.out.println(spartacus.getName() +" was unable to resist the spell");   
        }else{
            
            System.out.println(spartacus.getName() +" sucsesfully resisted the spell");
        }
        
        
        
        if(daxos.resistSpell(6, "agi")){
            System.out.println(daxos.getName() + " was unable to resist the spell");   
        }else{
            
            System.out.println(daxos.getName() + " sucsesfully resisted the spell");
        }
        
        System.out.println("Good Bye");
    }
    
}
