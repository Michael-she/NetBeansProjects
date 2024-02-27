import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MealBookingInputHeaders {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> headers = new HashMap<>();

        // Base URL remains unchanged
        String targetURL = "https://web-apps.sun.ac.za/student-meal-booking/spring/api/store-meal-booking/en";

        // System date plus one to start bookings from the next day
        LocalDate startDate = LocalDate.now().plusDays(1);

        System.out.println("Enter headers (type 'END' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if ("END".equalsIgnoreCase(input)) {
                break;
            }

            int colonIndex = input.indexOf(":");
            if (colonIndex != -1) {
                String key = input.substring(0, colonIndex).trim();
                String value = input.substring(colonIndex + 1).trim();
                headers.put(key, value);
            }
        }

        // Array of meal slots to cycle through
        String[] mealSlots = {"B", "L", "D"};

        LocalDate endDate = startDate.plusDays(30);
        LocalDate date = startDate;

        // Loop through the next 30 days, excluding weekends
        while (date.isBefore(endDate)) {
            if (!(date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY)) {
                for (String mealSlot : mealSlots) {
                    // Update the mealDate for each request
                    String baseParameters = String.format("{\"mealDate\":\"%s\",\"mealSlot\":\"%s\",\"mealFacility\":\"2\",\"mealOption\":\"27511\",\"mealSession\":13,\"advanceBookingDays\":\"\",\"excludeWeekends\":true}", date.toString(), mealSlot);
                    String urlParameters = baseParameters;
                    System.out.println("Sending POST request for meal slot: " + mealSlot + " on " + date);
                    sendPostRequest(targetURL, urlParameters, headers);
                }
            }
            date = date.plusDays(1); // Move to the next day
        }
    }

    public static void sendPostRequest(String targetURL, String urlParameters, Map<String, String> headers) {
        HttpURLConnection connection = null;

        try {
            URL url = new URL(targetURL);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            headers.forEach(connection::setRequestProperty);

            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = urlParameters.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            int responseCode = connection.getResponseCode();
            System.out.println("Response Code : " + responseCode);
            System.out.println("Response Message : " + connection.getResponseMessage());

            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Request successfully processed.");
            } else {
                System.out.println("Request failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception: " + e.getMessage());

        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
