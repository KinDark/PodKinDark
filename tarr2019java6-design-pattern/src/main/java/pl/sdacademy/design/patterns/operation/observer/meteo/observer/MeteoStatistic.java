package pl.sdacademy.design.patterns.operation.observer.meteo.observer;


import pl.sdacademy.design.patterns.operation.observer.meteo.subject.Subject;

import java.util.ArrayList;
import java.util.List;


/**
 * Klasa zarejestrowanego subskrybenta który otrzymuje dane odnośnie aktualnej pogody
 */
public class MeteoStatistic implements DisplayElement, Observer {
    private List<Float> temperatures = new ArrayList<>();
    private List<Float> humidities = new ArrayList<>();
    private List<Float> pressures = new ArrayList<>();

    public MeteoStatistic(Subject meteoData) {
        meteoData.registerObserver(this);//rejestrujemy siebie!
    }

    @Override
    public void display() {
        System.out.printf("\n > Srednie wartości z " + temperatures.size() + " ostatnich dni"
                + " temperatura " + avgTemperature()
                + " cisnienie " + avgPressure()
                + " wilgotnosc " + avgHumidity() + "\n");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperatures.add(temperature);
        this.humidities.add(humidity);
        this.pressures.add(pressure);
        display();
    }


    private float avgTemperature() {
        float avgSum = 0;
        for (float temperature : temperatures) {
            avgSum += temperature;
        }
        return avgSum / temperatures.size();
    }

    private float avgHumidity() {
        float avgSum = 0;
        for (float humidity : humidities) {
            avgSum += humidity;
        }
        return avgSum / humidities.size();
    }

    private float avgPressure() {
        float avgSum = 0;
        for (float cisn : pressures) {
            avgSum += cisn;
        }
        return avgSum / pressures.size();
    }


}
