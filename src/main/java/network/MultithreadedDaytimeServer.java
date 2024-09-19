/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MultithreadedDaytimeServer {
    public static void main(String[] args) {
        int port = 13; 
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Daytime Server started on port " + port);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());
                Thread thread = new ClientHandlerThread(clientSocket);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static class ClientHandlerThread extends Thread {
        private  Socket clientSocket;
        public ClientHandlerThread(Socket clientSocket) {
            this.clientSocket = clientSocket;}
        public void run() {
            try {
                Date currentDate = new Date();
                String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(currentDate);
                OutputStream outputStream = clientSocket.getOutputStream();
                outputStream.write(dateTime.getBytes());
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

