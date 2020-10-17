package zadania_dom;

public class ProbyRobioneWDomu {
    public static void main(String[] args) {
        int c = 10, a, b;

        for (a = 1; a <= c; a++) {
            for (b = 1; b <= c; b++) {
                System.out.print(a * b + "\t");
            }
            System.out.println();
        }
        System.out.println("*****************************************************************************************");
        a = b = 1;
        do {
            do {
                System.out.print(a * b + "\t");
                b++;
            } while (b <= c);
            System.out.println();
            a++;
            b = 1;
        } while (a <= c);
        System.out.println("*****************************************************************************************");
        int n = 10, i;
        int tablica[] = new int[n];
        for (i = 0; i < tablica.length; i++) {
            tablica[i] = n - 1 - i;
            System.out.println("tablica [ " + i + " ] = " + tablica[i]);
        }
        System.out.println("*****************************************************************************************");
        n = 10;
        int suma = 0;
        int macierzy[][] = new int[n][n];
        //wypisanie poprzekatnej liczby 1
        for (a = 0; a < macierzy.length; a++) {
            for (b = 0; b < macierzy.length; b++) {
                if (n == a + b + 1) {
                    macierzy[a][b] = a;
                } else {
                    macierzy[a][b] = 0;
                }

            }
        }
        //wyswietlenietablicy
        for (a = 0; a < macierzy.length; a++) {
            for (b = 0; b < macierzy.length; b++) {
                suma = suma + macierzy[a][b];
                System.out.print(macierzy[a][b] + "\t");
            }
            System.out.println();

        }
        System.out.println("suma liczb: " + suma);

    }


}
