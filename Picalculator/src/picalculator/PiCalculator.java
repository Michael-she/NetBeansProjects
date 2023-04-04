/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package picalculator;

/**
 *
 * @author Michael
 */
import java.math.*;

public class PiCalculator {
    public static void main(String[] args) {
        int n = 100000; // number of digits to calculate
        BigDecimal pi = BigDecimal.ZERO;
        for (int k = 0; k < n; k++) {
            BigDecimal term = new BigDecimal(1).divide(new BigDecimal(16).pow(k), n, BigDecimal.ROUND_HALF_UP)
                    .multiply(new BigDecimal(4).divide(new BigDecimal(8 * k + 1), n, BigDecimal.ROUND_HALF_UP)
                            .subtract(new BigDecimal(2).divide(new BigDecimal(8 * k + 4), n, BigDecimal.ROUND_HALF_UP))
                            .subtract(new BigDecimal(1).divide(new BigDecimal(8 * k + 5), n, BigDecimal.ROUND_HALF_UP))
                            .subtract(new BigDecimal(1).divide(new BigDecimal(8 * k + 6), n, BigDecimal.ROUND_HALF_UP)));
            pi = pi.add(term);
            System.out.println(term);
        }
       // System.out.println(pi);
    }
}

