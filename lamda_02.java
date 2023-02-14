import java.util.Arrays;
import java.util.Comparator;

public class lamda_02 {
    public static void main(String[] args) {
        String[] strings = {"Hi", "Hello friend", "Hello friend professor"};

//        //사전순(자바에 기본으로 세팅된 순서)
//        Arrays.sort(strings);
//
//        //문자열 길이 순
//        Arrays.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        Arrays.sort(strings, (o1, o2) -> o1.length()-o2.length());

        for(String s : strings)
            System.out.println(s);
    }
}
