package pl.sdacademy.tasks.operation.observer.emergency.observer;

import pl.sdacademy.tasks.operation.observer.emergency.subject.Operator;

/**
 * Klasa zarejestrowanego subskrybenta który otrzymuje dane od operatora
 */
public class ThirdAmbulance implements Ambulance {
    private Operator operator;

    public ThirdAmbulance(Operator operator) {
        this.operator = operator;
        operator.registerObserver(this);
    }

    @Override
    public void update() {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(ThirdAmbulance.class.getSimpleName() + " received a notification and is driving to incident right now!");
        System.out.println("Incident: " + operator.getStatus());
    }
}