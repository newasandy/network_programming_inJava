package networkProgram;
//10
import java.net.*;
public class URLSplitterss {

        public static void main(String args[]) throws Exception {

            URL u = new URL("http://user:pass@www.java2s.com:80/index.html?category=Piano#22222");
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
            System.out.println("The file is "+ u.getFile());
            System.out.println("Get Authority"+ u.getAuthority());
            System.out.println("The default port " + u.getDefaultPort());
            System.out.println("The query string is " + u.getQuery());
        }
}
