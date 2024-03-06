package sec12.chap07.multitcp;

import java.io.*;
import java.net.Socket;

public class ServerRun implements Runnable{
    private Socket clientSkt;

    public ServerRun(Socket clientSkt) {
        this.clientSkt = clientSkt;
    }

    @Override
    public void run(){
        try (
                InputStream is = clientSkt.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                OutputStream os = clientSkt.getOutputStream();
                PrintWriter pw = new PrintWriter(os, true);
        ){
          Thread.sleep(3000);
          String line;
          while((line=br.readLine())!=null){
              pw.println(line+" 확인");
          }
        }catch (IOException | InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
