package myProjektTarr2019java6Dar.podstawy.abstrakcja.figury;

import myProjektTarr2019java6Dar.podstawy.abstrakcja.Figura;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 01.03.2020
 **/
public class Prostokat extends Figura {

    public Prostokat(float a, float b) {
        this.a = a;
        this.b = b;
    }

    private float a,b;

    @Override
    public float obliczPole() {
        return a*b ;
    }

    @Override
    public float obliczObwod() {
        return 2*a*2*b;
    }
}
