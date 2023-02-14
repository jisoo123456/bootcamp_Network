// [Lamda Expression(람다식)]
// -익명 메서드(일반 메서드와 달리 이름이 없다)
// -메서드와 달리 특정 클래스에 종속되지 않지만, 매개변수, 리턴타입, 본체를 가진다
// -예외처리가 가능하다
// -메서드의 인수로 전달될 수도 있고 변수에 대입될 수 있다
// -익명 구현 객체와 달리 매서드의 핵심 부분만 포함한다
// -실행문이 하나면 중괄호와 세미콜론을 생략할 수 있다
// -실행문이 하나의 리턴 구문이면 return키워드도 생략가능하다

// -람다식은 하나의 추상메소드를 가진 인터페이스를 통해서 사용 ex. compare
// -람다식 사용을 위해서는, 함수형 인터페이스에 접근하여 사용됩니다.

// (타입 매개변수...) -> {실행문, 실행문; ...}

interface Positive {  //함수형 인터페이스1
    int pos(int x);  //public 없는 함수
}
interface Prints{  //함수형 인터페이스2 (인수가 없음)
    void print();
}
public class lamda_03 {
    public static void main(String[] args) {
        Positive po;
        Prints pr;

        po = (int n) -> {return n+1;};  //변수에 대입
        po = (n) -> {return n+1;};
        po = n -> {return n+1;};  //하나일때 괄호 생략 가능
        po = (int n) -> n+1;
        po = (n) -> n+1;
        po = n -> n+1;

        pr = () -> {
            System.out.println("Hi~");
        };
        pr = () -> System.out.println("Hi~");
        pr.print();
    }
}
