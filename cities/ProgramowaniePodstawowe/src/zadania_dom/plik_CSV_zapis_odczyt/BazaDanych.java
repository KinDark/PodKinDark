package zadania_dom.plik_CSV_zapis_odczyt;

public class BazaDanych {

    private int ID;
    private String imie;
    private String nazwisko;
    private int wiek;


    BazaDanych(int ID) {
        this.ID = ID;
    }

    BazaDanych(int ID, String imie, String nazwisko, int wiek) {
        this.ID = ID;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;

    }

    public String toString() {
        return ID+ " " + imie + " " + nazwisko + " " + wiek;
       // return getID()+ " " + getImie() + " " + getNazwisko() + " " + getWiek();
    }
    public int toString( int ww){
        return ww;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }


}
