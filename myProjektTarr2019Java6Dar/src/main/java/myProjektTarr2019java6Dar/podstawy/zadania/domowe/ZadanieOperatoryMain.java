package myProjektTarr2019java6Dar.podstawy.zadania.domowe;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 16.02.2020
 **/
public class ZadanieOperatoryMain {

    public static void main(String[] args) {

        // metody do implementacji
        // zwiększ, zmniejsz, liczba parzysta, liczba ujemna
        double liczba = 6;
        liczba = zwieksz(liczba);
        String napis = "Powiekszona wynosi " + liczba;
        System.out.println(napis);
        liczba = zmniejsz(liczba);
        napis = "Zmniejszona wynosi " + liczba;
        System.out.println(napis);
        System.out.println("czy liczba jest parzysta ? "+czyLiczbaParzysta(liczba));
        System.out.println("czy liczba jest ujemna ? "+czyLiczbaUjemna(liczba));
    }

    public static double zwieksz(double wprowadzonaLiczba) {
//        return wprowadzonaLiczba+1;// zwiększenie o jeden
        return zwieksz(wprowadzonaLiczba, 1);
        // wykorzystujemy metode ponizej
    }

    public static boolean czyLiczbaParzysta(double liczba){
        return liczba%2==0;
    }

    public static double zwieksz(double wprowadzonaLiczba, int zwiekszenie) {
        return wprowadzonaLiczba + zwiekszenie;
    }

    public static double zmniejsz(double wprowadzonaLiczba) {
//        return wprowadzonaLiczba-1;// zwiększenie o jeden
        return zmniejsz(wprowadzonaLiczba, 1);
    }

    public static double zmniejsz(double wprowadzonaLiczba, int zmniejszenie) {
        return wprowadzonaLiczba - zmniejszenie;
    }

    public static boolean czyLiczbaUjemna(double liczba){
        return liczba<0;
    }
}
