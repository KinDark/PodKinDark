package pl.sdacademy.design.patterns.structure.decorator.rpggame.character;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 10.05.2020
 **/
public class Sorcerer extends CharacterBase {
    public Sorcerer(String name) {
        super("Czarodziej" + " " + name);
        setAttack(10f);
        setDefence(20f);
        setInventory(5f);
    }
}