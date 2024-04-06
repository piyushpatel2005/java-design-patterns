package pluralsight.facade;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeSimpleDemo {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https", "github.com", 443, "/piyushpatel2005");

        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
    }
}
