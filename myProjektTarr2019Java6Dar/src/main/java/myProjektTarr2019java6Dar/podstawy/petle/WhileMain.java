package myProjektTarr2019java6Dar.podstawy.petle;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 01.03.2020
 **/
public class WhileMain {

    public static void main(String[] args) {

        int tablicaLiczb[] = new int[3];
        tablicaLiczb[0] = 20;
        tablicaLiczb[1] = 19;
        tablicaLiczb[2] = 18;

        String tablicaMiast[] = {"Toruń","Poznań","Berlin"};

        /**
         * Zadanie: Wypisz w pętli while elementy tablic
         */
        // rozwiazanie z pętlą for
        for(int i = 0; i<3;i++){
            System.out.println(tablicaLiczb[i]);
        }

        // rozwiązanie z pętlą while
        int i = 0;
        while(i < 3){
            System.out.println(tablicaLiczb[i]);
            i++;
        }

        double temperatura = 0;

        boolean czyWlaczoneOgrzewanie = true;

        while (czyWlaczoneOgrzewanie) {
            while (temperatura < 26) {
                temperatura = grzej(temperatura);
            }
            temperatura = 25;
            System.out.println(temperatura);
            if (temperatura == 25)
            {
                break;
            }
        }
    }

    private static double grzej(double temperatura) {
        System.out.println(" grzanie...");
        System.out.printf("%.2f*C",temperatura);
        return temperatura+=0.001;
    }
}
