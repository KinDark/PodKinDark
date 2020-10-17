package pl.sdacademy.tasks.operation.observer.emergency.subject;

import pl.sdacademy.tasks.operation.observer.emergency.observer.Ambulance;

/**
 * Podmiot rozsyłający informacje po zarejestrowaniu obserwatora
 */
public interface Operator {
    void registerObserver(Ambulance ambulance);
    void removeObserver(Ambulance ambulance);
    void notifyObservers();
    String getStatus();
}
