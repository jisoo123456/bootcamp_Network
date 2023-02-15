package Stream;

import java.util.Arrays;
import java.util.List;

class Fruit implements Comparable<Fruit>{
    private String name;
    private int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Fruit o) {
        return this.price - o.price;
    }
}

public class Stream_03 {
    public static void main(String[] args) {
        List<Fruit> fruitList = Arrays.asList(
                new Fruit("watermelon", 16000),
                new Fruit("watermelon", 19000),
                new Fruit("strawberry", 10000),
                new Fruit("kiwi", 13000),
                new Fruit("banana", 6000)
        );
        System.out.println(
                fruitList
                        .stream() //객체생성
                        .mapToInt(Fruit::getPrice)
                        //.mapToInt(f->f.getPrice()) //중간처리과정
                        // mapToInt: function interface의 파생으로 스트림은 int스트림으로 바꿔줌
                        .average() //최종처리(평균내기)
                        .getAsDouble() //최종처리(실수타입으로 변환)
        );


        fruitList.stream().forEach(f ->{
            String name = f.getName();
            int price = f.getPrice();
            System.out.printf("%s : %d\n", name, price);
        });
    }

}
