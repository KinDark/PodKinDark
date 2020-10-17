package zadania_dom.plik_CSV_zapis_odczyt.zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Zadanie1Main {
    public static void main(String[] args) {

        Zamowienie zamowienie1 = new Zamowienie(12.343f, 34, "pepsi");
        Zamowienie zamowienie2 = new Zamowienie(15.3f, 34, "pepsi");
        Zamowienie zamowienie3 = new Zamowienie(1.4f, 34, "pepsi");
        Zamowienie zamowienie4 = new Zamowienie(12.99f, 34, "pepsi");


        List<Zamowienie> listaZamowien = new ArrayList<>();
        //dodawanie do listy elementu
        listaZamowien.add(zamowienie1);
        listaZamowien.add(zamowienie2);
        listaZamowien.add(zamowienie3);
        //petla for listy zamowien
        for (Zamowienie element : listaZamowien) {
            element.pobierzCene();
            System.out.println(element);
        }
        System.out.println(listaZamowien);


        System.out.println(new Zamowienie(43, 33, "ptasia grypa"));

        float cena1 = zamowienie1.cena;
        float cena2 = zamowienie2.pobierzCene();
        float cena3 = zamowienie3.pobierzCene();
        float suma = cena1 + cena2 + cena3;
        System.out.println("\n\n===============================================");

        StringBuilder sb = new StringBuilder();
        sb.append(zamowienie1.pobierzCene() + " ");
        // sb.append(cena1 + " ");
        sb.append(cena2 + " ");
        sb.append("Rocks").append("!").append(0);
        System.out.println(sb.toString());  // value => "Java Rocks!0"


        StringBuilder builder = new StringBuilder();
        //  builder.append("Kwota  \n" + zamowienie1.cena ).append("\n" + (cena2 + cena2)).append("\n" + cena3).append(" \n zł");
        System.out.println(builder);
        // System.out.println(builder.toString());

        System.out.println("\n\n===============================================");

        //   System.out.println(zamowienie1.cena);
        System.out.println(zamowienie2.pobierzCene());
        System.out.println(zamowienie3.pobierzCene());
        System.out.println("Suma:");
        //  System.out.println(cena1 + cena2 + cena3);

        System.out.println("Suma za zakupy " + suma + " zł");

        System.out.println("Suma: " + (zamowienie1.pobierzCene() + zamowienie2.pobierzCene() + zamowienie3.cena));
        System.out.println("Sume: " + zamowienie1.pobierzCene() + zamowienie1.cena + zamowienie1.cena + " zł");

    }
}