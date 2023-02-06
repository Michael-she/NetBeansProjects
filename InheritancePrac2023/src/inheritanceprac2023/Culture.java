/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritanceprac2023;

/**
 *
 * @author Michael
 */
public class Culture {
private double bioMass;
private double nutrientsUsed;
private String batchNumber;
  public Culture(){
    
}
  public Culture(double inBM, double inNU, String inBN){
      bioMass = inBM;
      nutrientsUsed = inNU;
      batchNumber = inBN;
  }

    public double getBioMass() {
        return bioMass;
    }

    public double getNutrientsUsed() {
        return nutrientsUsed;
    }

    public String getBatchNumber() {
        return batchNumber;
    }
        
    public String toString(){
        return "BioMass: " + bioMass + " Nutrients Used: " + nutrientsUsed + " Batch Number: " + batchNumber;
        
    }
}
