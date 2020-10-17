package pl.sdacademy.tasks.operation.observer.emergency.subject;

import pl.sdacademy.tasks.operation.observer.emergency.observer.Ambulance;

import java.util.ArrayList;
import java.util.List;

/**
 * OperatorAdam jest podmiotem czyli to on implementuje działanie rozsyłania informacji
 */
public class OperatorAdam implements Operator {
    private List<Ambulance> ambulances = new ArrayList<>();
    private String status;

    @Override
    public void registerObserver(Ambulance ambulance) {
        ambulances.add(ambulance);
    }

    @Override
    public void removeObserver(Ambulance ambulance) {
        ambulances.remove(ambulance);
    }

    @Override
    public void notifyObservers() {
        for (Ambulance ambulance : ambulances) {
            ambulance.update();
        }
    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}