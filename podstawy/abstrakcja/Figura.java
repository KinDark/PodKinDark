package myProjektTarr2019java6Dar.podstawy.abstrakcja;

import myProjektTarr2019java6Dar.podstawy.abstrakcja.interfejsy.Informacje;
import myProjektTarr2019java6Dar.podstawy.abstrakcja.interfejsy.Obliczenia;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 01.03.2020
 **/
public abstract class Figura implements Informacje, Obliczenia{

    protected String nazwa;


    @Override
    public void wypiszInformacje() {
        System.out.println("------------------");
        wypiszNazwe();
        System.out.println("pole="+obliczPole());
        System.out.println("obwód="+obliczPole());
    }

    @Override
    public void wypiszNazwe() {
        System.out.println(nazwa);
    }

    @Override
    public abstract float obliczPole();

    @Override
    public abstract float obliczObwod();
}
