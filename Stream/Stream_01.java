package Stream;
//Stream 코드의 장점
// 1) SideEffect(부작용, 의도하지 않은 결과)가 발생하지 x -> 안정적임
// 2) 간결함
//3) 내부 반복자를 사용해서 병렬 처리 가능 -> 시간이 효율적 (<->iterator는 외부 반복자 사용)

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

//장점: 오류를 줄일수 있고 상황에 따라 빠른 처리가 가능하다
public class Stream_01 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("서울", "부산", "광주", "대구", "부산", "서울", "대전", "서울", "경기", "대구");

        //Old style
        //외부 반복자를 사용하기 때문에 속도가 느려짐
        Iterator<String> it = cities.iterator();
        while(it.hasNext()){
            String city = it.next();  //하나하나씩 꺼냄(꺼냄과 동시에 사라지게됨)
            System.out.print(city + " ");
        }
        System.out.println();
        //Modern style
        //Stream<String> st = cities.stream();
        Stream<String> st = cities.parallelStream();
        //병렬처리 -> thread들이 나눠서 일을 하기 때문에 대용량 데이터처리 속도 빠름 (단, 출력순서보장x)
        st.forEach(c -> System.out.print(c + " "));  //forEach(): interface(입력은 있고 return은 없음
    }
}
