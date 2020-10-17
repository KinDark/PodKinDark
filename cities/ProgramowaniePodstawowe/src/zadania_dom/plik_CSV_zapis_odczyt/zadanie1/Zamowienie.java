package zadania_dom.plik_CSV_zapis_odczyt.zadanie1;

public class Zamowienie {

    public int numer;
    //int numer;
    float cena;
    String nazwa;

    public Zamowienie (){
        cena = 456.44f; nazwa = "er"; numer = 1;

    }

    public Zamowienie(float przypiszCene, int przypisanyNumer, String przypisanaNazwa) {
        cena = przypiszCene;
        numer = przypisanyNumer;
        nazwa = przypisanaNazwa;
    }

    public float pobierzCene() {
        // return cena + numer;
        return cena ;
    }
    public int pobierzNumer(){
        return numer;
    }

    public String toString() {
       // System.out.println("tttttttttt");
        return nazwa + " " + cena + " " + numer;
    }



}


