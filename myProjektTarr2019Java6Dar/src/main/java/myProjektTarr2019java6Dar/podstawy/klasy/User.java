package myProjektTarr2019java6Dar.podstawy.klasy;

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
        return "imię:"+imie +" nazwisko:"+nazwisko+" wiek:"+wiek;
    }
}
