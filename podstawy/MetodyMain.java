package myProjektTarr2019java6Dar.podstawy;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 15.02.2020
 **/
public class MetodyMain {
    /**
     * Tworzenie obiektów wywoływanie metod
     *
     * - statyczne ( na korytarzu )
     * - na obiekcie ( na koledze )
     */

    public static void main(String[] args) {

        // deklaracja i inicjalizacja zmiennej napis
        String napis = "Zajecia SDA TARR";

        napis = napis.toLowerCase();// jeśli są nawiasy to jest to metoda

        System.out.println(napis);

        Mlotek czerwonyMlotek;// zmienna nie zainicjowana
        // powyzej deklaracja młotka

        czerwonyMlotek = new Mlotek();// new oznacza tworzenie
        // za pomocą konstruktora domyslny

        String napisKolor = czerwonyMlotek.pobierzKolor();
        System.out.println(napisKolor);

        // zielony mlotek jest zielony poniewaz
        // uzylismy konstruktora argumentowego z argumentem 'zielony'
        Mlotek zielonyMlotek = new Mlotek("zielony");

        // zielonyMlotek.kolor = "różowy";//bez modyfikatora dostępu
        // gdy kolor w mlotku jest private
        // nie mamy dostępu



    }
}
