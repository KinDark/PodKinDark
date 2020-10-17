package zadania_dom;

import struktury_danych.kolejka_lista.KolejkaLista;

import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZadanieJar {

    public static void main(String[] args) {

        KolejkaLista kolejka = new KolejkaLista();
        kolejka.add(5);
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        int i = 1;
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("1 - dodaj do listy. 2 - odczytaj z listy. 3-dodaj do kolejki");
        //int dana = klawiatura.nextInt();

        while (true) {
            int dana = klawiatura.nextInt();
            switch (dana) {
                case 1:
                    while (i < 600000) {
                        i++;
                        lista.add(i);
                    }
                    System.out.println("Zakończyłem dodawanie");
                   // dana = 0;
                    break;
                case 2:
                    for (i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i));
                    }
                  //  dana = 0;
                    break;
                case 3:
                    for(i=0; i< 200; i++) {
                        kolejka.add(i);
                    }
                    kolejka.add(10);
                    kolejka.add(22);
                    kolejka.add(33);
                    kolejka.add(-100);
                    System.out.println("Zakończyłem dodawanie");
                    break;
                case 9:
                    System.out.println("Koniec programu");
                    return;

            }
        }




    }


}
