import java.util.ArrayList;
import java.util.LinkedList;

// arraylist: 검색에 유리, 메모리 부담이 적음
// linkedlist: 삽입, 삭제에 유리
public class Collections_linkedlist {
    public static void main(String[] args) {
        long s, e;
        ArrayList<Integer> a1 = new ArrayList<>();
        LinkedList<Integer> l1 = new LinkedList<>();

        s = System.nanoTime();
        for(int i=0; i<100000; i++)
            a1.add(0,i);
        e = System.nanoTime();
        System.out.println(e-s);

        s = System.nanoTime();
        for(int i=0; i<100000; i++)
            l1.add(0,i);  //시간이 더 짧게 걸림(즉, 삽입에 용이)
        e = System.nanoTime();
        System.out.println(e-s);
    }

}
