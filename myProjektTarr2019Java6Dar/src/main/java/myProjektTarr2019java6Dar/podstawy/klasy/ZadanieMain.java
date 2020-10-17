package myProjektTarr2019java6Dar.podstawy.klasy;

import myProjektTarr2019java6Dar.podstawy.Mlotek;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 15.02.2020
 **/
public class ZadanieMain {

    public static void main(String[] args) {

        User uzytkownik = new User("Jan",
                "Brzechwa",
                43);
        System.out.println(uzytkownik.toString());
        System.out.println(uzytkownik);// domyślnie wykorzystuje sie
        // metodę toString()
        System.out.println(new User("a",
                "b",
                0));
        System.out.println(new Mlotek());
    }

}
