package pl.sdacademy.design.patterns.structure.decorator.rpggame.decorator.weapons;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 10.05.2020
 **/
public class Wand implements Weapon {
    @Override
    public String getName() {
        return "Powerful Wand!";
    }

    @Override
    public float getAttack() {
        return 80.0f;
    }
}

