import java.util.function.*;

// 함수적 인터페이스
// Type        parameter     return value       method
// Predicate   o             boolean            test()
// Supplier    x             o                  get()
// Consumer    o             void               accept()
// Function    o             o                  apply()
//Operator     o             o                  apply()
public class Interface_01 {
    public static void main(String[] args) {
        ToDoubleBiFunction<String, Integer> f2 = (pi, radius) -> Double.parseDouble(pi) * radius * radius;
        //parseDouble: 문자열에서 Double로 바꾸는 함수
        double area = f2.applyAsDouble("3.141592", 10);
        System.out.println(area);

        Function<Integer, Integer> f1 = n -> n + 8;  //<입력값, return값>
        System.out.println(f1.apply(7));

        BiConsumer<Integer, Integer> c2 = (n1, n2) -> System.out.println(n1+ n2);
        c2.accept(7,8);

        Consumer<String> c1 = n -> System.out.println(n.toUpperCase());
        c1.accept("Hello Java~");

        Supplier<Double> s1 = () -> 2.71;
        System.out.println(s1.get());

        IntSupplier s2 = () -> {
            System.out.println("주사위를 굴립니다");
            return (int)(Math.random() * 6) + 1;
        };

        Predicate<String> p = Predicate.isEqual("Test");
        System.out.println(p.test("Java"));

        IntPredicate odd = x -> x % 2 == 1;
        System.out.println(odd.test(13) ? "홀수" : "짝수");
    }
}
