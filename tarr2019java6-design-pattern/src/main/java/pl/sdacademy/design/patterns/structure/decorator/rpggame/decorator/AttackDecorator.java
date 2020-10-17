package pl.sdacademy.design.patterns.structure.decorator.rpggame.decorator;

import pl.sdacademy.design.patterns.structure.decorator.rpggame.character.Character;
import pl.sdacademy.design.patterns.structure.decorator.rpggame.decorator.weapons.Weapon;

/**
 * Klasa dekorator ataku rozszerza CharakterDecorator i dzięki temu
 * możliwe jest elastyczne umieszczenie komponentu w innym komponencie
 */
public class AttackDecorator extends CharacterDecorator {

    private Weapon weapon;

    public AttackDecorator(Character character, Weapon weapon) {
        super(character);
        this.weapon = weapon;
        setAttack(character.getAttack() + weapon.getAttack());// rozszerzamy wlasnosci samego ataku
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " " + "with " + weapon.getName();
    }


}
