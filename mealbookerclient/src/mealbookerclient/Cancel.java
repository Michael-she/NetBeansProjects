import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cancel {
    public static void main(String[] args) {
        // URL to make GET request
        String url = "https://web-apps.sun.ac.za/student-meal-booking/spring/api/cancel-meal-booking/en/116012";
        List<String> rawHeaders = new ArrayList<>();
        Set<String> disallowedHeaders = new HashSet<>(List.of(
            "Connection", // Managed by HttpClient
            "Host", // Automatically set by HttpClient
            "Content-Length", // Managed by HttpClient
            "Transfer-Encoding", // Managed by HttpClient
            "TE", // Managed by HttpClient
            "Trailer", // Managed by HttpClient
            "Upgrade" // Managed by HttpClient
        ));

        System.out.println("Enter headers (one per line), followed by an empty line to finish:");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                rawHeaders.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
            return;
        }

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder().uri(URI.create(url));

        // Parsing and adding headers to the request, excluding disallowed headers
        rawHeaders.forEach(headerLine -> {
            String[] header = headerLine.split(": ", 2);
            if (header.length == 2 && !disallowedHeaders.contains(header[0])) {
                requestBuilder.header(header[0], header[1]);
            }
        });

        HttpRequest request = requestBuilder.build();

        // Sending the HTTP GET request
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response status code: " + response.statusCode());
            System.out.println("Response body: " + response.body());
        } catch (IOException | InterruptedException e) {
            System.err.println("Request failed: " + e.getMessage());
        }
    }
}
