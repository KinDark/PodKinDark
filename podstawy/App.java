package myProjektTarr2019java6Dar.podstawy;
//generate test
//alt + enter


import static java.lang.Math.PI;

/**
 * App
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 **/
public class App {
    //code format
    //ctrl+alt+L

    // alt + insert + enter
    // generate code

    //psvm + tab
    public static void main(String[] args) {
        //sout + tab
        System.out.println("Hello World!");

        // dodanie zmiennej Math.PI
        // typ nazwa = wartosc ;
        double liczba = 3.0;// zmienna ma wartość 3.0
        liczba = PI;// zmienna ma wartość 3.141592...
        liczba = Math.PI;
        liczba = java.lang.Math.PI;

        //double liczba = 3.6;
        int number;// deklaracja
        number = 2020;// inicjalizacja

        int number2 = 6;// deklaracja i inicjalizacja w jednej lini

        System.out.println(number);

        wypiszLiczbe(number2);

        // String - napis;ciąg znaków
        String odpowiedz = coNaObiad();// odpowiedź metody
        // jest przypisana do zmiennej odpowiedź

        System.out.println(odpowiedz);
        System.out.println(coNaObiad());// tutaj nie tworzymy zmiennej
        System.out.println(coNaObiad("jutro"));// tutaj nie tworzymy zmiennej
        System.out.println(coNaObiad("pojutrze"));// tutaj nie tworzymy zmiennej

        // Zadanie: Stwórz metodę liczącą sume 3 liczb całkowitych (int)
        // deklarujemy i inicjalizujemy 3 zmienne a,b,c
        // wynik metody zapisujemy do zmiennej wynik
        // wypisujemy wynik na konsoli
        int wynik;
        wynik = sumaLiczb(1,2,3);
    }

    private static int sumaLiczb(int a, int b, int c) {
        return a+b+c;
    }


    // metoda zwraca odpowiedz co na obiad
    private static String coNaObiad(String kiedy) {
        return kiedy+" będzie "+"gulasz";
    }

    // metoda zwraca odpowiedz co na obiad
    private static String coNaObiad() {
        return "Pomidorowa z rosołu ze wczoraj";
    }


    // metoda void nic nie zwraca
    private static void wypiszLiczbe(int liczba) {
        System.out.println("Twoja liczba to :"+liczba);
    }

}