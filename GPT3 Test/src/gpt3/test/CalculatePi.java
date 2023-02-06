/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpt3.test;

/**
 *
 * @author mgshe
8?
*/

import java.util.Random;

public class CalculatePi {
  public static void main(String[] args) {
    // Define the number of iterations to use in the calculation
    int numIterations = 1000000000;

    // Create a random number generator
    Random rand = new Random();

    // Keep track of the number of points inside the circle
    int numInside = 0;

    // Generate the points and check if they are inside the circle
    for (int i = 0; i < numIterations; i++) {
      double x = rand.nextDouble();
      double y = rand.nextDouble();

      if (x * x + y * y <= 1.0) {
        numInside++;
      }
    }

    // Calculate pi and print the result
    double pi = 4.0 * numInside / numIterations;
    System.out.println("The value of pi is " + pi);
  }
}

