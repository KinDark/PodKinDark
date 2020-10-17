package pl.sdacademy.tarr2020java6.klasy;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 15.02.2020
 **/
public class User {

    String imie;
    String nazwisko;
    int wiek;

    public User(String wprowadzoneImie, String wprowadzoneNazwisko, int wprowadzonyWiek) {
        imie = wprowadzoneImie;
        nazwisko = wprowadzoneNazwisko;
        wiek = wprowadzonyWiek;
    }

    public String toString(){
        return imie +" "+nazwisko+" "+wiek;
    }
}
