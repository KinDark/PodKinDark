package pl.sdacademy.design.patterns.construct.builder.reservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Wzorzec budowniczy oddziela tworzenie od reprezentacji.
 * Tworzącym jest ReservationParser
 * zaś reprezentacją Reservation
 * <p>
 * Zadanie:
 * * Utwórz własny parser UserParser tworzący użytkownika z danych :
 * "Jan Kowalski, 01-06-1965, ul. Cwiartki 3/4, 01-001, +48 605 505 404"
 */
public class Main {

    public static void main(String[] args) {

        String toParse = "2020-02-02, 123, Poznan, 128";
        Reservation myReservation = ReservationParser.parse(toParse);
        System.out.println(myReservation);

        String rowData = "Jan Kowalski, 01-06-1965, ul. Cwiartki 3/4, 01-001, +48 605 505 404";
        User user = UserParser.parse(rowData);
        System.out.println(user);

        {
            //Reservation.ReservationBuilder builder = Reservation.builder();
            Reservation.ReservationBuilder builder = new Reservation.ReservationBuilder();


            // przypomnienie z lambda
            List<Reservation> listaRezerwacji = new ArrayList<>();

            Reservation reservation = builder.
                    city("Bydgoszcz").
                    headcount(2020).
                    price(199.99f).
                    build();

            Reservation reservation2 = builder.
                    price(199.99f).
                    city("Toruń").
                    headcount(2020).
                    build();

            Reservation reservation3 = builder.
                    price(150.33f).
                    build();

            listaRezerwacji.addAll(Arrays.asList(reservation,reservation2,reservation3));

            // lambda stream filter Toruńskie rezerwacje
            Predicate<Reservation> filtrujTorun = r -> r.getCity().equalsIgnoreCase("Toruń");

            List<Reservation> rezerwacjeTorunskie = listaRezerwacji.
                    stream().
                    filter(filtrujTorun).
                    collect(Collectors.toList());

            // stream forEach wypisz z lambda rezerwacje z listy
            System.out.println("=====================================");
            System.out.println("Lista rezerwacji Toruńskich:");
            //rezerwacjeTorunskie.stream().forEach(r -> System.out.println(r));
            rezerwacjeTorunskie.stream().forEach(System.out::print);// to samo co powyżej z użyciem ::

            // poniżej wypisanie z użyciem : bez lambda
            for(Reservation reservationZListy : rezerwacjeTorunskie){
                System.out.println(reservationZListy);
            }

            System.out.println("=====================================");


            System.out.println("reservation3 | "+reservation3);
        }
        {
            StringBuilder builder = new StringBuilder();
            String description = builder.
                    append("s").
                    append("d").
                    append("a").
                    append(2020).
                    append(199.99f).
                    toString();
            System.out.println(description);

        }

    }
}
