package myProjektTarr2019java6Dar.podstawy.zadania.rozwiazania.ulamki;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 15.02.2020
 **/
public class UlamkiMain {

    public static void main(String[] args) {

        Ulamek a = new UlamekImpl(1,2);
        Ulamek b = new UlamekImpl(3,2);

        Ulamek c = a.dodaj(b);

        System.out.println(c);

        Ulamek x = new UlamekRozszerzonyImpl(1,2);
        Ulamek y = new UlamekRozszerzonyImpl(3,4);

        Ulamek z = x.dodaj(y);

        System.out.println(z);
    }
}
