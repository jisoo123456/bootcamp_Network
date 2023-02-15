package network_lecture;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Day23 {
    public static void main(String[] args) {
        List<String> list = List.of("허상수", "박미경", "정종현", "안수영");
        Stream<String> st = list.stream();
        st.filter(n -> n.charAt(0) == '허').forEach(System.out::println);
    }
}
