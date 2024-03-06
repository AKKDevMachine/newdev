package sec12.chap03;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Ex01 {
    public static final String SONG_PATH = "src/sec12/chap03/beatles.txt";

    public static void main(String[] args) {
        //fileInputStrmEx1();
        //fileInputStrmEx2();
        //fileInputStrmEx3();
        //bufferedInputEx();
        //String fis1 = measureTime(Ex01::fileInputStrmEx1);
        //String fis2 = measureTime(Ex01::fileInputStrmEx2);
        //String fis3 = measureTime(Ex01::fileInputStrmEx3);
       // String bis = measureTime(Ex01::bufferedInputEx);

    }

    public static void fileInputStrmEx1(){

         try (FileInputStream fis = new FileInputStream(SONG_PATH)) {
             int readByte;
             while((readByte=fis.read())!=-1){
                 char readChar = (char) readByte;
                 System.out.print(readChar);
             }
         }
         catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fileInputStrmEx2 () {

        //  ⭐️ 인코딩 설정 - UTF-8
        Charset charset = StandardCharsets.UTF_8;

        try (
                FileInputStream fis = new FileInputStream(SONG_PATH);
                //  💡 InputStreamReader : 바이트 스트림을 문자열 스트림으로
                //  - 인코딩 적용 등에 사용
                InputStreamReader isr = new InputStreamReader(fis, charset)
        ) {
            int readByte;
            while ((readByte = isr.read()) != -1) {
                char readChar = (char) readByte;
                System.out.print(readChar);
            }
        } catch (IOException e) {
            e.printStackTrace();
         }
    }
    public static void fileInputStrmEx3(){
        byte[] buffer = new byte[1024];
        Charset charset = StandardCharsets.UTF_8;

        try(FileInputStream fis = new FileInputStream(SONG_PATH)) {
            int readByte;
            int count = 0;
            while((readByte=fis.read(buffer))!=-1){
                String readStr = new String(buffer,0,readByte,charset);
                System.out.printf(
                        "\n⭐️- - - %d : %d - - -\n%n",
                        ++count, readByte
                );
                System.out.println(readStr);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void bufferedInputEx(){
        Charset charset = StandardCharsets.UTF_8;
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(SONG_PATH));){
            byte[] buffer = new byte[1024];
            int readByte;
            int count =0;

            while ((readByte = bis.read(buffer)) != -1) {
                System.out.println("-----------"+readByte+"------------");
                String readStr = new String(
                        buffer, 0, readByte, charset
                );
                System.out.printf(
                        "\n⭐️- - - %d : %d - - -\n%n",
                        ++count, readByte
                );
                System.out.println(readStr);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String measureTime(Runnable runnable){
        long startTime = System.nanoTime();
        runnable.run();
        long endTime = System.nanoTime();
        return String.valueOf("%,d 나노초")
                .formatted(endTime - startTime);
    }
}
