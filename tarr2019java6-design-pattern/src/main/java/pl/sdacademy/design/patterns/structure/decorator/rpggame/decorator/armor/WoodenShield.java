package pl.sdacademy.design.patterns.structure.decorator.rpggame.decorator.armor;

/**
 * Klasa opisująca drewnianą tarczę jako element zbroi
 */
public class WoodenShield implements Armor {
    @Override
    public String getName() {
        return "Wooden shield";
    }

    @Override
    public float getDefence() {
        return 15.0f;
    }
}
