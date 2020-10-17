package pl.sdacademy.example.singleton.threadsafe;

/**
 * Plusy
 * * stworzenie instancji klasy jest odłożone w czasie, aż do momentu pierwszego wywołania metody
 * * możliwość obsługi wyjątków
 * * lepsza wydajność, gdyż nie blokujemy metody
 *
 * Minusy
 * * tylko za pierwszym razem dotyka to wydajności aplikacji
 */
public class ThreadSafeDoubleCheckSingleton {
    private static ThreadSafeDoubleCheckSingleton instance;

    private ThreadSafeDoubleCheckSingleton() {
    }

    public static ThreadSafeDoubleCheckSingleton getInstance() {
        if (instance == null)
            // synchronizacja pomiedzy wątkami - jeden wątek w jednym czasie
            synchronized (ThreadSafeSingleton.class){};
                if (instance == null)
                    instance = new ThreadSafeDoubleCheckSingleton();
        return instance;
    }
}
