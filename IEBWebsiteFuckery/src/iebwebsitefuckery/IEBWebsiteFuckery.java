/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iebwebsitefuckery;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
/**
 *
 * @author mgshe
 */
public class IEBWebsiteFuckery {

   public static void main(String[] args) {
        try {
            sendPostRequest();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void sendPostRequest() throws Exception {
    URL url = new URL("https://www.ieb-online.co.za/asp/candidate_year_sector_select.aspx");

    // Loop through different values for cboExam
    for (int examValue = 2890; examValue <= 3050; examValue++) { // Adjust the 100 to the maximum value you expect
        // Modify the urlParameters to include the current examValue
        String urlParameters = "__EVENTTARGET=&__EVENTARGUMENT=&__LASTFOCUS=&txtCandidateID=523593&cboYear=19&cboSector=44&cboExam=" 
                                + examValue 
                                + "&cmdSubmit=Submit&__VIEWSTATE=%2FwEPDwULLTE0ODQ3Mjc0MjIPZBYCAgQPZBYKAgEPZBYEZg8WAh4HVmlzaWJsZWgWAgICD2QWAmYPZBYCAgEPDxYCHgRUZXh0ZWRkAgEPFgIfAGhkAgkPDxYGHglGb3JlQ29sb3IKjQEfAWUeBF8hU0ICBGRkAgsPEGQQFQcRPCBOb25lIFNlbGVjdGVkID4EMjAxOAQyMDE5BDIwMjAEMjAyMQQyMDIyBDIwMjMVBwItMQIxNAIxNQIxNgIxNwIxOAIxORQrAwdnZ2dnZ2dnFgECBmQCDQ8QZBAVAxE8IE5vbmUgU2VsZWN0ZWQgPgZGVFNUVUQDTlNDFQMCLTECNDQBMhQrAwNnZ2cWAQIBZAIPDxBkEBUCETwgTm9uZSBTZWxlY3RlZCA%2BJ0ZUU1RVRCAtIEZVUlRIRVIgU1RVRElFUyBQUk9HUkFNTUUgMjAyMxUCAi0xBDI4OTkUKwMCZ2cWAWZkZIw%2B%2B5V%2FfN79atmm80RHsrPfiEjb9P771Vlyk3G%2FqFG%2F&__VIEWSTATEGENERATOR=653C897D&__EVENTVALIDATION=%2FwEdABHYIen2221O7eUhBR31IeHTY04CQXeQFRgLOc52oHlbkxYxeFFRHS6BDU1uClu99kfZShQkwJcVwWiEbsCMGRac9ZCPf6HpcufLG7%2FJveDPOWV08EHiCMwVi4%2BtHUkKpXncphkSGOaUEvYdctNT3YhvmxoYzum56VBNV%2FdoikU22R5qp%2BMlHu9Muio12%2Bt70vRlPwFHhsnkuqSyrI%2BYBisT8BT5%2F%2BPFYhJ%2FBh4LV0X8XsAUnzkiygAk462LAAlMm8RJ%2BhXC4YI9uGAUdZ2DWMiXFjCsTitJtCRqsGsslnhCUcU3ZjmgpXoyRddyX9trofm76SUOenZOECiM13pOc5U6PYRW60HLmv6%2FzHn0RnZ8H42sBRPiWlVQOy2J7tji719HpVD0i39VFMvdJEhhCYpZ"; // Rest of your parameters

        // Establishing the connection
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setRequestProperty("Content-Length", Integer.toString(urlParameters.getBytes().length));
        connection.setRequestProperty("Content-Language", "en-US");
        connection.setUseCaches(false);
        connection.setDoOutput(true);


        // Sending the request
        try (OutputStream outputStream = connection.getOutputStream()) {
            outputStream.write(urlParameters.getBytes(StandardCharsets.UTF_8));
        }

        // Reading the response
        int responseCode = connection.getResponseCode();
        System.out.println("POST Response Code for cboExam " + examValue + ": " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Print the response for the current examValue
            System.out.println("Response for cboExam " + examValue + ": " + response.toString());
        } else {
            System.out.println("POST request not successful for cboExam " + examValue + ". Response Code: " + responseCode);
        }

        connection.disconnect();
    }
}
    
}
