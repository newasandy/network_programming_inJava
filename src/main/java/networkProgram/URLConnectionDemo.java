/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgram;
import java.io.*;
import java.net.*;
/**
 *
 * @author srbne
 */
public class URLConnectionDemo {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.example.com"); // Replace with your desired URL

            // Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Optional: Set request headers
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            // Open an input stream to read the response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // Read the response
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            // Close the reader
            reader.close();

            // Print the response
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
