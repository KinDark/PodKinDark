package pl.sdacademy.tasks.stucture.decorator.starcafe.decorator;

import pl.sdacademy.tasks.stucture.decorator.starcafe.drinks.Napoj;

/**
 * Klasa Mleko jako skladnik
 * dodaje do opisu mleko oraz zwiększa koszt
 */
public class Mleko extends SkladnikDekorator {
    Napoj napoj;

    public Mleko(Napoj napoj) {
        super(napoj.pobierzOpis());
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", mleko";
    }

    @Override
    public float koszt() {
        return napoj.koszt() + 0.20f;
    }
}
