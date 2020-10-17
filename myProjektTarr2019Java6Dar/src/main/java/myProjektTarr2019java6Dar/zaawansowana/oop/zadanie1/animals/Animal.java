package pl.sdacademy.tarr2020java6.java.zaawansowana.oop.zadanie1.animals;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 16.05.2020
 **/
public class Animal {

    public String getName() {
        return name;
    }

    private String name;

    public Animal(String name){
        this.name = name;
        System.out.printf("\n%s urodził się",getName());

    }
}
