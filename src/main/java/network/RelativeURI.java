/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//lab13 and 14 relative and absolute URI
package network;

import java.net.URI;

/**
 *
 * @author ANKITA
 */
public class RelativeURI {
         public static void main (String [] args) throws Exception
  {
   if (args.length != 1)
   {
     System.err.println ("usage: java URIDemo1 uri");
     //return;
   }
   //URI absolute = new URI ("https://www.freepik.com/free-photos-vectors/logo-png");
   //URI top = new URI("https://www.freepik.com/");
   //URI relative = top.relativize(absolute);
     // System.out.println(relative);
     URI top = new URI ("javafaq/books/");
     URI resolved= top.resolve("jnp3/examples/07/index.html");
      System.out.println(resolved);
     
  }
}
