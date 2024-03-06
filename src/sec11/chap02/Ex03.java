package sec11.chap02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Thread tarzanSong = new Thread(new TarzanRun(10));
        //tarzanSong.run();
        tarzanSong.start();

        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                var line = sc.nextLine();
                //  🔽 이곳에 다음의 코드들을 붙여넣을 것
               if(line.equalsIgnoreCase("stop")){
                   System.out.println("Shut up");
                   tarzanSong.interrupt();
               }


                if (line.equalsIgnoreCase("quit")) break;
                System.out.println(line);
            }
        }
    }
}

