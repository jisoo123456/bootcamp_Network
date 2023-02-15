package lamda;

import java.util.Arrays;

class Circle implements Comparable{
    //문제점1) 모든 클래스에 Comparable implement 해줘야함
    //문제점2) class 앞에 final을 붙이게 되면 수정을 못할수 있음

    //해결방법 람다함수
    private double radius;

    public Circle(double radius){

        this.radius = radius;
    }

    public double getArea(){

        return Math.PI * radius * radius;
    }

    public String toString(){

        return String.format("원의 반지름은 %s입니다.", radius);
    }

    @Override
    public int compareTo(Object o) {
        Circle c = (Circle)o;  //캐스팅
        return (int)(getArea()-c.getArea());
        //double -> int 소수점 버림
        //어차피 크면 양수, 같으면 0, 작으면 음수라는 것만 구분해서 sort가 알아서 정렬

//    public int compareTo(lamda.Circle c){ //애초에 lamda.Circle 타입의 객체만 받는 경우
//        return (int)(getArea() - c.getArea());
//        }  //이 경우에는 Comparable<lamda.Circle>로 타입을 써줘야 함
    }
}

public class lamda_01 {
    public static void main(String[] args) {
        Circle[] circles = {new Circle(5.0), new Circle(2.5), new Circle(10.0)};

        Arrays.sort(circles);

        for(Circle c : circles)
            System.out.println(c);
    }
}
