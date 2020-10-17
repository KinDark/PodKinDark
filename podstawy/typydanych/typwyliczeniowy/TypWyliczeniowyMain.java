package myProjektTarr2019java6Dar.podstawy.typydanych.typwyliczeniowy;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 29.02.2020
 **/
public class TypWyliczeniowyMain {

    public static void main(String[] args) {

        /**
         * Typ wyliczeniowy enumeryczny enum
         *
         * Tworzymy:
         *
         * enum Nazwa {WARTOSC_1,WARTOSC2}
         *
         * Uwaga. Może być utworzony w osobnym pliku
         */

        // mamy Janusza
        // tworzy aplikacje do Formatu papieru
        // potrzebuje informacji o formacie
        // jak mu ją dostarczyć ?
        // A4
        String formatA4 = "A4";
        String formatB3 = "Be3";// powinno być B3 w napisie łatwo o błąd
        // wpisanie w pole tekstowe

        // mamy do dyspozycji enum FormatPapieru
        FormatPapieru wybranyFormat;
        wybranyFormat = FormatPapieru.B3;
        System.out.println(wybranyFormat);// wypisanie : B3

        /**
         * Zadanie1
         * Uwtórz zmienna typu wyliczeniowego Status
         * wartości: Aktywny, nieaktyny, zalogowany, nie zalogowany
         * Przykład użycia oraz wypisanie na konsoli
         */

        Status statusUzytkownika = Status.AKTYWNY;
        System.out.println(statusUzytkownika);

        /**
         * Zadanie2
         * Uwtórz zmienna typu wyliczeniowego Plec
         * wartości: mezczyzna, kobieta
         * Przykład użycia oraz wypisanie na konsoli
         */
        Plec plecKobiety = Plec.KOBIETA;
//        plecKobiety = Plec.MEZCZYZNA;
        System.out.println(plecKobiety);
    }
}
