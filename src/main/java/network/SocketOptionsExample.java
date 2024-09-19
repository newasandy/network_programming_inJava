/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;
import java.io.IOException;
import java.net.SocketOption;
import java.nio.channels.DatagramChannel;
import java.nio.channels.NetworkChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Set;
public class SocketOptionsExample {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            Set<SocketOption<?>> socketOptions = socketChannel.supportedOptions();
            System.out.println("Supported Socket Options for SocketChannel:");
            printSocketOptions(socketOptions);
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            socketOptions = serverSocketChannel.supportedOptions();
            System.out.println("Supported Socket Options for ServerSocketChannel:");
            printSocketOptions(socketOptions);
            DatagramChannel datagramChannel = DatagramChannel.open();
            socketOptions = datagramChannel.supportedOptions();
            System.out.println("Supported Socket Options for DatagramChannel:");
            printSocketOptions(socketOptions);
            socketChannel.close();
            serverSocketChannel.close();
            datagramChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void printSocketOptions(Set<SocketOption<?>> socketOptions) {
        for (SocketOption<?> option : socketOptions) {
            System.out.println(option.name() + ": " + option.type().getSimpleName());
        }
        System.out.println();
    }
}

