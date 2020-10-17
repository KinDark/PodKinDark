package pl.sdacademy.example.singleton.lazy;

/**
 * Plusy
 * * stworzenie instancji klasy jest odłożone w czasie, aż do momentu pierwszego wywołania metody
 * * możliwość obsługi wyjątków
 *
 * Minusy
 * * w przypadku wielowątkowych systemów utworzona zostanie instancja dla każdego wątku,
 *   co kompletnie burzy nam koncepcję singletona
 */
public class LazyInitSingleton {
    private static LazyInitSingleton instance;

    private LazyInitSingleton() {
    }

    public static LazyInitSingleton getInstance() {
        if (instance == null)
            instance = new LazyInitSingleton();
        return instance;
    }
}
