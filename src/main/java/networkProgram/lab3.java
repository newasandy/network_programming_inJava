package networkProgram;
import  java.net.*;
public class lab3 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia =InetAddress.getByName("8.8.8.8");
        System.out.println(ia.getCanonicalHostName());
    }
}
