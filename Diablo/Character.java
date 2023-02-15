package Diablo;

public abstract class Character {
    protected int hp;
    protected int mp;
    //...
    WeaponBehavior weapon;
    //Association(Aggregation) (상속이 아니라 부품처럼 weapon 갖다 씀)
    //Character쪽이 바뀌어도 Weapon은 아무런 연관x
    //강한 결합은 상속
    //loosely 의존 관계는 약하지만 필요할 때 갖다쓰는 (장점: 서로 연관이 없어서 고치는데 어렵지 않음)

    public void info(){  //자식 클래스에서 오버라이드하면 됨
        System.out.println("체력: " + hp + "\n지능: " + mp);
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    //클래스 앞에 final이 붙으면 상속 불가x, 메소드 앞에 붙으면 자식 클래스에서 오버라이드 x, 변수 앞에 오면 상수
    public final void performWeapon(){
        weapon.useWeapon();
    }
}
