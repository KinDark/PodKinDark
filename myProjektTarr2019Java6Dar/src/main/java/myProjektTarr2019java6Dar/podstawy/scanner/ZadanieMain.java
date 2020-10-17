package myProjektTarr2019java6Dar.podstawy.scanner;

import myProjektTarr2019java6Dar.podstawy.klasy.User;

import java.util.Scanner;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 01.03.2020
 **/
public class ZadanieMain {

    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        // tworzymy skanner in -> wejście

        System.out.println("======================================");
        System.out.println("==== System Tworzenia Użytkownika ====");
        System.out.println("======================================");

        // powyższe wczytywanie z użyciem pętli line

        // wczytywanie imie
        System.out.println("Podaj imię:");
        String wczytanieImie = skaner.nextLine();

        // wczytanie nazwiska
        System.out.println("Podaj nazwisko:");
        String wczytanieNazwisko = skaner.nextLine();

        // wczytanie wieku
        // nextInt()
        System.out.println("Podaj wiek:");
        int wczytanieWiek = skaner.nextInt();


        // wyświetlenie utworzono użytkownika imię i nazwisko
        // ustawiamy wczytane wartości do zmiennych
        String imie = wczytanieImie;
        String nazwisko = wczytanieNazwisko;
        int wiek = wczytanieWiek;
        // utworzymy użytkownika
        System.out.println("======================================");
        User uzytkownik = new User(imie,nazwisko,wiek);
        System.out.println("INFO: Utworzono użytkownika!");
        // wypiszemy z użyciem toString()
        System.out.println(">>> "+uzytkownik);

    }
}
