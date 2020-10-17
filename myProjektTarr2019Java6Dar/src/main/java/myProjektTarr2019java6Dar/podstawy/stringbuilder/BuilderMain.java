package myProjektTarr2019java6Dar.podstawy.stringbuilder;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 16.02.2020
 **/
public class BuilderMain {

    public static void main(String[] args) {
        String napisCudzyslow = "";
        String napisZKonstruktora = new String("");
        String napisNull = null;
        String napisBezInicjalizacji;
        String napis = "Liczba %d \n";// \n - znak nowej lini
        System.out.print(napis);// ln nie ma dopisane
        // ln-line czyli dodanie znaku następnego wiersza
        System.out.printf(napis,12);
        // f-format formatowanie tekstu
        // %d oznacza liczbę dziesiętną digital
        System.out.println("Napis");
        System.out.println(napisZKonstruktora);
        System.out.println(napisNull);
        // null != "null"
        // System.out.println(napisBezInicjalizacji);

        String napisZKwota = "Kwota %.2f zł";
        // .2 oznacza 2 cyfry po przecinku
        System.out.printf(napisZKwota,12.989898f);

        System.out.println("\n\n===================");

        StringBuilder builder = new StringBuilder();

        builder.append("Kwota").append(" ").append(50).append("zł");

        System.out.println(builder.toString());
        System.out.println(builder);

    }
}
