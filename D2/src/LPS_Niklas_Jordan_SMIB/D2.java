package LPS_Niklas_Jordan_SMIB;

import java.net.*;
import java.io.*;

public class D2 {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.tagesschau.de/xml/rss2");
            URLConnection connection = url.openConnection();
            connection.setDoInput(true);
            InputStream inputStream = connection.getInputStream();
            BufferedReader input = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while ((line = input.readLine()) != null) System.out.println(line);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
