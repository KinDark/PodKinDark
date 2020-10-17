package myProjektTarr2019java6Dar.podstawy.zadania.zadanie1;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 16.02.2020
 **/
public class Zamowienie {

    int numer;
    float cena;
    String nazwa;

    public Zamowienie(int wprowadzonyNumer, float wprowadzonaCena, String wprowadzonaNazwa){
        numer = wprowadzonyNumer;
        cena = wprowadzonaCena;
        nazwa = wprowadzonaNazwa;
    }

    public float pobierzCena(){
        return cena;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "numer=" + numer +
                ", cena=" + cena +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
