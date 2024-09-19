package networkProgram;
import java.net.*;

public class spamcheck_Lab8 {
    public static final String BLACKHOLE = "sbl.spamhaus.org";
    public static void main(String[] args) throws UnknownHostException {
        String[] hostname = new String[]{"www.google.com"};
        for (String address : hostname) {
            if (isSpammer(address)) {
                System.out.println(address + " is a known spammer.");
            } else {
                System.out.println(address + " appears legitimate.");
            }
        }
    }
    private static boolean isSpammer(String arg){
        try {
            InetAddress address = InetAddress.getByName(arg);
        byte[] quad = address.getAddress();
        String query = BLACKHOLE;
        for (byte octet : quad) {
            int unsignedByte = octet < 0 ? octet + 256 : octet;
            query = unsignedByte + "." + query;
        }
        InetAddress.getByName(query);
        return true;
    } catch (UnknownHostException e) {
        return false;
    }
}
}







