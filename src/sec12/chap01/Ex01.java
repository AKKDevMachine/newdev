package sec12.chap01;

import java.io.File;
import java.io.IOException;

public class Ex01 {
    public static final String CUR_PATH = "src/sec12/chap01/";

    public static void main(String[] args) {
        String filePath = "file.txt";
        filePath = CUR_PATH+filePath;
        File file1 = new File(filePath);
        System.out.println(file1.exists());
        if(!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                System.out.println("🛑 파일 생성 실패");
                throw new RuntimeException(e);
            }
        }

        boolean fileExist = file1.exists();
        String file1Name = file1.getName();
        boolean file1IsFile=file1.isFile();
        boolean file1IsDir = file1.isDirectory();
        long file1Length = file1.length();
        String file1AbsPath = file1.getAbsolutePath();
        String file1CnnPath = "";
        try {
            file1CnnPath=file1.getCanonicalPath();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File file2 = new File(
                file1CnnPath.replace("file.txt", "file2.txt")
        );
        try {
            boolean result = file2.createNewFile();
            System.out.println(result?"파일 생성됨":"이미 있음");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
