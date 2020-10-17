package zadania_dom.poliformizm.przyklad_1;

public class Pies extends Ssak{


    public Pies(String nazwa) {
        super(nazwa);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("houł houł");

    }

    @Override
    public void przedstawSie() {
        System.out.println(" Jestem pies i nazywam się  "+ nazwa);

    }
}
