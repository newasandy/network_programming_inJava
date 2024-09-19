package networkProgram;
//lab 11
import java.net.*;
public class URLequality {
    public static void main(String[] args) {
        try{
            URL www = new URL("http://www.ibiblio.org/");
            URL ww3 = new URL("http://ibiblio.org/");

            if (ww3.equals(www)){
                System.out.println(ww3 + " is same as "+ www);
            }else {
                System.out.println(ww3 + " is not same as "+ www);
            }
            URL u1 = new URL("http://www.ncsa.uiuc.edu/HTMLPrimer.html#GS");
            URL u2 = new URL("http://www.ncsa.uiuc.edu/HTMLPrimer.html#GS");
            if (u1.sameFile(u2)){
                System.out.println("same");
            }else {
                System.out.println("not same");
            }

        }catch (MalformedURLException ex){
            System.out.println(ex);
        }
    }
}
