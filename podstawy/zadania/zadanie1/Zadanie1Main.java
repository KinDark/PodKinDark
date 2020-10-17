package myProjektTarr2019java6Dar.podstawy.zadania.zadanie1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 16.02.2020
 **/
public class Zadanie1Main {

    // psvm
    public static void main(String[] args) {

        // tutaj tworzymy zamówienie i wypisujemy cene
        Zamowienie zamowienie1 = new Zamowienie(1,12.99f, "Frytki");
        Zamowienie zamowienie2 = new Zamowienie(2,2.99f, "Cola");
        Zamowienie zamowienie3 = new Zamowienie(3,1.99f, "Tofu");

        // gdy mamy List to domyślnie jest to List<Object>
        List<Zamowienie> listaZamowien = new ArrayList();

        // dodawanie do listy elementu
        listaZamowien.add(zamowienie1);
        listaZamowien.add(zamowienie2);
        listaZamowien.add(zamowienie3);

        //petla for listy zamówień
        int i ;// indeks
        for(Zamowienie element: listaZamowien){
            element.pobierzCena();
            i = listaZamowien.indexOf(element);
        }

        float cena1 = zamowienie1.pobierzCena();
        float cena2 = zamowienie2.pobierzCena();
        float cena3 = zamowienie3.pobierzCena();

        float suma = cena1 + cena2 + cena3;

        // Zadanie: Użyj String buildera zamiast
        //    System.out.println()
        // przykład w BuilderMain

        System.out.println(zamowienie1.toString());// metoda
        // toString() jest domyślna nie trzeba jej pisać
        System.out.println(zamowienie2);
        System.out.println(zamowienie3);

        System.out.println("suma="+suma);

    }
}
