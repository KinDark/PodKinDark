package myProjektTarr2019java6Dar.podstawy.zadania.rozwiazania.ulamki;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 15.02.2020
 **/
public class UlamekImpl implements Ulamek {

    int licznik;
    int mianownik;

    public UlamekImpl(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }


    @Override
    public Ulamek dodaj(Ulamek ulamek) {
        return new UlamekImpl(licznik+ulamek.licznik(),mianownik());
    }

    @Override
    public int licznik() {
        return licznik;
    }

    @Override
    public int mianownik() {
        return mianownik;
    }

    public String toString(){
        return licznik + " / "+ mianownik;
    }
}
