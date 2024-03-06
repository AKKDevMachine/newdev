package sec12.chap06;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        URL yalco = new URL("https://showcases.yalco.kr");
        URL home = new URL(yalco, "/java/index.html");

        URLConnection conn = home.openConnection();


        try (   InputStream is = conn.getInputStream();

                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                StringWriter sw = new StringWriter();
                PrintWriter pr = new PrintWriter(sw))
        {
            String line;
            int lineCount =1;
            while((line=br.readLine())!=null){
                pr.printf("%3d :  %s%n", lineCount++, line);
            }
            System.out.println(sw);
        }

    }
}
