package Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

//폴더(디렉토리)로부터 스트림 객체 생성
public class Stream_06 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:/net");
            Stream<Path> pathStream = Files.list(path);  //예외발생할수있어서 trycathch문 사용
            pathStream.forEach(p -> System.out.println(p.getFileName()));
        } catch (IOException e) {  //입출력 문제 잡을 수 있는 catch구문
            throw new RuntimeException(e);
        }
    }

}
