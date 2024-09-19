/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author srbne
 */
public class WPDownload {
    public static void main(String[] args) {
        String urlString = "https://www.google.com"; // Specify the URL of the web page
        String outputFilePath = "C:\\Users\\srbne\\Downloads\\login\\demo.html"; 
        try {
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            FileWriter fileWriter = new FileWriter(outputFilePath);
            String line;
            while ((line = reader.readLine()) != null) {
                fileWriter.write(line + "\n");
            }
            reader.close();
            fileWriter.close();
            System.out.println("Web page downloaded successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
