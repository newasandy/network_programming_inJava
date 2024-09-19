/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;
import java.net.*;
public class lab2 {
    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
            
        }catch(UnknownHostException ex){
            System.out.println("Could not find this computer's address");
        }
    } 
}
