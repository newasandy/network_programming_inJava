/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 *
 * @author srbne
 */
public class SocketInfoExample {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.google.com", 80);
            InetAddress localAddress = socket.getLocalAddress();
            int localPort = socket.getLocalPort();
            System.out.println("Local Address: " + localAddress);
            System.out.println("Local Port: " + localPort);
            InetAddress remoteAddress = socket.getInetAddress();
            int remotePort = socket.getPort();
            System.out.println("Remote Address: " + remoteAddress);
            System.out.println("Remote Port: " + remotePort);
            SocketAddress localSocketAddress = socket.getLocalSocketAddress();
            System.out.println("Local Socket Address: " + localSocketAddress);
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            System.out.println("Remote Socket Address: " + remoteSocketAddress);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
