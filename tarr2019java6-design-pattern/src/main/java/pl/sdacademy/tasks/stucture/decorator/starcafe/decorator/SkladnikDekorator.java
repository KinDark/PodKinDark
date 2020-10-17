package pl.sdacademy.tasks.stucture.decorator.starcafe.decorator;


import pl.sdacademy.tasks.stucture.decorator.starcafe.drinks.Napoj;

public abstract class SkladnikDekorator extends Napoj {

    public SkladnikDekorator(String opis) {
        super(opis);
    }

    public abstract String pobierzOpis();
}
