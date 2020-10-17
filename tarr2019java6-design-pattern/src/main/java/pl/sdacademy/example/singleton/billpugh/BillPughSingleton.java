package pl.sdacademy.example.singleton.billpugh;

/**
 * W momencie ładowania się klasy BillPughSingleton wewnętrzna klasa
 * private static class SingletonHelper jest pomijana.
 * Skutkuje to tym, że obiekt  nie jest tworzony.
 * Jest to podobne do Lazy Initialization,
 * a do tego nie potrzebuje synchronized przez co jest thread-safe i nie blokuje wątku.
 *
 * Plusy
 * * proste w implementacji
 * * nie blokuje wątków
 *
 * POLECANE
 */
public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class SingletonHelper {

        // poniższy kod wykonywany jest tylko raz
        // mamy jedną instancję tego obiektu
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
