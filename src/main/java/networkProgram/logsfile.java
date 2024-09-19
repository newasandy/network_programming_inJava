package networkProgram;
//9
import  java.net.*;
import java.io.*;
public class logsfile {
        public static void main(String[] args) {
            String input = "C:\\Users\\srbne\\Downloads\\javanetworkprogram\\loggs.log";
            try (FileInputStream fin = new FileInputStream(input);
                 Reader in = new InputStreamReader(fin);
                 BufferedReader bin = new BufferedReader(in);) {
                for (String entry = bin.readLine(); entry != null;
                     entry = bin.readLine()) {
// separate out the IP address
                    int index = entry.indexOf(' ');
                    String ip = entry.substring(0, index);
                    String theRest = entry.substring(index);
// Ask DNS for the hostname and print it out
                    try {
                        InetAddress address = InetAddress.getByName(ip); System.out.println(address.getHostName() + theRest);
                    } catch (UnknownHostException ex) {
                        System.err.println(entry);
                    }
                }
            } catch (IOException ex) { System.out.println("Exception: " + ex);
            }
        }
    }

