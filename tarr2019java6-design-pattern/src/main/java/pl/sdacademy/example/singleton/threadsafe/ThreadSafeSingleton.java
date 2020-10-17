package pl.sdacademy.example.singleton.threadsafe;

/**
 * Plusy
 * * stworzenie instancji klasy jest odłożone w czasie, aż do momentu pierwszego wywołania metody
 * * możliwość obsługi wyjątków
 * * metoda jest synchronized, oznacza to, że może ona być wykonywana tylko przez jeden wątek w danym czasie
 *
 * Minusy
 * * metoda synchronized spowalnia wydajność aplikacja, gdyż wiele wątków nie może mieć jednoczesnego dostępu do metody
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null)
            instance = new ThreadSafeSingleton();
        return instance;
    }
}
