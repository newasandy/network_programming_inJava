/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//The parts of the URI:Program lab12
package network;

import java.net.*;

/**
 *
 * @author srbne
 */
public class URIDemo1 {
  public static void main(String[] args) throws Exception {
    if (args.length != 1) {
      System.err.println("usage: java URIDemo1 uri");
      // return;
    }

    URI uri = new URI("https://www.informit.com/articles/article.aspx?p=26566&seqNum=3#hello");

    System.out.println("Authority = " + uri.getAuthority());

    System.out.println("Fragment = " +
        uri.getRawFragment());
    System.out.println("Fragment = " +
        uri.getFragment());

    System.out.println("Host = " +
        uri.getHost());

    System.out.println("Path = " +
        uri.getPath());

    System.out.println("Port = " +
        uri.getPort());

    System.out.println("Query = " +
        uri.getQuery());

    System.out.println("Scheme = " +
        uri.getScheme());

    System.out.println("Scheme-specific part = " +
        uri.getSchemeSpecificPart());

    System.out.println("User Info = " +
        uri.getUserInfo());

    System.out.println("URI is absolute: " +
        uri.isAbsolute());

    System.out.println("URI is opaque: " +
        uri.isOpaque());
  }
}
