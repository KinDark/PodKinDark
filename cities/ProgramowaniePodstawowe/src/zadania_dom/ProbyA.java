package zadania_dom;


import java.io.*;
import java.util.Date;

public class ProbyA {


    public static void main(String args[]) {
        Date data = new Date();
        int[] temperatura = {25, 19, 22};
        String[] opis = {"dzień", "noc", "woda"};
        // Zapis
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("test.ser"));
            out.writeObject(data);
            out.writeObject(opis);
            out.writeObject(temperatura);
            out.close();
        } catch (IOException exc) {
            exc.printStackTrace();
            System.exit(1);
        }

// Odtworzenie (zazwyczaj w innym programie)
        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("test.ser") );
            Date odczytData = (Date) in.readObject();
            String[] odczytOpis = (String[]) in.readObject();
            int[] odczytTemp = (int[]) in.readObject();
            in.close();
            System.out.println(odczytData);//Sun Dec 18 21:19:34 CET 2016
//System.out.println(DateFormat.getInstance().format(odczytData));
//18.12.16 21:20
            for (int i=0; i<odczytOpis.length; i++)
                System.out.println(odczytOpis[i] + " " + odczytTemp[i]);
        } catch(IOException exc) {
            exc.printStackTrace();
            System.exit(1);
        } catch(ClassNotFoundException exc) {
            System.out.println("Nie można odnaleźć klasy obiektu");
            System.exit(1);
        }
    }
}


