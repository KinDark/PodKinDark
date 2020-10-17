package pl.sdacademy.design.patterns.structure.decorator.rpggame;

import pl.sdacademy.design.patterns.structure.decorator.rpggame.character.Character;
import pl.sdacademy.design.patterns.structure.decorator.rpggame.character.Paladin;
import pl.sdacademy.design.patterns.structure.decorator.rpggame.character.Sorcerer;
import pl.sdacademy.design.patterns.structure.decorator.rpggame.decorator.AttackDecorator;
import pl.sdacademy.design.patterns.structure.decorator.rpggame.decorator.DefenceDecorator;
import pl.sdacademy.design.patterns.structure.decorator.rpggame.decorator.armor.WoodenShield;
import pl.sdacademy.design.patterns.structure.decorator.rpggame.decorator.weapons.Sword;
import pl.sdacademy.design.patterns.structure.decorator.rpggame.decorator.weapons.Wand;

/**
 * Dodanie zadań,obowiązków do pojedynczych obiektów, a nie calej klasy.
 * Obiekt paladin otrzymuje dodatkowe zadania, możliwości
 * Możliwości zwiększają obronę czy atak
 *
 * Charakterystyczne dla tego wzorca jest elastyczne umieszczenie komponentu w innym komponencie
 *
 * paladin = new AttackDecorator(paladin, new Sword());
 *
 * otrzymujemy paladin po osadzeniu go w AttackDecorator
 *
 * Decorator jest zgodny z interfejsem ozdabianego komponentu - Character
 * np: AttackDecorator - rozszerza Character
 *
 * Zadanie :
 *  * dodaj postać Czarodziej (Sorcerer) dodaj odpowiednie właściwości
 *  * dodaj broń Różdżka (Wand) dająca niesamowity atak
 *  * Stwórz w Main postać Harrego Pottera (Czarodzieja) następnie udekoruj go w różdżkę
 */
public class Main {
    public static void main(String[] args) {
        Character paladin = new Paladin("Wojtek");
        System.out.println(paladin.getDescription());

        paladin = new AttackDecorator(paladin, new Sword());
        System.out.println(paladin.getDescription());

        paladin = new DefenceDecorator(paladin, new WoodenShield());
        System.out.println(paladin.getDescription());

        Character harryPotter = new Sorcerer("Harry Potter");
        System.out.println(harryPotter.getDescription());

        harryPotter = new AttackDecorator(harryPotter, new Wand());
        System.out.println(harryPotter.getDescription());
    }
}
