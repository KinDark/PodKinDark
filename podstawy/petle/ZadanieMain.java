package myProjektTarr2019java6Dar.podstawy.petle;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 01.03.2020
 **/
public class ZadanieMain {

    public static void main(String[] args) {
        // Zadanie
        //==============
        // stworzenie tablicy imion
        // w pętli wypisz imion zawierający literę "a"
        // skorzystaj z metody contains
        // przykład :
        //
        //          imie.contains("a")
        String tablicaImion[] = {"Alf","Jess","Steve","Adam","Anna","Julia","Kinga"};

        for(String imie : tablicaImion){
            if(imie.contains("a") || imie.contains("A")){
                System.out.println(imie);
            }
            // poniżej alternatywne rozwiązanie
//            if(imie.toLowerCase().contains("a")){
//                System.out.println(imie);
//            }
        }

    }
}
