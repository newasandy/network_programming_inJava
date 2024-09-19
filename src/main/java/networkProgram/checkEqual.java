
// lab 6
package networkProgram;
import java.net.*;
public class checkEqual {


        public static void main (String args[]) {
            try {
                InetAddress ibiblio = InetAddress.getByName("www.google.com");
                InetAddress helios = InetAddress.getByName("www.facebook.com");
                if (ibiblio.equals(helios)) {
                    System.out.println
                            ("www.ibiblio.org is the same as helios.ibiblio.org");
                } else {
                    System.out.println
                            ("www.ibiblio.org is not the same as helios.ibiblio.org");
                }
            } catch (UnknownHostException ex) {
                System.out.println("Host lookup failed.");
            }
        }
    }


