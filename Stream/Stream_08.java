package Stream;

import Stream.Stream_08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Stream_08 {
    public static void main(String[] args) {
        List<Fruit> fruitList = Arrays.asList(
                new Fruit("watermelon", 16000),
                new Fruit("watermelon", 19000),
                new Fruit("strawberry", 10000),
                new Fruit("kiwi", 13000),
                new Fruit("banana", 6000)
        );

        //sort는 타입이 int면 정렬 가능하지만 객체는 정렬할 수 x(무슨 기준으로 정렬할지 모호)
        Stream<Fruit> st = fruitList.stream();
//        //Comparable 사용
//        st.sorted().forEach(f -> System.out.println(f.getName() + " " + f.getPrice())); //기본 오름차순
//        st.sorted((f1, f2) -> f2.compareTo(f1)).forEach(f -> System.out.println(f.getName() + " " + f.getPrice())); //내림차순
//
//        //Comparator 사용
//        st.sorted(Comparator.naturalOrder()).forEach(f -> System.out.println(f.getName() + " " + f.getPrice())); //오름차순
        st.sorted(Comparator.reverseOrder()).forEach(f -> System.out.println(f.getName() + " " + f.getPrice())); //내림차순
    }
}
