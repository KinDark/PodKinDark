package zadania_dom.plik_CSV_zapis_odczyt;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

import static java.nio.file.Files.delete;

public class BazaDanychMain {

    public static ArrayList<BazaDanych> lista = new ArrayList<>();
    //  static ArrayList<ArrayList<Integer>> test = new ArrayList<>();
    public static int nowyId = 0;


    public static void main(String[] args) {
         int dat = 2010;
        System.out.printf("\nData: %tF",Calendar.getInstance());
        System.out.printf("\nData: %tY-%<tm",Calendar.getInstance());
         //     String to = String.format("###-###-###");
        //      String.format(to, )= "753-444-666";
//        System.out.println(to);

//                                                                List list = new ArrayList<>(); // Utworzenie obiektu ArrayList
//
//                                                                list.add(new Time2(6, 24, 34));
//                                                                list.add(new Time2(18, 14, 58));
//                                                                list.add(new Time2(12, 14, 58));
//                                                                list.add(new Time2(6, 24, 22));
//
//                                                                // Wyświetlenie elementów z List
//                                                                System.out.printf("Nieposortowane elementy tablicy:%n%s%n", list);
//
//                                                                // Sortowanie z użyciem własnego obiektu TimeComparator
//                                                                   Collections.sort(list, new TimeComparator());
//
//                                                                // Wyświetlenie elementów z List
//                                                                System.out.printf("Posortowane elementy tablicy:%n%s%n", list);

    //**** LISTA W LIŚCIE ***********************************************************************************************
    //...... DODAĆ DO PRZED MAIN........
//                                            static ArrayList<ArrayList<Integer>> test = new ArrayList<>();
    //...................................

//                                                                ArrayList<Integer> test1a1 = new ArrayList<>(); //tworzenie listy 1
//                                                                test1a1.add(5);      // dodanie
//                                                                test1a1.add(10);    // elementow do listy 1
//
//                                                                test.add(test1a1);  //dodanie listy 1 do zestawu listr
//                                                                System.out.println(test1a1); //wypisanie listy 1
//                                                                ArrayList<Integer> test1a2 = new ArrayList<>();  //tworzenie listy 2
//                                                                test1a2.add(17);
//                                                                test1a2.add(27);
//                                                                test1a2.add(200);
//                                                                test.add(test1a2); //powtarzam kroki jak przy liście 1
//                                                                System.out.println(test1a2); // wypisuje listę drugą
//                                                                ArrayList<Integer> test3 = test.get(0); //tworzę listę 3 pobierając pierwszy element listy list (czyli liste pierwszą)
//                                                                System.out.println(test3); // wypisuje listę 3 (czyli wypszę to samo co przy liście pierwszej
//                                                                System.out.println(test.size());
//                                                                System.out.println(test1a2.contains(17));
    //**************************************************************************************************************


//    odczytDane();
//    for( BazaDanych element :lista) {
//        System.out.println(element);
//    }
//        System.out.println(lista);

//        dodajDane();
//        nowyId++;
//        dodajDane();
//        nowyId++;

    ////        for (BazaDanych element : lista) {
////            System.out.println(element);
////        }
//        System.out.println(lista);
    zapiszDane();

}


    public static void dodajDane() {
        BazaDanych nowy = new BazaDanych(nowyId);
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        nowy.setImie(skaner.nextLine());
        if (nowy.getImie().length() == 0) {
            System.out.println("OKOKOKOK");
        }
        if (nowy.getImie().equals("")) {
            nowy.setImie("-");
        }

        //       Integer.parseInt(nowy.getImie());
        //   System.out.println(Integer.parseInt(nowy.getImie()));  //Sprawdzenie czy jest text

        System.out.println("Podaj nazwisko: ");
        nowy.setNazwisko(skaner.nextLine());
        System.out.println("Podaj wiek: ");
        try {
            nowy.setWiek(skaner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Podaj liczbę !!");
        }

        lista.add(nowy);
    }

    private static void zapiszDane() {


        try {
            //delete(Paths.get("file1.txt"));



            //      delete(Paths.get("plik.csv")); // usuwa  plik
     //       Files.delete(Paths.get("plik.csv")); // usuwa plik
//     //........................................................................................................
//                //........KOPIOWANIE I PRZENOSZENIE PLIKU ................................................................
//                          Path source = Paths.get("file1.txt"); //utworz plik
//                          Path target1 = Paths.get("file2.txt"); //utworz plik
//                          Path target2 = Paths.get("file3.txt"); //utworz plik
//
//                        //  Files.createFile(Paths.get("file1.txt")); // utwórz plik
//                          // Files.copy(Paths.get("skąd"), Paths.get("dokąd"), StandardCopyOption.REPLACE_EXISTING);
//                           Files.copy(source, target1, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES); //kopiowanie
//                           Files.move(target1, target2, StandardCopyOption.REPLACE_EXISTING); // przenosi dane i usuwa plik
//                         // REPLACE_EXISTING - zastąpienie pliku w przypadku, gdy docelowy plik istnieje (domyślnie wyjatek FileAlreadyExistsException)
//     //........................................................................................................
     //........ https://docs.oracle.com/javase/7/docs/api/java/nio/file/StandardOpenOption.html ...............
             //  Files.writeString(Paths.get("plik.csv"), lista.toString(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
               // StandardOpenOption.TRUNCATE_EXISTING wymazuje wszystko z pliku i zapisuje na nowo
     //........................................................................................................
            Files.writeString(Paths.get("plik.csv"), lista.toString(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            //CStandardOpenOption.CREATE - utwórz nowy plik jesli nie istnieje

        } catch (IOException e) {
            System.out.println("Błąd na pliku");
            e.printStackTrace();
        }
    }

    private static void odczytDane() {
        try {
            //     List<String> plik = Files.readAllLines(Paths.get("plik.sp"));
            List<String> odczyt;
            // String odczyt;
            odczyt = Files.readAllLines(Paths.get("plik.csv"));
            String odczytana = odczyt.toString();
            //      odczytana = odczytana.replace("[", "");
            //      odczytana = odczytana.replace("]", "");

             //   String[] rozdzielNaPliki = odczytana.split("]");

         //  System.out.println(rozdzielNaPliki.length);
          //  System.out.println(" consta " + odczytana.contains("t"));

            String[] rozdzielNaPliki = odczytana.split(",");
            int j = 0;
            for (int i = 1; rozdzielNaPliki.length >= i; i++, j++) {
                rozdzielNaPliki[j] = rozdzielNaPliki[j].trim();
                String[] rozdzielNaDane = rozdzielNaPliki[j].split(" ");
                BazaDanych bazaDanych = new BazaDanych(
                        Integer.parseInt(rozdzielNaDane[0]), //ID
                        rozdzielNaDane[1], // imie
                        rozdzielNaDane[2], // nazwisko
                        Integer.parseInt(rozdzielNaDane[3]) // wiek
                );
                System.out.println("bazadanych" + bazaDanych);
                lista.add(bazaDanych);
            }
        } catch (IOException exception) {
            System.out.println("Brak pliku!");
        } catch (NumberFormatException e) {
            System.out.println("Plik pusty lub nieprawidłowe dane");
        }


    }
}