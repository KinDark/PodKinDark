package struktury_danych.algorytmy;

public class Rekurencja {

    public void wypiszTekst(int liczba) {
        if (liczba > 10) {
            return;
        }
        System.out.println("Mój tekst z rekurencji: " + liczba);

        wypiszTekst(++liczba);
    }

    public int silniaRekurencja(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return n * silniaRekurencja(n - 1);
        }
    }

    public static void main(String[] args) {
        Rekurencja rekurencja = new Rekurencja();
        rekurencja.wypiszTekst(3);

       int wynikSilni = rekurencja.silniaRekurencja(5);
        System.out.println("Wynik silni: " + wynikSilni);
    }
}
