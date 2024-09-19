package networkProgram;
// 12
import java.net.URI;
import java.net.URISyntaxException;

public class URIprogram {
    public static void main(String[] args) throws URISyntaxException {
//        if(args.length != 1)
////        {
////            System.err.println("usage:java URLDemo1 uri");
////
////        }
        URI uri = new URI ("https://www.informit.com/articles/article.aspx?p=26566&seqNum=3");

        System.out.println ("Authority = " +
                uri.getAuthority ());

        System.out.println(uri.getRawFragment());
        System.out.println ("Fragment = " +
                uri.getFragment ());

        System.out.println ("Host = " +
                uri.getHost ());

        System.out.println ("Path = " +
                uri.getPath ());

        System.out.println ("Port = " +
                uri.getPort ());

        System.out.println ("Query = " +
                uri.getQuery ());

        System.out.println ("Scheme = " +
                uri.getScheme ());

        System.out.println ("Scheme-specific part = " +
                uri.getSchemeSpecificPart ());

        System.out.println ("User Info = " +
                uri.getUserInfo ());

        System.out.println ("URI is absolute: " +
                uri.isAbsolute ());

        System.out.println ("URI is opaque: " +
                uri.isOpaque ());
    }
}
