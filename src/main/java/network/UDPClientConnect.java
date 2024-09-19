/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class UDPClientConnect {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // Specify the server address
        int serverPort = 9999; 
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverInetAddress = InetAddress.getByName(serverAddress);
            String message = "Hello, Sandy From Client!";
            byte[] sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverInetAddress, serverPort);
            socket.send(sendPacket);
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);
            String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Response from server: " + response);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

