package pl.sdacademy.design.patterns.operation.observer.meteo.subject;

import pl.sdacademy.design.patterns.operation.observer.meteo.observer.Observer;

/**
 * Podmiot rozsyłający informacje po zarejestrowaniu obserwatora
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
