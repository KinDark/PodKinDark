package myProjektTarr2019java6Dar.podstawy.varargs;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 01.03.2020
 **/
public class VarargsMain {

    //psvm
    public static void main(String[] args) {
        // varargs - zmienna liczba argumentów
        {
            int a = 5, b = 3;
            int wynik = suma(a, b);
        }
        {
            int a = 5, b = 3,c = 7;
            int wynik = suma(a, b,c);
        }
        {
            int a = 5, b = 3,c = 7,d = 2;
            int wynik = suma(a, b,c, d );
        }
        {
            int wynik = suma(12,4,456,45,23,6,3,4,234,7,65,34,34,34,53);
            System.out.println("wynik="+wynik);// = 135
        }
        {
            int wynik = suma(44,45,46);
            System.out.println("wynik="+wynik);// = 135
        }
        {
            int wynik = suma();
            System.out.println("wynik="+wynik);// 0
        }
    }

    // tablica int[]
    // varargs int...
    static int suma(int... liczby){// tablica liczby
        // implementacja
        // sposób działania
        int suma = 0;
        for (int liczba : liczby){
            suma+=liczba;// zwiększamy sume o liczbe
        }
        return suma;// wynik metody
    }

    /**
     * nie potrzebujemy poniższych metod bo jest varargs
     * dynamiczna ilosc argumentów
     */
//    private static int suma(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    private static int suma(int a, int b) {
//        return a + b;
//    }
}
