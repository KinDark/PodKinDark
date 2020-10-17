package pl.sdacademy.design.patterns.operation.observer.meteo;

import pl.sdacademy.design.patterns.operation.observer.meteo.observer.MeteoCurrentDisplay;
import pl.sdacademy.design.patterns.operation.observer.meteo.observer.MeteoStatistic;
import pl.sdacademy.design.patterns.operation.observer.meteo.subject.MeteoData;

/**
 *
 * Wzorzec okresla zaleznosc jeden do wielu. Kiedy zmieni sie stan obiektu w tym przypadku poprzez dodanie
 * do meteoData nowych danych wszystkie obiekty zależne od danych czyli MeteoCurrentDisplay oraz MeteoStatistic
 * automatycznie są powiadamiane o nowych danych oraz aktualizowane. Zmiana średnich danych oraz wyświetlenie nowych
 * aktualnych danych.
 *
 * Podobne zachowanie mamy w excelu gdzie mamy jedną tabelkę i 3 rodzaje wykresów słupkowy czy kołowy
 * gdy zmieniamy dane wykresy ulegają zmianie.
 *
 * Zadanie:
 *  * na podstawie MeteoCurrentDisplay oraz MeteoStatistic dodaj kolejny MeteoForecastDisplay czyli prognoza pogody
 *    wzory można samemu wymyśleć lub skorzystać ze znalezionych w internecie
 */
public class Main {

    public static void main(String[] args) {
        MeteoData meteoData = new MeteoData();

        //wyswietlacze
        MeteoCurrentDisplay meteoCurrentDisplay = new MeteoCurrentDisplay(meteoData);
        MeteoStatistic meteoStatistic = new MeteoStatistic(meteoData);

        //wczytywanie danych
        meteoData.setRead(26.6f, 35f, 1013.1f);
        meteoData.setRead(28.1f, 85f, 998.5f);
        meteoData.setRead(25.9f, 12f, 996.0f);
    }
}
