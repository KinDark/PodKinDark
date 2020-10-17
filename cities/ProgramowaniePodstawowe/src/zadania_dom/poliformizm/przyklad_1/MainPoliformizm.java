package zadania_dom.poliformizm.przyklad_1;

public class MainPoliformizm {
    public static void main(String[] args) {
       Zwierze zwierze = new Pies ("Lysy");
        zwierze.wydajDzwiek();
//
//        zwierze = new Kon();
//        zwierze.wydajDzwiek();
        Osoba osoba = new Osoba();
        Pies pies = new Pies("Rafał");
        Kon kon = new Kon("Glut");

        osoba.przygarnijZwierze(kon);
        osoba.jakNazywaSieTwojeZwierzatko();




    }
}
