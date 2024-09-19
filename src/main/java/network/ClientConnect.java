/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author srbne
 */
public class ClientConnect {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int serverPort = 8080;
        try {
            Socket socket = new Socket(serverAddress, serverPort);
            System.out.println("Connected to server: " + socket.getInetAddress());
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = reader.readLine()) != null) {
                output.println(line);
                System.out.println("Sent to server: " + line);
                String response = input.readLine();
                System.out.println("Received from server: " + response);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } }

}
