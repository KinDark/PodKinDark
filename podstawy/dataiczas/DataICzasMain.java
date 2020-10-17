package myProjektTarr2019java6Dar.podstawy.dataiczas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 29.02.2020
 **/
public class DataICzasMain {

    public static void main(String[] args) {

        // przykład użycia daty i czas
        LocalDateTime dataICzas = LocalDateTime.now();
        dataICzas.plusDays(3);
        System.out.println(dataICzas);

        String napisDataICzas = "2020-02-29 11:46";
        napisDataICzas += 3;
        System.out.println(napisDataICzas);

        // konwersja napisu na datę
        String dataJakoNapis = "2020-02-29 15:55";
        String formatDaty = "yyyy-MM-dd HH:mm";

        // tworzymy formater potrzebny do parsowania daty
        // musimy wiedzieć w jakim formacie jest data którą formatujemy
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDaty);
        // powstała data poniżej w wyniku parsowania dataJakoNapis
        LocalDateTime data = LocalDateTime.parse(dataJakoNapis,formatter);


        LocalDateTime dataZkonwersji = konwersjaNapisNaDate(dataJakoNapis);
        // wypisz date
        // wypisana data posiada własny format z literką 'T'
        System.out.println("data:  "+dataZkonwersji);

        // konwersja daty na napis
        LocalDateTime dataTeraz = LocalDateTime.now();
        String obecnaData = dataTeraz.format(formatter);
        System.out.println("obecna data: "+obecnaData);

        System.out.println("Czy teraz jest po "+dataZkonwersji);
        if(dataTeraz.isAfter(dataZkonwersji)){
            System.out.println("tak");
        }else{
            System.out.println("nie");
        }
    }

    /**
     * Zadanie implementacja metod na podstawie slajdu
     */


    public static LocalDateTime konwersjaNapisNaDate(String dataJakoNapis){
        //implementacja
        String formatDaty = "yyyy-MM-dd HH:mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDaty);
        return LocalDateTime.parse(dataJakoNapis,formatter);
    }

    public static String konwersjaDataNaNapis(LocalDateTime wprowadzonaData){
        //implementacja
        String formatDaty = "yyyy-MM-dd HH:mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDaty);
        return wprowadzonaData.format(formatter);
    }
}
