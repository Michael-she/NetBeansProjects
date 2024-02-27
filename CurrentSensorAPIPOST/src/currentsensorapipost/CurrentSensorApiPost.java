import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrentSensorApiPost {

    public static void main(String[] args) {
        for (int x = 0; x < 50; x++) {
            try {
                // URL to which the request is sent
                URL url = new URL("http://localhost:3001/api/currentsensor/V1/CSV");

                // Create a connection to the URL
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                // Set the request method to POST
                connection.setRequestMethod("POST");

                // Set the request content type
                connection.setRequestProperty("Content-Type", "text/plain");

                // Enable writing to the connection output stream
                connection.setDoOutput(true);

                // Text to send in the POST request
                String textToSend = "25:6F:28:9E:78:08:0," + x + ",0.00,-0.00,0.01";

                // Write the text to the connection output stream
                try (OutputStream os = connection.getOutputStream()) {
                    byte[] input = textToSend.getBytes("utf-8");
                    os.write(input, 0, input.length);
                }

                // Get the response from the server
                int responseCode = connection.getResponseCode();
                System.out.println("Response Code: " + responseCode);

                // Read the server's response if the request was successful
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    try (BufferedReader in = new BufferedReader(
                            new InputStreamReader(connection.getInputStream()))) {
                        String inputLine;
                        StringBuilder response = new StringBuilder();

                        while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                        }

                        // Print the server's response
                        System.out.println("Response from server: " + response.toString());
                    }
                } else {
                    System.out.println("Request did not succeed. Response Code: " + responseCode);
                }

                // Close the connection
                connection.disconnect();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
