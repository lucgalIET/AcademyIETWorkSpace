package manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.weapon.creator;

import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.weapon.melee.MeleeWeapon;

public class MeleeWeaponCreator extends WeaponCreator {

    @Override
    public Weapon forgeWeapon() {
        return new MeleeWeapon();
    }
}
