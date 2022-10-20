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
public class Hero {
    
    
    private String name;
    private double intel;
    private double strength;
    private double agility;
    
    public Hero(){
                
    }
    
    public Hero(String n, double i, double s, double a){
        name = n;
        intel = i;
        strength = s;
        agility = a;
        
        
    }
    
    public String getName(){
        
        return(name);
        
    }
    public double getIntel(){
        return(intel);
    }
    
    public double getStrength(){
        
        return(strength);
        
    }
    
    public double getAgiltity(){
     return(agility);   
    }
    
    
    public void setName(String n){
        name = n;
        
    }
    
    public String toString(){
    
    return (name + " int: " +intel+" , str: " + strength + " , agi:"+agility);
}

    
   public double getMaxHealthPoints(){
       double maxHealth = 100 + ((strength /999.0)*100) - (intel/100.0)*12;
        maxHealth = Math.round(maxHealth*100)/100;
        return (maxHealth);
        
    }
   
   public boolean resistSpell(int lvl, String type){
       
       double resistValue = 0;
       if (type.equals("int")){
           resistValue = intel;
           
       }
       else if (type.equals("str")){
           resistValue = strength;
           
       }
        else if (type.equals("agi")){
           resistValue = agility;
           
       }
       
       if ((lvl*100)>resistValue){
           return(true);
       }
       else{
           return(false);
       }
       
   }

}
