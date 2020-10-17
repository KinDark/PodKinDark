package pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.Animal;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.interfejsy.Predator;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 16.05.2020
 **/
public class Fox extends Mammal implements Predator {

    public Fox(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {

    }
}
