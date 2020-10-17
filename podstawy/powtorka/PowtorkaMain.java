package myProjektTarr2019java6Dar.podstawy.powtorka;

import myProjektTarr2019java6Dar.podstawy.Mlotek;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 16.02.2020
 **/
public class PowtorkaMain {

    public static void main(String[] args) {

        // zeby dostac mlotek od pomocnika
        // trzeba stworzy pomocnika
        Pomocnik panZObi = new Pomocnik();
        // alt+enter import
        // musimy najechać myszką na czerwony napis
        // potem alt+enter
        Mlotek mlotekOdPanaZObi = panZObi.dajNowyMlotek();

        // wypisujemy informacje o młotku
        System.out.println(mlotekOdPanaZObi);
    }
}
