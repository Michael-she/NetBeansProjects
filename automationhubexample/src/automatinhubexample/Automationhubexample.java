/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automatinhubexample;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author mgshe
 */
public class Automationhubexample {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prepare your CSV data
        String csvData = "FE:23:213:23:54:64,456,789,012"; // Example CSV data: id,reading,readingMax,readingMin

        // Create an HttpClient instance
        HttpClient client = HttpClient.newHttpClient();

        // Prepare the request with the URI and the request body
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:3001/api/currentsensor/V1/CSV"))
                .header("Content-Type", "text/plain") // Assuming server expects plain text CSV
                .POST(HttpRequest.BodyPublishers.ofString(csvData))
                .build();

        try {
            // Send the POST request and get the response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Output the response for debugging purposes
            System.out.println("Response status code: " + response.statusCode());
            System.out.println("Response body: " + response.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
