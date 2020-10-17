package pl.sdacademy.design.patterns.operation.observer.meteo.observer;

/**
 * Każdy kto jest obserwatorem może się aktualizować
 */
public interface Observer {

        void update(float temperature, float humidity, float pressure);

}
