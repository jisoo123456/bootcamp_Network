// [Collection]
// 배열에서의 원소 삽입의 성능은 낮음(하나하나 이동해야 하기 때문) -> linkedlist사용
// -> 자바에서는 이처럼 linkedlist, stack들을 편리하게 사용하도록 collections 제공
// List(ArrayList,j LinkedList, Vector, Stack), Queue(DelayQueue, PriorityQueue), Set(HashSet, TreeSet), Map(HashMap)-> 인터페이스


import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Collections_01 {
    public static void main(String[] args) {
        Collection<Double> list = Arrays.asList(2.17, 3.14, 0.99);

        Iterator<Double> it = list.iterator();
        //iterator : 배열이나 그와 유사한 자료구조의 내부요소를 순회
        while(it.hasNext())
            //한번 꺼내면 다 꺼내진 빈 상태이기에 다시 while문 돌리면 아무것도 없어서 돌아가지 않음
            System.out.println(it.next() + " ");
        System.out.println();

        it = list.iterator();
        //이 코드를 통해 다시 빈 상태를 채워줌
        while(it.hasNext())
            System.out.println(it.next() + " ");
        System.out.println();

        for(Double d : list)
            //이거는 위에 while문과 다르게 꺼내는 게 아니기 때문에 계속 반복 가능
            System.out.print(d + " ");
        System.out.println();

    }

}
