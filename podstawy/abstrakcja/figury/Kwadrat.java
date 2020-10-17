package myProjektTarr2019java6Dar.podstawy.abstrakcja.figury;

import myProjektTarr2019java6Dar.podstawy.abstrakcja.Figura;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 01.03.2020
 **/
public class Kwadrat extends Figura {

    private int a;

    private Kwadrat(){
        nazwa = "Kwadrat";
    }

    public Kwadrat(int a){
        this();// wywolanie konstruktora domyślnego
        this.a = a;
    }

    @Override
    public float obliczPole() {
        return a*a;
    }

    @Override
    public float obliczObwod() {
        return 4*a;
    }
}
