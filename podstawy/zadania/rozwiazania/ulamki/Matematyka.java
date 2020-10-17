package myProjektTarr2019java6Dar.podstawy.zadania.rozwiazania.ulamki;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 15.02.2020
 **/
public class Matematyka {

    public static int nwd(int x, int y) {
        while (x != y) {
            if (x > y)
                x -= y;
            else
                y -= x;
        }
        return x;
    }

    public static int nww(int x, int y){
        return ((x*y)/nwd(x,y));
    }

    public static Ulamek rozszerzUlamek(Ulamek ulamek, int liczba){
        return new UlamekRozszerzonyImpl(ulamek.licznik()*liczba, ulamek.mianownik()*liczba);
    }
}
