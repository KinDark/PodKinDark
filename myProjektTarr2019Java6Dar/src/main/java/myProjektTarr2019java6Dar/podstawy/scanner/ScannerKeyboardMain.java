package myProjektTarr2019java6Dar.podstawy.scanner;

import java.util.Scanner;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 01.03.2020
 **/
public class ScannerKeyboardMain {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        // tworzymy skanner in -> wejście

        System.out.println("==============");
        // z użyciem pętli

        // powyższe wczytywanie z użyciem pętli line
        while (skaner.hasNext()) {
            String wczytanaLinia = skaner.nextLine();
            System.out.println(wczytanaLinia);
            // equalsIgnoreCase - równe nie zależnie od wielkości liter
            // contains - zawiera
            if(wczytanaLinia.equalsIgnoreCase("x")){
                break;
            }
        }
        System.out.println("Koniec.");
    }
}
