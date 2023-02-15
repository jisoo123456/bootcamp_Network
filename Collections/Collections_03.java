package Collections;

import java.util.ArrayList;
import java.util.List;

public class Collections_03 {
    public static void main(String[] args) {
        List<String> soldier = List.of("차병호", "성윤모", "강찬석");
        System.out.println(soldier.contains("차병호"));  //contains(): list에 있는지 찾는 함수
        System.out.println(soldier.contains("최일구"));
        System.out.println(soldier.indexOf("성윤모"));  //indexOf(): index의 번호를 알려주는 함수

        List<String> s1 = new ArrayList(soldier);
        //List(부모)는 인터페이스이고 arrayList(자식)는 List에 상속된 클래스
        //List는 동적 크기 변경가능, List는 하나하나 수정
        s1.add("박민석");
        s1.add("김상훈");
        List<String> s2 = new ArrayList(soldier);
        s2.remove("성윤모");
        System.out.println(s1.containsAll(s2));
        //s2에 있는 원소들을 s1이 다 가지고 있으면 True

        s1.removeIf(r -> r.endsWith("석"));  //StartsWith도 있음
        s1.replaceAll(x -> "신병" + x);
        s1.forEach(s -> System.out.println(s + " "));
    }
}
