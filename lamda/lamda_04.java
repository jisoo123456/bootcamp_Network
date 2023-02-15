package lamda;// lamgda expressioin
// x -> Integer.pareseInt(x)

//method reference
//Integer::parseInt

//정적메소드 참조
//클래스 이름::정적메서드
//인스턴스 메서드 참조
//객체 이름::인스턴스메서드
//생성자 참조
//클래스이름::new
//배열타입 이름::new

interface Calc{
    double calculate(double d);
}

interface Gets{
    char get(String s, int i);
}
public class lamda_04 {
    public static void main(String[] args) {
        Calc c;
        Gets g;

        //lambda
        //c = (d) -> {return Math.abs(d);};
        //c = d -> Math.abs(d);

        //static math reference
        c = Math::abs;
        //메소드 참조 표현식(람다 표현식에서만 사용 가능)
        //왼쪽 객체의 오른쪽 메소드
        //객체에서 특정 메소드를 호출하는 용도
        //더블콜론은 람다의 간결한 버전
        //람다식이 이미 존재하는 메소드와 동일한 기능이면 메소드 레퍼런스로 람다식을 대체
        System.out.println(c.calculate(-9.9));

        //lambda
        //g = (a,b) -> a.charAt(b);
        g = String::charAt;
        System.out.println(g.get("Hello My friend!!", 4));
        System.out.println("Hello My friend!!".charAt(4));
    }

}
