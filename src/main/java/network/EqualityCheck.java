/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Are www.ibiblio.org and helios.org the same lab-6?
package network;
import java.net.*;
/**
 *
 * @author srbne
 */
public class EqualityCheck {
    public static void main(String[] args) {
        try{
            InetAddress ibiblio = InetAddress.getByName("www.google.com");
            InetAddress helios = InetAddress.getByName("www.youtube.com");
            if(ibiblio.equals(helios)){
                System.out.println("www.ibiblio.org is the same as helio.ibiblio.org");
                
            }else{
            System.out.println("www.ibiblio.org is not the same as helios.obiblio.org");
        }
        }catch(UnknownHostException ex){
            System.out.println("Host lookup failed");
        }
    }
}
