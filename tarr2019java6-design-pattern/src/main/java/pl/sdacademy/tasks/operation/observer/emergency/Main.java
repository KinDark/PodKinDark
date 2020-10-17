package pl.sdacademy.tasks.operation.observer.emergency;

import pl.sdacademy.tasks.operation.observer.emergency.observer.FirstAmbulance;
import pl.sdacademy.tasks.operation.observer.emergency.observer.SecondAmbulance;
import pl.sdacademy.tasks.operation.observer.emergency.observer.ThirdAmbulance;
import pl.sdacademy.tasks.operation.observer.emergency.subject.OperatorAdam;

/**
 * Zadanie:
 * * operator jest podmiotem, ma swoich subskrybentów Ambulance
 * Ambulance jest obserwatorem i czeka na zgłoszenia od operatora
 * * po zgloszeniu statusu przez operatora każdy zarejestrowany ambulans otrzymuje wiadomość
 *   i na nią odpowiada
 */
public class Main {

    public static void main(String[] args) {
/*
        OperatorAdam operatorAdam = new OperatorAdam();
        FirstAmbulance firstAmbulance = new FirstAmbulance(operatorAdam);
        SecondAmbulance secondAmbulance = new SecondAmbulance(operatorAdam);
        ThirdAmbulance thirdAmbulance = new ThirdAmbulance(operatorAdam);

        System.out.println("---------------------------------------------");
        operatorAdam.setStatus("Car accident");
        System.out.println("---------------------------------------------");
        operatorAdam.setStatus("Faint");
        System.out.println("---------------------------------------------");
        operatorAdam.setStatus("Broken bone");
        System.out.println("---------------------------------------------");
*/
    }
}
