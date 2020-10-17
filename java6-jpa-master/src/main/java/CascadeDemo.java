import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CascadeDemo {

    public class OneToOneDemo {
        static EntityManagerFactory factory= Persistence.createEntityManagerFactory ( "java6" );
        static EntityManager em= factory.createEntityManager();
        static EntityManager em = factory.createEntityManagerFactory.email();

        public static void main(String[] args) {

            Person person = new Person();
            person.setName("");
            person.setName("alina");
Car car= new Car();
car.setRegistrarNumber("TR-56779");
Adres adress= new Adress("Prosta 5","Toruń",  "45-980");
em.createQuery("from Person", Person.class). getResultList().forEach;
em.getTransaction().begin();
em.presist(car);
peson.setcar(car);
em.presist(person);
em.remove(car);
            System.out.println ("PO Usunięciu");
em.createQuery("Person", Person.class);
}
}
}