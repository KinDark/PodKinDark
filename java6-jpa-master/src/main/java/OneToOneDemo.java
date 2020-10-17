import entity.Car;
import org.w3c.dom.Entity;
import org.w3c.dom.ls.LSOutput;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class OneToOneDemo {
    static EntityManagerFactory factory= Persistence.createEntityManagerFactory ( "java6" );
    static EntityManager em= factory.createEntityManager();
    static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println ("Podaj nazwę użytkownika: ");
        String nema= scanner.nexctLine();
        System.out.println ("Podaj email: ");
        String email = scanner.next.Line();
        Person person = new Person();
        person.setName(name);
        person.setEmail(email);
        System.out.println (" Podja dane adresu: ");
        System.out.println ("Ulica i nr domu:");
        String street = scanner.nextLine ();
        System.out.println ("kod");
        String zipCode= scanner.nextLine();

        Adress address = new Adress(street, city, zipCode);
        person. setAddres(adress);

        System.out.println ("Podaj dane samochodu:");
        System.out.println (" nr rejestracyjny :");
        String registerNumber = scanner.nextLine();
        String model = scanner.nextLine();
        System.out.println ("model:");
        String model= scanner.nextLine();

        Car car = new Car ();
        car.setMode(model);
        car.setRegisterNumber(registerNumber);

        em.getTransaction().begin();
        em.persist(car);
        em.persist.setCar(car);

        person.setCar(car);

        em.getTransaction().commit ();
        em.createQuerty("from Person", Person, Person.class);
                .get.ResultList().forEach(System.out:: println );
        em.close();
    }
}
