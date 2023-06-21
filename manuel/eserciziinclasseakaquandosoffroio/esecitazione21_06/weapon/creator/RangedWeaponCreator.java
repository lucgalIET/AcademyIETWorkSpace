package manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.weapon.creator;

import manuel.eserciziinclasseakaquandosoffroio.esecitazione21_06.weapon.ranged.RangedWeapon;

public class RangedWeaponCreator extends WeaponCreator {
    @Override
    public Weapon forgeWeapon() {
        return new RangedWeapon();
    }
}
