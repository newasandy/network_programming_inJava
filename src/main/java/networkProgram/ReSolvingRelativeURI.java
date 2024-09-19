package networkProgram;
//13
import java.net.URI;
import java.net.URISyntaxException;

public class ReSolvingRelativeURI {
    public static void main(String[] args) throws URISyntaxException {

        // absolute to relative

//        URI absolute = new URI("http://www.example.com/images/logo.png");
//        URI top = new URI("http://www.example.com/");
//        URI relative = top.relativize(absolute);


        // relative to absolute

        URI absolute = new URI("images/logo.png");
        URI top = new URI("http://www.example.com/");
        URI relative = top.resolve(absolute);

        System.out.println(relative);
    }
}
