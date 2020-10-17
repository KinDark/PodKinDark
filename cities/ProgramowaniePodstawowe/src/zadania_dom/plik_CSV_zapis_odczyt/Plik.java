package zadania_dom.plik_CSV_zapis_odczyt;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Plik {

    public static void main(String[] args) {
        try{
            String path = "plik.txt";
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("cos cos \n");

        }catch (IOException e) {
            System.out.println("Błąd na pliku");
        }finally {
          //  bufferedWriter.close();
        }

        try {
            String someText = " URI www To be or not to be";
            Files.writeString(Paths.get("plik.csv"), someText, StandardOpenOption.CREATE);
            //CStandardOpenOption.CREATE - utwórz nowy plik jesli nie istnieje
        } catch (IOException e) {
            System.out.println("Błąd na pliku1111");
            e.printStackTrace();
        }

        try {
            String someText = "seba\n";
            Files.writeString(Paths.get("plik.sp"), someText, StandardOpenOption.APPEND);
            //CStandardOpenOption.CREATE - utwórz nowy plik jesli nie istnieje
        } catch (IOException e) {
            System.out.println("Błąd na pliku1111");
            e.printStackTrace();
        }
// odczyt z pliku
        try {
            List<String> plik = Files.readAllLines(Paths.get("plik.csv"));
            System.out.println( plik);
            String content = Files.readString(Paths.get("plik.csv"));
            System.out.println("Content:");
            System.out.println(content);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }




}