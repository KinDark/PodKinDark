package pl.sdacademy.tasks.operation.observer.emergency.observer;

import pl.sdacademy.tasks.operation.observer.emergency.subject.Operator;

/**
 * Klasa zarejestrowanego subskrybenta który otrzymuje dane od operatora
 */
public class SecondAmbulance implements Ambulance {
    private Operator operator;

    public SecondAmbulance(Operator operator) {
        this.operator = operator;
        operator.registerObserver(this);
    }
    @Override
    public void update() {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(SecondAmbulance.class.getSimpleName() + " received a notification and is driving to incident right now!");
        System.out.println("Incident: " + operator.getStatus());
    }
}