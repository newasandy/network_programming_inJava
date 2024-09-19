/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//determining whether an IP address is v4 or v6
package network;

import java.net.*;

/**
 *
 * @author srbne
 */
public class lab4 {
    public static int getVersion(InetAddress ia) {
        byte[] address = ia.getAddress();
        if (address.length == 4) {
            System.out.println("4");
        } else if (address.length == 16) {
            System.out.println("6");
        } else {
            System.out.println(-1);
        }
        return 0;
    }

    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getByName("8.8.8.8");
        lab4.getVersion(ia);
    }
}
