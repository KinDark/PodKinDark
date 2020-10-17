package myProjektTarr2019java6Dar.podstawy.scanner;

import java.util.Scanner;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 01.03.2020
 **/
public class ScannerMain {

    public static void main(String[] args) {
        {
            // \n -> enter
            String napis = "Toruń moje miasto!\nRok 2020";
            Scanner skaner = new Scanner(napis);// tworzymy skanner
            // nextLine() pobieramy linię
            String liniaPierwszaZNapisu = skaner.nextLine();
            System.out.println("Linia1:" + liniaPierwszaZNapisu);
            String liniaDrugaZNapisu = skaner.nextLine();
            System.out.println("Linia2:" + liniaDrugaZNapisu);
        }
        {
            String napis = "Toruń moje miasto!\nRok 2020";
            Scanner skaner = new Scanner(napis);// tworzymy skanner

            System.out.println("==============");
            // z użyciem pętli

            // powyższe wczytywanie z użyciem pętli line
            while (skaner.hasNext()) {
                System.out.println(skaner.nextLine());
            }
        }
    }
}
