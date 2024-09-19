
// lab 4

package networkProgram;
import java.net.*;
public class IPaddressV4orV6 {
    public static int getVersion(InetAddress ia) {
        byte[] address = ia.getAddress();
        if (address.length == 4) {
            System.out.println(ia + " is IPv4");
        } else if (address.length == 16) {
            System.out.println(ia +" is IPv6");
        } else {
            System.out.println(-1);
        }
        return 0;
    }

    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia =InetAddress.getByName("2001:0db8:3c4d:0015:0000:0000:1a2f:1a2b");
        IPaddressV4orV6.getVersion(ia);
    }
}
