package sec12.chap02;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static final String CUR_PATH = "src/sec12/chap02/";
    public static void main(String[] args) {
        Path path1 = Paths.get("");
        Path pathAbs = path1.toAbsolutePath();

        Path path2 = Paths.get("my_file.txt");
        Path path2Abs = path2.toAbsolutePath();

        Path path3 = Paths.get(CUR_PATH, "sub1", "sub2", "sub3");
        Path path4 = path3.resolve(path2);
        Path path5 = path4.getParent();
        Path path6 = path4.relativize(path2);
        Path path7 = path4.getFileName();
        Path path8 = path4.subpath(3,5);

        System.out.println(Files.exists(path2));
        try {
            Files.createFile(path2);
        } catch (IOException e) {
            System.out.println("파일 이미 있음");
        }
        System.out.println(Files.exists(path2));

        try {
            Files.createDirectory(Paths.get(CUR_PATH, "myFolder"));
        } catch (IOException e) {
            System.out.println("폴더가 이미 있음");
        }
        try {

            Files.createDirectories(path4.getParent());
            Files.createFile(path4);
        } catch (IOException e) {
            System.out.println("이미 있음");
        }
        try {
            Files.write(path4, "안녕하세요".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<String> lines = Arrays.asList(
                "아기상어 뚜루루뚜루", "귀여운 뚜루루뚜루",
                "바다속 뚜루루뚜루",  "아기상어",
                "",
                "엄마상어 뚜루루뚜루", "어여쁜 뚜루루뚜루",
                "바다속 뚜루루뚜루",  "엄마상어"
        );
        try {
            Files.write(path4, lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        byte[] path4Bytes;
        try {
            path4Bytes = Files.readAllBytes(path4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String path4Contents = new String(path4Bytes);
        System.out.println(path4Contents);

        System.out.println("\n- - - - -\n");

        List<String> path4Read = null;
        try {
            path4Read=Files.readAllLines(path4);
            path4Read.stream()
                    .map(new Function<String, String>() {
                        @Override
                        public String apply(String s) {
                            return "🎤 " + s;
                        }
                    })
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n- - - - -\n");

       try(Stream<String> lineStrm = Files.lines(path4)) {
            lineStrm
                    .limit(3)
                    .map(s -> "🎵 " + s)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       Path copied = Paths.get(path4.getParent().toString(),"copied.txt");
        try {
            Files.copy(path4,copied);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


       Path moved = Paths.get(
                path4.getParent().getParent().toString(),
                "moved.txt"
        );
        //  💡 파일 이동하기
        try {
            Files.move(copied, moved);
        } catch (IOException e) {
            System.out.println("파일이 이미 있음");
        }

        try {
            Files.delete(moved);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
