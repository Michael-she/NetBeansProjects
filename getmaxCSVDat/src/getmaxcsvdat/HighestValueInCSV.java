import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HighestValueInCSV {

    public static void main(String[] args) {
        for (int i = 0; i <= 47; i += 3) {
            String fileName = i + ".csv"; // Construct file name based on the loop index
            String path =  fileName; // Adjust path to your directory structure
            findAndPrintHighestValue(path);
        }
    }

    private static void findAndPrintHighestValue(String filePath) {
        double highestValue = Double.MIN_VALUE; // Initialize with the smallest possible value
double lowestValue = Double.MAX_VALUE;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                line=line.split(",")[2];
                try {
                    double value = Double.parseDouble(line); // Assuming each line contains a single numeric value
                    if (Math.abs(value) > highestValue) {
                        highestValue = Math.abs(value); // Update highest value if current is greater
                    }
                    if (Math.abs(value)<lowestValue){
                        
                        lowestValue = Math.abs(value);
                        
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid number format in " + filePath + ": " + line);
                }
            }
            System.out.println(lowestValue);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file " + filePath + ": " + e.getMessage());
        }
    }
}
