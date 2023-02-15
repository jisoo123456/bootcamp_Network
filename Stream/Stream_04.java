package Stream;
//컬렉션에서만 스트림 사용x

import java.util.stream.IntStream;
//숫자범위로부터 스트림 객체 생성
public class Stream_04 {
    private static int result;
    public static void main(String[] args) {
        IntStream st = IntStream.rangeClosed(1, 10);//rangeClosed(a, b): a부터 b까지 출력
        //st.forEach(System.out::println); //아래 코드와 동일
        //st.forEach(number -> System.out.println(number));
        st.forEach(n -> result = result + n);
        System.out.println(result);
    }
}
