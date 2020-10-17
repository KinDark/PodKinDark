package zadania_dom.poliformizm.przyklad_1;

public class Osoba {
    private Zwierze zwierze;

    public void przygarnijZwierze(Zwierze zwierze) {
        this.zwierze = zwierze;
    }

    public void jakNazywaSieTwojeZwierzatko() {
        if (zwierze != null) {
            zwierze.przedstawSie();
        } else {
            System.out.println("Nie mam zwierzątka");
        }
    }

}
