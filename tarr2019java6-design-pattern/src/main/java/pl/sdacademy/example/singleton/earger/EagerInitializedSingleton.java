package pl.sdacademy.example.singleton.earger;

/**
 * Plusy
 * * prosty do implementacji
 *
 * Minusy
 * * brak możliwości obsługi wyjątków
 * * obiekt jest tworzony zawsze podczas ładowania się klas do pamięci
 * * instancja może nie być wykorzystywana co powoduje marnowanie się zasobów
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
