package Collections;

import java.util.Stack;

public class Collections_Stack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();

        s1.push(5);
        s1.push(1);
        s1.push(3);

        System.out.println(s1.pop());
        System.out.println(s1.peek());
        //peek(): top에 위차한 값을 출력, 삭제는 하지 않는다
        for (Integer i : s1)
            System.out.println(i + " ");
    }
}
