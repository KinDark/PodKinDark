package myProjektTarr2019java6Dar.podstawy.konwersje;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 29.02.2020
 **/
public class KonwersjeMain {

    // psvm
    public static void main(String[] args) {
        {
            int a = 5;
            double b = 13.5;
            // konwersja nie jawna
            // liczba a zamieniona na double a
            double c = b/a;// 5 -> 5.0
            System.out.println("c="+c);
        }
        {
            int a = 5;
            double b = 13.5;
            // konwersja jawna na (int)
            // b/a => 2.7
            // wynik dzielenia został skowertowany
            // na int
            // następnie wynik int
            // przypisany do double
            double c = (int)b/a;// 2.7 -> 2
            // następnie (int)2 -> (double)2.0
            System.out.println("c="+c);
        }
        {
            // konwersja jawna
            // podobnie jak w pierwszym przykładzie
            // tym razem w jawny sposób
            int a = 5;
            double b = 13.5;
            double c = b/(double)a;// 5 -> 5.0
            System.out.println("c="+c);
        }
    }

}
