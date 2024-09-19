/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//A program that uses URLEncoder.encode() to print various encoded strings (lab15)
package network;


import java.net.*;
import java.io.*;
/**
 *
 * @author ANKITA
 */
public class URLEncoders {
    
    public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException   
    {  
        String baseUrl = "https://www.javatpoint.com/";  
        // String to be encoded as requested by the user  
        String query = " u@ java T point";  
        System.out.println(" URL without any encoding : ") ;  
        // creating an object of the URL class  
        URL url = new URL(baseUrl + query) ;  
        System.out.println( url ) ;  
        // using the encode( ) method to encode the URL  
        System.out.println( " URL after encoding : " ) ;  
        url = new URL( baseUrl + URLEncoder.encode( query, "UTF-8" ) ) ;  
        System.out.println( url ) ;  
    }  
  }  

