import org.w3c.dom.ls.LSOutput;

import javax.persistence.Persistence;

public class OneToManyDemo {

    static EntityManagerFactory factory= Persistence.createEntityManagerFactory ( "java6" );
    static EntotyManager em= factory.createEntityManager();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println ("Podaj id użytkownika: ");
        long id = scanner.nextLong(0);
        Person person = em.find(Person.class, id);
        System.out.println (("zamówienia użytkownika "+ person.getName());
        for (Order :person.getOrders(){
                System.out.println ();
        }
        System.out.println (person);
    }


}

}