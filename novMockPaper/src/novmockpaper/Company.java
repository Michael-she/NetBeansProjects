/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package novmockpaper;

/**
 *
 * @author User
 */
public class Company {

   private String companyName;
   private double profit;
   private int employees;
   private String group;
   
   Company(){
       
   }
   Company(String cn, double p, int e, String g){
       companyName = cn;
       profit = p;
       employees = e;
       group = g;       
   }

    public double getProfit() {
        return profit;
    }

    public int getEmployees() {
        return employees;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String g) {
        group = g;
    }

    public String getCompanyName() {
        return companyName;
    }
    
    
    public String toString(){
        String r = "";
        String loss;
        if (profit >=0) {
            loss = " profit";
        }
        else{
            loss = " loss";
        }
        r += companyName + " (" + group + ") \n";
        r += profit + " million Rand [" + loss + "] \n";
        r += "Emloyees: " + employees + " \n";
        return r;
    }
   
   
    
}
