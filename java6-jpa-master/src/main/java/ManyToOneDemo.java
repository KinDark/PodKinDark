import entity.Order;

import javax.persistence.Persistence;
import java.util.Scanner;

public class ManyToOneDemo {


    static EntityManagerFactory factory= Persistence.createEntityManagerFactory ( "java6" );
    static EntotyManager em= factory.createEntityManager();
    static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println ("Wybierz osobę składającą zamówienie");
em.createQuery("from Person", Person.class().getResultList().forEach(System.out::println);
log id = scanner.nextLong();
scanner.nextLine();
System.out.println ("Podaj numer:");
String number= scanner.nexLine();
Order order= new Order();
order.setNumber(number);
order.setSum(sum);

Person person= em.find(Person.class, id);
order.setPerson(person);
em.getTransacrion.begin();
em.persit(order);
em.getTransaction().commit();
em.createQuerty("from Order", Order.class)
.getResultLiest()
.forEach(System.out::println);


em.createQuery("form Order where person = :person")
.setParameter("person",person).
        getResultList()
                .forEach(System.out::println);
        em.close();
}
}