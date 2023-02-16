package network_lecture;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class task {
    public static void main(String[] args) {
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");

        Stream<String> st1 = names.stream();
        st1.filter(n -> n.charAt(0) < '이').forEach(p -> System.out.print(p + " "));
        System.out.println();

        Stream<String> st2 = names.stream();
        st2.sorted().forEach(p -> System.out.print(p + " "));
        System.out.println();

        //isPresent() 메소드 = true, false 체크
        //ifPresent() 메소드 = 값을 가지고 있는지 확인 후 예외처리
        Stream<String> st3 = names.stream();
        System.out.println(st3.findFirst());
        //findFirst에서 null값이 나오는 걸 방지하기 위해 optional을 붙여서 출력

        Stream<String> st4 = names.stream();
        st4.findFirst().ifPresent(System.out::println);
        //System.out.println(st4.findFirst().get());

        enum Gender {남, 여};

        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        //List<String> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);




    }

}
