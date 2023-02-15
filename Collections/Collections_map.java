package Collections;

import java.util.HashMap;
import java.util.Map;

//map은 파이썬의 딕셔너리와 같은 역할
public class Collections_map {
    public static void main(String[] args) {
        Map<String, Integer> soldiers = Map.of("유재석", 4, "이광수", 3, "심우진", 1);
        System.out.println(soldiers);
        System.out.println(soldiers.size());

        for(String idx : soldiers.keySet())
            System.out.println(idx + "는(은) 작대기가" + soldiers.get(idx) + "개 입니다.");

        //soldiers.put("심우진", 4); //추가, 삭제가 안됨
        Map<String, Integer> soldiers2 = new HashMap<>(soldiers);
        soldiers2.put("심우진", 4); //추가 삭제 가능(HashMap)
        soldiers2.clear(); //모든 원소 삭제
    }
}
