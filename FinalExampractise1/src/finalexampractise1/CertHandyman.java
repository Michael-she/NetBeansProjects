/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalexampractise1;

/**
 *
 * @author mgshe
 */
public class CertHandyman extends Handyman{
    
    private String certNo;
    
    public CertHandyman(int i, String fn, String ln, String c){
    
    super(i, fn, ln);
    certNo = c;
    
    
}

    public String toString() {
        return super.toString()+"\t"+certNo; 
    }
    
    
    
    
    
}
