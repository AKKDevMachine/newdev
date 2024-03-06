package sec12.chap01;

import java.io.File;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        String newName = "name_changed.txt" ;

        File file2 = new File(Ex01.CUR_PATH + "file2.txt");
        File nameChange = new File(Ex01.CUR_PATH + newName);

     /*   try {
            file2.createNewFile();
            nameChange.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        //  💡 파일의 이름 변경하고 결과 반환
        boolean renameResult = file2.renameTo(nameChange);
        System.out.println(renameResult ? "이름 변경됨" : "해당 파일 없음");
        boolean deleteResult = nameChange.delete();
        System.out.println(deleteResult?"삭제됨":"해당 파일 없음");
    }
}
