public class Tablicejednowy {
    public static void main(String[] args) {

        int a1 = 1;
        int a2 = 2;
        int a3 = 3;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        Integer[] tablica = new Integer[10];

        tablica[0] = 1;
        tablica[1] = 2;
        tablica[2] = 3;

        System.out.println("liczby z pętli");

        for(int i=0; i< 10; i++) {
            Integer number = tablica[i];
            System.out.println(number);

        }


    }
}
