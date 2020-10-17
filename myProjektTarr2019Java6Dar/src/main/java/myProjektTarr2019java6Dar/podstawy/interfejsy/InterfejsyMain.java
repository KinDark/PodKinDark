package myProjektTarr2019java6Dar.podstawy.interfejsy;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 15.02.2020
 **/
public class InterfejsyMain {

    public static void main(String[] args) {
        // camelCase - metoda wielbłądzia
        // kolejny wyraz z wielkiej litery
        // bez spacji !!!
        McDonald mcDonaldNaRynku;

        // inicjalizacja
        mcDonaldNaRynku = new RynekMcDonaldImpl();

        // Zadanie 1.
        // Poproś o frytki i mcflury w mcdonald na rynku
        mcDonaldNaRynku.poproszeFrytki(30);
        mcDonaldNaRynku.poproszeMcFlury(30);

        // Zadanie 2.
        // Stwórz implementację PlazaMcDonaldImpl
        // podobnie jak w przypadku rynku
        // wykonaj polecenia w plazie tak jak na rynku
    }
}
