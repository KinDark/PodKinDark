package pl.sdacademy.design.patterns.operation.observer.meteo.subject;

import pl.sdacademy.design.patterns.operation.observer.meteo.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * MeteoData jest podmiotem czyli to ona implementuje działanie rozsyłania informacji
 */
public class MeteoData implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public MeteoData() {
    }

    public void readChange() {
        notifyObservers();//informacja do wszystkich obserwatorów pogody gdy otrzymają informację
        // wyświetlą zaktualizowane informacje
    }

    //testowe ustawianie odczytow (domyslnie chcielibysmy je pobierac ze stacji meteo)
    public void setRead(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        readChange();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(temperature, humidity, pressure);
        }
    }
}
