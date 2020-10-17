package myProjektTarr2019java6Dar.podstawy.operatory;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 16.02.2020
 **/
public class OperatoryMain {

    public static void main(String[] args) {
        {
        /*
        Przypisania  =, +=, -=, *=, /=
         */
            int a = 5;
            a += 5; // zwiększenie o
            System.out.println(a); // 10

            a -= 2; // zmniejszenie o
            System.out.println(a); // 8

            a *= 8; // przemnożenie o
            System.out.println(a); // 64

            a /= 16;// dzielone przez
            System.out.println(a); // 4

            System.out.println("==========================");
        }
        {
            /**
             * Arytmetyczne  +,-,*,/,%,++,--
             */
            int a = 5;
            int b = 3;

            int c = a + b;
            System.out.println(c); // 8

            c = a-b;
            System.out.println(c); // 2
            c = a*b;
            System.out.println(c); // 15
            c = a/a;
            System.out.println(c); // 1
            c = a%b; // reszta z dzielenia (modulo)
            System.out.println(c); // 2
            c++; // zwiekszenie o 1
            System.out.println(c); // 3
            c--; // zmniejszenie o 1
            System.out.println(c); // 2
        }
        {
            /**
             * Logiczne  &&, ||, !
             */
            boolean jestCieplo = true;
            boolean padaDeszcz = true;
            boolean mamParasol = false;

            boolean czyJestZimno = !jestCieplo;
            // ! negacja , zaprzeczenie
            System.out.println(czyJestZimno);
            boolean czyIdeNaSpacer = !jestCieplo && padaDeszcz;
            // false and true => false
            // && logiczne-i
            System.out.println(czyIdeNaSpacer);

            boolean jestKawa = true;
            boolean jestCiasto = false;
            boolean ideNaObiad = jestKawa || jestCiasto;
            // || logiczne lub
            System.out.println(ideNaObiad);
        }
        {
            /**
             * Relacji  <,<=,>,>=,==, !=
             */
            int wiek = 33;
            int wiekPelnoletnosci = 18;
            int ograniczeniePrednosci = 50;

            boolean czyPelnoletni = wiek > wiekPelnoletnosci;
            czyPelnoletni = wiek >= wiekPelnoletnosci;

            int predkosc = 120;
            boolean czyDostaneMandat = ograniczeniePrednosci <= predkosc;

            int wiekOli = 23;
            int wiekJanusza = 24;
            // == porównanie
            // = przypisanie
            boolean czyMajaTenSamWiek = (wiekOli == wiekJanusza);
            // != różny, nie równy
            boolean oniMajaRoznyWiek = (wiekOli != wiekJanusza);
        }
    }
}
