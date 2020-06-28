package homework.shooterGame.weapon;

public class Ak47 extends Weapon {
    @Override
    public void shot() {
        System.out.println("Вы достаёте АК47 и слышите шум берёз");
        System.out.println("Тра-та-тата");
    }
}
