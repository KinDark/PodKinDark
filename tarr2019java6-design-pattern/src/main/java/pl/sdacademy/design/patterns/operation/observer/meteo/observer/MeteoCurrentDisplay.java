package pl.sdacademy.design.patterns.operation.observer.meteo.observer;


import pl.sdacademy.design.patterns.operation.observer.meteo.subject.Subject;

/**
 * Klasa zarejestrowanego subskrybenta który otrzymuje dane odnośnie aktualnej pogody
 */
public class MeteoCurrentDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;

    public MeteoCurrentDisplay(Subject meteoData) {
        meteoData.registerObserver(this);//rejestrujemy siebie
    }

    @Override
    public void display() {
        System.out.println("\nWarunki biezace " + temperature +
                " stopni C oraz " + humidity + "% wilgotnosc");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}