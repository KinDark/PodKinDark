package struktury_danych;

public class Tab_Privata_protected {

        private int liczba;
        private static int liczbaStatyczna;

        private int liczbaPrywatna;
        protected int liczbaProtected;
        public int liczbaPublic;
        int liczbaDomyslnyCzyliPackage;


        public void liczbyOdKoncaNaParzystychIndeksach(int[] tab) {
            // Wypisz wszystkie liczby od końca będące na parzystych indeksach
            for(int i = tab.length - 1; i >= 0; i--) {
                if(i % 2 == 0) {
                    System.out.print(tab[i] + " ");
                }
            }
            System.out.println();
        }

        public void sumaLiczbPodzielnychPrzezTrzy(int[] tab) {
            // Wypisz sumę tylko tych liczb w tablicy podzielnych przez 3
            int suma = 0;
            for(int i = 0; i < tab.length; i++) { // i <= tab.length - 1
                if(tab[i] % 3 == 0) {
                    suma += tab[i]; // inaczej: suma = suma + tab[i];
                }
            }
            System.out.println("Wynik sumy: " + suma);
        }


        public static void main(String[] args) {
            Tab_Privata_protected tablice = new Tab_Privata_protected();
            int[] tab = {5, 3, 8, 100, -5, 1, 7};

            tablice.liczbyOdKoncaNaParzystychIndeksach(tab);
            tablice.sumaLiczbPodzielnychPrzezTrzy(tab);

            tablice.informacyjnieStatic();

        }




        public void informacyjnieStatic() {
            // static jest powiązany bardziej z klasą niż obiektem
            // static jest tworzony raz, więc jest wspólny dla wszystkich obiektów

            Tab_Privata_protected tab1 = new Tab_Privata_protected();
            Tab_Privata_protected tab2 = new Tab_Privata_protected();
            Tab_Privata_protected tab3 = new Tab_Privata_protected();

            tab1.liczba = 100;
            tab1.liczbaStatyczna = -99;

            tab2.liczba = 200;
            tab2.liczbaStatyczna = -888;

            tab3.liczba = 300;
            tab3.liczbaStatyczna = -7777;

           // tab1.liczba = 123456;
          //  tab1.liczbaStatyczna = 654321;


            System.out.println("tab1 liczba: " + tab1.liczba);  // 100
            System.out.println("tab1 liczbaStatyczna: " + Tab_Privata_protected.liczbaStatyczna); // -99

            System.out.println("tab2 liczba: " + tab2.liczba); // 200
            System.out.println("tab2 liczbaStatyczna: " + Tab_Privata_protected.liczbaStatyczna); // -888

            System.out.println("tab3 liczba: " + tab3.liczba); // 300
            System.out.println("tab3 liczbaStatyczna: " + Tab_Privata_protected.liczbaStatyczna); // -7777

            System.out.println("Tablice.liczbaStatyczna: " + Tab_Privata_protected.liczbaStatyczna); // -7777
        }

    }





