package pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1;

import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.birds.Eagle;
import pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals.mammals.Squirrel;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 16.05.2020
 **/
public class Zadanie1Main {

    public static void main(String[] args) {

        /**
         * Zadanie: Utworz odpowiednie zwierzaki
         *
         * Classes:
         * Deer, - Mammal, Vegenarian
         * Squirrel, - Mammal, Vegenarian, Prey
         * Elephant, - Mammal, Vegenarian
         * Fox, - Mammal, Predator
         * Whale, - Mammal, Predator
         * Snake, - Animal, Predator
         * Eagle, - Bird, Predator
         * Stork, - Bird, Predator
         * Lion, - Mammal, Predator
         * Sunflower, - Plant
         * Grass, - Plant
         *
         * Interfaces:
         * Vegenarian, - methods: eat(Plant plant)
         * Predator, - methods: eat(Animal animal)
         * Prey, - methods: runAwayFrom(Animal animal)
         *
         * Extends classes:
         * Bird, - Animal
         * Animal,
         * Mammal, - Animal
         * Plant
         */

        /**
         * Ważne!!!
         * - Interfejsy nie posiadają ciał metod !
         * - W klasach implementujemy metody z interfejsów
         *
         */

        /**
         * Zadanie1: Stwórz wiewiórkę nazwij ją Pinky
         * Utwórz konstrukor ustawiający pole name;
         *
         * Uwaga. Konstruktor powinien być utworzony w klasie Animal
         * i będzie dostępny we wszystkich klasa które rozszerzają
         * klase Animal
         *
         * Dostajemy infomacje informacje o narodzinach
         */
        Squirrel pinky = new Squirrel("Pinky");

        /**
         * Zadanie2: Utworz obiekt Eagle. Wykonaj metodę eat()
         * argumentem będzie wiewiórka z Zadania1.
         * Implementacja będzie wyglądać następująco
         * na konsolę program wypisze:
         *
         * 'imieWiewiorki' została zjedzona przez 'imieOrła'
         */
        Eagle baldEagle = new Eagle("Bald Eagle");
        baldEagle.eat(pinky);

        /**
         * Zadanie3:Utworz obiekt Lion i Elephant.
         * Elephant ucieka.
         * Lion chce to zjeść.
         */


        /**
         * Zadanie4:Utworz jelonek 'Bambi'.
         * jelonek je trawe. Wystraszył się i ucieka.
         * Lew uciekł z ZOO i chce zjeść jelonka.
         *
         */


        /**
         * Zadanie5: Boa 'Kaa' próbuje udusić jelonka. Udaje mu się. :(
         * Potem próbuje udusić słonia i ma problem.
         *
         */


    }
}


