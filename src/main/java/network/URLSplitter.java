/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//lab10
package network;
import java.net.URL;
/**
 *
 * @author ANKITA
 */
public class URLSplitter {
    public static void main(String args[]) throws Exception {

    URL u = new URL("http://ankita:jkkkkk@www.java2s.com:232/index.html?category=kpop#19970701");
    System.out.println("The URL is " + u);
    System.out.println("The scheme is " + u.getProtocol());
    System.out.println("The user info is " + u.getUserInfo());

    String host = u.getHost();
    if (host != null) {
      int atSign = host.indexOf('@');
      if (atSign != -1)
        host = host.substring(atSign + 1);
      System.out.println("The host is " + host);
    } else {
      System.out.println("The host is null.");
    }

    System.out.println("The port is " + u.getPort());
    System.out.println("The path is " + u.getPath());
    System.out.println("The ref is " + u.getRef());
    System.out.println("The file is" + u.getFile());
    System.out.println("The query string is " + u.getQuery());
    System.out.println("The default port is " + u.getDefaultPort());
    System.out.println("The authority is " +u.getAuthority());
  }
}
