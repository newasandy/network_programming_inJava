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
public class AuthenticationDemo {
      public static void main(String[] args) {
        // Set the default Authenticator
        Authenticator.setDefault(new CustomAuthenticator());

        try {
            // Create a URL object with the protected URL
            URL url = new URL("https://www.example.com/protected/resource");

            // Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Read the response from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Custom Authenticator implementation
    static class CustomAuthenticator extends Authenticator {
        @Override
        protected java.net.PasswordAuthentication getPasswordAuthentication() {
            // Prompt for the username and password
            String username = "your-username";
            String password = "your-password";

            // Create and return a PasswordAuthentication object
            return new java.net.PasswordAuthentication(username, password.toCharArray());
        }
    }
}
