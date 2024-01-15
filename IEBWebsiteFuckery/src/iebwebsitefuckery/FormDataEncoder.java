/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iebwebsitefuckery;

/**
 *
 * @author mgshe
 */

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;

public class FormDataEncoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting for user input
        System.out.println("Enter __VIEWSTATE:");
        String viewState = scanner.nextLine();

        System.out.println("Enter __VIEWSTATEGENERATOR:");
        String viewStateGenerator = scanner.nextLine();

        System.out.println("Enter __EVENTVALIDATION:");
        String eventValidation = scanner.nextLine();

        // Encoding the form data
        try {
            String encodedData = encodeFormData(viewState, viewStateGenerator, eventValidation);
            System.out.println("Encoded Form Data:");
            System.out.println(encodedData);
        } catch (UnsupportedEncodingException e) {
            System.err.println("Error encoding the form data: " + e.getMessage());
        }

        scanner.close();
    }

    private static String encodeFormData(String viewState, String viewStateGenerator, String eventValidation) 
            throws UnsupportedEncodingException {
        StringBuilder encodedData = new StringBuilder();

        // Adding constant fields
        encodedData.append("__EVENTTARGET=").append(URLEncoder.encode("", "UTF-8"));
        encodedData.append("&__EVENTARGUMENT=").append(URLEncoder.encode("", "UTF-8"));
        encodedData.append("&__LASTFOCUS=").append(URLEncoder.encode("", "UTF-8"));
        encodedData.append("&txtCandidateID=").append(URLEncoder.encode("523593", "UTF-8"));
        encodedData.append("&cboYear=").append(URLEncoder.encode("19", "UTF-8"));
        encodedData.append("&cboSector=").append(URLEncoder.encode("44", "UTF-8"));
        encodedData.append("&cboExam=").append(URLEncoder.encode("2899", "UTF-8"));
        encodedData.append("&cmdSubmit=").append(URLEncoder.encode("Submit", "UTF-8"));

        // Adding user input fields
        encodedData.append("&__VIEWSTATE=").append(URLEncoder.encode(viewState, "UTF-8"));
        encodedData.append("&__VIEWSTATEGENERATOR=").append(URLEncoder.encode(viewStateGenerator, "UTF-8"));
        encodedData.append("&__EVENTVALIDATION=").append(URLEncoder.encode(eventValidation, "UTF-8"));

        return encodedData.toString();
    }
}


