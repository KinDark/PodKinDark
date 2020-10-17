package myProjektTarr2019java6Dar.podstawy.zadania.rozwiazania.ulamki;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 15.02.2020
 **/
public class UlamekRozszerzonyImpl extends UlamekImpl implements Ulamek {

    public UlamekRozszerzonyImpl(int licznik, int mianownik) {
        super(licznik, mianownik);
    }

    @Override
    public Ulamek dodaj(Ulamek ulamek) {
        // czy ten sam mianownik
        if(mianownik()==ulamek.mianownik()){
            return new UlamekRozszerzonyImpl(licznik+ulamek.licznik(),mianownik);
        }else{
            // wspolny mianownik
            int wspolnyMianownik = Matematyka.nww(mianownik, ulamek.mianownik());
            int rozszerzenie1 = wspolnyMianownik/mianownik;
            Ulamek ulamek1 = Matematyka.rozszerzUlamek(this,rozszerzenie1);
            int rozszerzenie2 = wspolnyMianownik/ulamek.mianownik();
            Ulamek ulamek2 = Matematyka.rozszerzUlamek(ulamek, rozszerzenie2);
            return ulamek1.dodaj(ulamek2);
        }
    }

    @Override
    public int licznik() {
        return licznik;
    }

    @Override
    public int mianownik() {
        return mianownik;
    }
}
