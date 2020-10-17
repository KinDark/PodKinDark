package pl.sdacademy.example.singleton.staticblock;

/**
 * Plusy
 * * prosty do implementacji
 * * statyczny block daje możliwość obsługi wyjątków
 *
 * Minusy
 * * obiekt jest tworzony zawsze podczas ładowania się klas do pamięci
 * * instancja może nie być wykorzystywana co powoduje marnowanie się zasobów
 *
 * Blok Statyczny static { ... } - jest wywoływany zawsze podczas tworzenia się klasy
 */
public class StaticBlockInitSingleton {
    private static StaticBlockInitSingleton instance;

    private StaticBlockInitSingleton() {
    }

    // static{} - zawsze wykonuje się kod poniżej podczas tworzenia klasy
    static {
        try {
            instance = new StaticBlockInitSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Creating singleton instance failed");
        }
    }

    public static StaticBlockInitSingleton getInstance() {
        return instance;
    }
}
