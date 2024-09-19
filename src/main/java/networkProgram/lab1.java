package networkProgram;
import java.net.*;
public class lab1 {
    public static void main(String[] args) {
        try{
            InetAddress add = InetAddress.getByName("www.oreilly.com");
            System.out.println(add);
        }catch (UnknownHostException ex){
            System.out.println("not found");
        }
    }
}
