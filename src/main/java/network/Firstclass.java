/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 //program to implement a ip address of given host name-lab1
package network;
import java.net.*;
/**
 *
 * @author ANKITA
 */
public class Firstclass {
    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getByName("www.oreilly.com");
            System.out.println(address);
            
        }catch(UnknownHostException ex){
            System.out.println("Could not find www.oreilly.com");
        }
    }
   
}
