/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//a program that lists all the network interfaces-lab7
package network;
import java.net.*;
 import java.util.*;
/**
 *
 * @author ANKITA
 */
public class FactoryMethod {
      
    public static void main(String[] args) throws SocketException { 
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface ni = interfaces.nextElement(); 
            System.out.println(ni);
        }
    }
}

