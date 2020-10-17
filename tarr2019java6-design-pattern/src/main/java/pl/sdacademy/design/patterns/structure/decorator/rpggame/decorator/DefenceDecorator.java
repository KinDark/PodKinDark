package pl.sdacademy.design.patterns.structure.decorator.rpggame.decorator;

import pl.sdacademy.design.patterns.structure.decorator.rpggame.character.Character;
import pl.sdacademy.design.patterns.structure.decorator.rpggame.decorator.armor.Armor;

/**
 * Klasa dekoratora obrony
 * dodaje do opisu informację
 */
public class DefenceDecorator extends CharacterDecorator {

    Armor armor;

    public DefenceDecorator(Character character, Armor armor) {
        super(character);
        this.armor = armor;
        setDefence(character.getDefence() + armor.getDefence());// ustawienie obrony zgodnie z logiką CharacterDecorator
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " " + "with " + armor.getName();
    }
}
