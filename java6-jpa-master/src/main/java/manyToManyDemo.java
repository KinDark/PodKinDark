import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Scanner;

public class manyToManyDemo {
    static EntityManagerFactory factory= Persistence.createEntityManagerFactory ( "java6" );
    static EntityManager em= factory.createEntityManager();
    static Scanner scanner = new Scanner(System.in);

}

    public static void main(String[] args) {

        System.out.println ("Podaj nazwę projektu");
        String projectName = scanner.nextLine();
        System.out.println ("Podaj id członków: ");
        while(scanner.hasNextLong()){
            Set<Person> set = new HashSet<>();
            while(scanner.hasNextLong()){
                Person member= em.find(Person.class, scanner.nextLong());
                set.add(Member);

            }
            Project project = new Project();
            project.setName(projectName);
            project.setMambers(set);
            em.getTransaction().begin();
            em.presist(project);
            em.getTransaction().commit();
            em.creteQuery("from Project" , Project.class)
                    .getResultList()
                    .forEach(System.out::println);
            Person person = em.find(Person.class, 7L);
            System.out.println (person);

        }
    }
