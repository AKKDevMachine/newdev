package sec12.chap04;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Ex01 {
    public static final String SONG_PATH = "src/sec12/chap04/beatles.txt";
    public static void main(String[] args) {
        //fileReaderWriterEx();
        //bufferedReaderWriterEx();
        String frw = measureTime(Ex01::fileReaderWriterEx);
        String brw = measureTime(Ex01::bufferedReaderWriterEx);
        String iorw = measureTime(Ex01::ioStreamReaderWriterEx);
    }
    public static void fileReaderWriterEx(){
        Charset charset = StandardCharsets.UTF_8;
        try (FileReader fr= new FileReader(SONG_PATH, charset);
             FileWriter fw = new FileWriter(SONG_PATH.replace("beatles",
                     "beatles_1"), charset))
        {
            int c;
            while((c=fr.read())!=-1){
                System.out.print((char) c);
                fw.write(c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void bufferedReaderWriterEx(){
        Charset charset = StandardCharsets.UTF_8;
        try (
             FileReader fr = new FileReader(SONG_PATH, charset);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(
                     SONG_PATH.replace("beatles", "beatles_2")
                     , charset);
             BufferedWriter bw = new BufferedWriter(fw))
        {
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String measureTime (Runnable runnable) {
        long startTime = System.nanoTime();
        runnable.run();
        long endTime = System.nanoTime();
        return String.valueOf("%,d 나노초")
                .formatted(endTime - startTime);
    }
    public static void ioStreamReaderWriterEx(){
        Charset charset = StandardCharsets.UTF_8;

        try (
                //  💡 기본적으로 8192바이트짜리 🚚 트럭에 실어옴
                FileInputStream fis = new FileInputStream(SONG_PATH);
                InputStreamReader ir = new InputStreamReader(fis, charset);
                BufferedReader br = new BufferedReader(ir);
                FileOutputStream fos = new FileOutputStream(
                        SONG_PATH.replace("beatles", "beatles_3")
                );
                OutputStreamWriter ow = new OutputStreamWriter(fos, charset);
                BufferedWriter bw = new BufferedWriter(ow);
        ) {

            String line;
            //  💡 한 줄씩 🧺 바구니에 버퍼링해서 읽어옴
            //  - File... 만 사용하는 것보다 효율적
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                bw.write(line);
                bw.newLine(); // 💡 줄 바꿔줌
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
