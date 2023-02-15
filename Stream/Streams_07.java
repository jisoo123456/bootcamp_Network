package Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

//파일로부터 스트림 객체 생성
public class Streams_07 {
    public static void main(String[] args) {


        try {
            Path path = Paths.get("원하는 파일 경로");
            Stream<String> st; //메모 안 내용이 String이면 String타입

            // 방법1) Files 클래스의 line()
            st = Files.lines(path, Charset.defaultCharset());
            //Charset.defaultCharset(): 현재 사용하고 있는 운영체제의 기본 문자set을 사용하겠다는 의미
            st.forEach(System.out::println);  //-> 결과: 메모장에 적어놓은 내용이 출력된다.

            // 방법2) BufferedReader 클래스의 lines()
            File file = path.toFile(); //path안에 있는 문자열을 파일로 만들어줌
            FileReader fileReader = new FileReader(file);  //객체생성
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            st = bufferedReader.lines();
            st.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
