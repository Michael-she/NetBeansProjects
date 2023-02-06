/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novmockpaper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CompanyManager {
    private Company cArr[] = new Company[500];
    private int size;
    
    CompanyManager(){
        try{
        Scanner scFile = new Scanner(new File("companies.txt"));
        
        while(scFile.hasNextLine()){
            String line = scFile.nextLine();
            String tokens[] = line.split("#");
            String cn = tokens[0];
            double p = Double.parseDouble(tokens[1]);
            int e = Integer.parseInt(tokens[2]);
            String g = tokens[3];
            
            Company c = new Company(cn, p, e, g);
            cArr[size] = c;
            size++;
                     
        }
        scFile.close();
        }
        catch(FileNotFoundException e){
            System.out.println("file not found" + e);
        }
        catch(Exception e){
            System.out.println("Error in company manager constructor");
        }
    }
    
    public String toString(){
        String r = "";
        for (int i = 0; i < size; i++) {
            r += cArr[i].toString();
        }
        return r;
    }
    public String inTheBlack(){
        String r = "";
        for (int i = 0; i < size; i++) {
            if (cArr[i].getProfit() > 0) {
                r += cArr[i].getCompanyName();
            }
        }
        return r;
    }
    public double averageLosses(){
        double total = 0.0;
        int num = 0;
        for (int i = 0; i < size; i++) {
            if (cArr[i].getProfit() < 0) {
                total += cArr[i].getProfit();
                num++;
            }
        }
        double avg = Math.round(total / num * 100) / 100.0;
        return avg;
    }
    public int companyCount(String s){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cArr[i].getGroup().equalsIgnoreCase(s)) {
                count++;
            }
        }
        return count;
    }
    public void insertCompany(Company c, int pos){
        for (int i = size; i < pos; i--) {
            cArr[i + 1] = cArr[i];
            cArr[pos] = c;
            size++;
        }
    }
    
    public void deleteCompany(int pos){
        for (int i = pos; i < size; i++) {
            cArr[i] = cArr[i + 1];
            size--;
        }
    }
    public void sort(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (cArr[j].getProfit() > cArr[j + 1].getProfit()) {
                    Company temp = cArr[j];
                    cArr[j] = cArr[j + 1];
                    cArr[j + 1] = temp;
                }
            }
        }
    }
}
