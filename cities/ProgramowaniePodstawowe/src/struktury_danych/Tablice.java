package struktury_danych;

public class Tablice {

    //  public int[] LiczbyOdKoncaNaParzystychIndeksach(int[] tab){return 0;}
    public void LiczbyOdKoncaNaParzystychIndeksach(int[] tab) {
        System.out.println(tab.length - 1 + " tab.length -1" + " i " + "tab.length bez -1 " + tab.length);
        for (int i = tab.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(tab[i] + " , ");
            }
        }
        System.out.println();
    }

    public void LiczbyPodzienePrzezTrzy(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 3 == 0 && tab[i] > 0) {
                suma += tab[i];
                System.out.print(tab[i] + " , ");
            }
        }
        System.out.println(" = " + suma);
        System.out.println();

    }

    private void LiczbySumaLiczb(int[] tab) {
        int suma = 0, q=0;
        for (int i = 0; i < 5; i++) {
            suma += tab[i];
        }
        q=tab.length-1;
        suma-=tab[q];
        System.out.println(suma);
    }

    public static void main(String[] args) {

        Tablice tablice = new Tablice();
        int[] tab = {5, 3, 8, 100, -5, 1, 7, 2, 6, 12, 0};
        tablice.LiczbyOdKoncaNaParzystychIndeksach(tab);
        tablice.LiczbyPodzienePrzezTrzy(tab);
        tablice.LiczbySumaLiczb(tab);

    }


}
