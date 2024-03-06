package sec12.chap06;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex03 {
    public static void main(String[] args) throws IOException {
        URL yalco = new URL("https://showcases.yalco.kr");
        URL home = new URL(yalco, "/java/index.html");
        String HOME_PATH = "src/sec12/chap06/home.html";

        HttpURLConnection conn = (HttpURLConnection) home.openConnection();

        int responseCode = conn.getResponseCode();
        System.out.println("Resonse Code : " + responseCode);


        try (
                InputStream is = conn.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                FileWriter fw = new FileWriter(HOME_PATH);
                PrintWriter pw = new PrintWriter(fw)) {
            String line;
            while ((line = br.readLine()) != null) {
                pw.println(line);
            }
        }
    }
}
