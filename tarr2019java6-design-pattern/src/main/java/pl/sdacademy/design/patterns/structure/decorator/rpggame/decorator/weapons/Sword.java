package pl.sdacademy.design.patterns.structure.decorator.rpggame.decorator.weapons;

/**
 * Klasa opisująca broń miecz
 */
public class Sword implements Weapon {
    @Override
    public String getName() {
        return "Powerful Sword!";
    }

    @Override
    public float getAttack() {
        return 30.0f;
    }
}
