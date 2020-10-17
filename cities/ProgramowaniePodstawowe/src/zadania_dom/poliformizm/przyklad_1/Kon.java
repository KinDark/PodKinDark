package zadania_dom.poliformizm.przyklad_1;

public class Kon extends Ssak{


    public Kon(String nazwa) {
        super(nazwa);
    }


    @Override
    public void wydajDzwiek() {

    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem koń i nazwyam się " + nazwa);

    }
}
