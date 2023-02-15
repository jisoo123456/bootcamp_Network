package network_lecture;

class One{
    private One() {
    }
    public static One produceOneInstance(){
        return (new One());
    }
}
public class task {
    public static void main(String[] args) {
        //One o = new One();  -> private이기 때문에 직접적으로 객체 생성x
        One o1 = One.produceOneInstance();
        One o2 = One.produceOneInstance();
    }

}
