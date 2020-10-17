package pl.sdacademy.design.patterns.structure.decorator.rpggame.character;

/**
 * Interfejs na potrzeby dekoratora
 */
public interface Character {
    String getDescription();

    void setAttack(float attack);

    float getAttack();

    void setDefence(float defence);

    float getDefence();

    void setInventory(float inventory);

    float getInventory();
}
