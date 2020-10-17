import java.util.Scanner;

public class Scaner2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        double payment = scan.nextDouble();
        System.out.println("Cześć "+ name);
        System.out.println("Twój wiek to "+ age);
        System.out.println("Twoja wypłata to "+ payment);
    }
}
