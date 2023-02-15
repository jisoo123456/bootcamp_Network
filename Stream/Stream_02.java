package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_02 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("서울", "부산", "광주", "대구", "부산", "서울", "대전", "서울", "경기", "대구");
        Stream<String> st = cities.stream();
        st.filter(city -> city.startsWith("대")).distinct().forEach(c -> System.out.print(c + " "));  //필터링 + 중복값제거
        //st.distinct().forEach(c -> System.out.print(c + " "));  //중복값 제거
        //st.filter(city -> city.startsWith("대")).forEach(c -> System.out.print(c + " "));  //필터링
        //System.out.println("대한민국".startsWith("대"));  //return 타입이 Ture, False
    }
}
