/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.util.Enumeration;
 public class multisock{
    public static void main(String[] args) throws IOException
    {
        MulticastSocket ms = new MulticastSocket();
        InetAddress ip = InetAddress.getByName("224.168.1.124");
         ms.setTTL((byte) 25);
         ms.setTimeToLive(20);
        System.out.println("TTL : " + ms.getTTL());
         System.out.println("Time to Live : " + ms.getTimeToLive());
         NetworkInterface nif = NetworkInterface.getByIndex(1);
        Enumeration<InetAddress> enu = nif.getInetAddresses();
        InetAddress intadd = enu.nextElement();
        ms.setInterface(intadd);
        System.out.println("Interface : " + ms.getInterface());
        ms.setNetworkInterface(nif);
        System.out.println("Network Interface : " +ms.getNetworkInterface());
        ms.setLoopbackMode(true);
        System.out.println("Loopback mode : " + ms.getLoopbackMode());
    }
}
