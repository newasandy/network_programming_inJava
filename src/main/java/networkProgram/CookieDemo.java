/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgram;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
/**
 *
 * @author srbne
 */
public class CookieDemo {
    public static void main(String[] args) throws Exception {
        // Enable cookie management
        CookieManager cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);

        // Set a custom cookie policy
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);

        // Send an HTTP request to a website
        URL url = new URL("https://www.example.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Read the cookies from the cookie store
        CookieStore cookieStore = cookieManager.getCookieStore();
        List<java.net.HttpCookie> cookies = cookieStore.getCookies();

        // Print the cookies
        for (java.net.HttpCookie cookie : cookies) {
            System.out.println(cookie);
        }
    }
    
}
