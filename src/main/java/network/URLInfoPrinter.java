/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 *
 * @author srbne
 */
public class URLInfoPrinter {
    public static void main(String[] args) {
        try {
            String urlString = "https://www.youtube.com";
             URL url = new URL(urlString);
            URLConnection connection = url.openConnection();
            String contentType = connection.getContentType();
            System.out.println("Content Type: " + contentType);
            int contentLength = connection.getContentLength();
            System.out.println("Content Length: " + contentLength + " bytes");
            String contentEncoding = connection.getContentEncoding();
            System.out.println("Content Encoding: " + contentEncoding);
            long lastModified = connection.getLastModified();
            System.out.println("Last Modified: " + new Date(lastModified));
            long expiration = connection.getExpiration();
            System.out.println("Expiration: " + new Date(expiration));
            long currentDate = System.currentTimeMillis();
            System.out.println("Current Date: " + new Date(currentDate));
            connection.getInputStream().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
