package myProjektTarr2019java6Dar.podstawy.petle;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 29.02.2020
 **/
public class PetlaForMain {

    public static void main(String[] args) {

        int tablicaLiczb[] = new int[3];
        tablicaLiczb[0] = 20;
        tablicaLiczb[1] = 19;
        tablicaLiczb[2] = 18;

        String tablicaMiast[] = {"Toruń","Poznań","Berlin"};

        /**
         * Zadanie: Wypisz w pętli for elementy tablic
         */

        // pętla for po tablicy liczb
        for(int liczba : tablicaLiczb){// 23,34,26,33,32
            System.out.println(liczba);
        }

        // i = iteracja
        // ( warunek początkowy ; warunek zakończenia ; krok )
        // krok i++ to znaczy że kto jest o jeden
        for(int i = 0; i<3;i++){
            System.out.println(tablicaLiczb[i]);
//            int wynik = 3 * i;
        }
    }
}
