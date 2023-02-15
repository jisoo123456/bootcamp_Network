public class Day23 {
    public static void main(String[] args) {
        Sorceress s1 = new Sorceress();
        Barbarian b1 = new Barbarian();
        Bow windForce = new Bow();
        Axe berserkerAxe = new Axe();
        s1.setWeapon(windForce);
        s1.performWeapon();
        b1.setWeapon(berserkerAxe);
        b1.performWeapon();
        s1.setWeapon(new Axe());
        s1.performWeapon();
        s1.info();
    }
}
