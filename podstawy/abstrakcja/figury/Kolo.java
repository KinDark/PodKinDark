package myProjektTarr2019java6Dar.podstawy.abstrakcja.figury;

import myProjektTarr2019java6Dar.podstawy.abstrakcja.Figura;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 01.03.2020
 **/
public class Kolo extends Figura {

    public Kolo(float r) {
        this.r = r;
    }

    private float r;

    public Kolo(){
        nazwa = "Koło";
    }

    @Override
    public float obliczPole() {
        return 3.14f*r*r;
    }

    @Override
    public float obliczObwod() {
        return 2*r*3.14f;
    }

    // metody poniżej są w Figura
//    @Override
//    public void wypiszInformacje() {
//        wypiszNazwe();
//    }
//
//    @Override
//    public void wypiszNazwe() {
//        System.out.println(nazwa);
//    }
}
