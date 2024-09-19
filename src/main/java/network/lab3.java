/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;

import java.net.*;

/**
 *
 * @author srbne
 */
public class lab3 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getByName("8.8.8.8");
        System.out.println(ia.getCanonicalHostName());
    }
}
