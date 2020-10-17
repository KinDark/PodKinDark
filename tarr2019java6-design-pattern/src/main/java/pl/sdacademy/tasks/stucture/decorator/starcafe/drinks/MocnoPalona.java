package pl.sdacademy.tasks.stucture.decorator.starcafe.drinks;

/**
 * Klasa opisująca mocno paloną kawę w kawiarni
 */
public class MocnoPalona extends Napoj {

    public MocnoPalona() {
        super("Mocno palona");
    }

    @Override
    public float koszt() {
        return 1.99f;
    }
}
