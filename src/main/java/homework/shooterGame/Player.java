package homework.shooterGame;

import homework.shooterGame.weapon.*;

public class Player {
    private Weapon[] weaponSlots = new Weapon[5];

    public Player() {

        weaponSlots[0] = new WaterPistol();
        weaponSlots[1] = new SlingShot();
        weaponSlots[2] = new Pistol();
        weaponSlots[3] = new Ak47();
        weaponSlots[4] = new Rpg();
    }


    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if(slot<0 || slot>getSlotsCount()){
            throw new ArrayIndexOutOfBoundsException("Выбран неверный слот");
        }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}
