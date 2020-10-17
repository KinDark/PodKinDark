package pl.sdacademy.design.patterns.structure.decorator.rpggame.character;

/**
 * Klasa opisująca postać
 * Tworzenie kolejnych postaci będzie wymagało podanie tylko
 * istotnych informacji m. in. ataku czy obrony
 */
public class Paladin extends CharacterBase {
    public Paladin(String name) {
        super("Paladyn" + " " + name);
        setAttack(10f);
        setDefence(20f);
        setInventory(5f);
    }
}
