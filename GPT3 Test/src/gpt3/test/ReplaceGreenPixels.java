/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpt3.test;

/**
 *
 * @author mgshe
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ReplaceGreenPixels {
  public static void main(String[] args) {
    // Load the image
    BufferedImage image = null;
    try {
      image = ImageIO.read(new File("input.png"));
    } catch (IOException e) {
      System.err.println("Error: failed to load image");
      System.exit(1);
    }

    // Replace green pixels with red ones
    for (int x = 0; x < image.getWidth(); x++) {
      for (int y = 0; y < image.getHeight(); y++) {
        int color = image.getRGB(x, y);
        if ((color & 0xff00) >> 8 == 0xff) {  // check if the pixel is green
          image.setRGB(x, y, 0xff0000);  // set the pixel to red
        }
      }
    }

    // Save the modified image
    try {
      ImageIO.write(image, "png", new File("output.png"));
    } catch (IOException e) {
      System.err.println("Error: failed to save image");
      System.exit(1);
    }
  }
}
