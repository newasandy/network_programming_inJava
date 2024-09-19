/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//lab11 URL Equality check
package network;

import java.net.*;

/**
 *
 * @author srbne
 */
public class URLEquality {
    public static void main(String[] args) {
        try {
            URL www = new URL("http://www.ibiblio.org/");
            URL ibiblio = new URL("http://ibiblio.org/");
            if (ibiblio.sameFile(www)) {
                System.out.println(ibiblio + "is the same as" + www);
            } else {
                System.out.println(ibiblio + "is not the same as" + www);
            }
        } catch (MalformedURLException ex) {
            System.out.println(ex);
        }
    }
}
