/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;

import java.net.*;
import java.io.*;

/**
 *
 * @author srbne
 */
public class URLDecoders {
    public static void main(String[] args) {
        String encodedUrl = "https://www.javatpoint.com/+u%40+java+T+point";
        try {
            String decodedUrl = URLDecoder.decode(encodedUrl, "UTF-8");
            System.out.println("Decoded Url :" + decodedUrl);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
