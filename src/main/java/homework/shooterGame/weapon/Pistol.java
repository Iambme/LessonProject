package homework.shooterGame.weapon;

public class Pistol extends Weapon {
    @Override
    public void shot() {
        System.out.println("Пистолет в ваших руках");
        System.out.println("Пиф-Паф");
    }
}
