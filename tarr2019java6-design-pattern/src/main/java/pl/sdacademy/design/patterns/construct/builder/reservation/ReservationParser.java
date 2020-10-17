package pl.sdacademy.design.patterns.construct.builder.reservation;

import java.time.LocalDate;

public class ReservationParser {
    public static Reservation parse(String line) {
        String[] column = line.split(", ");

        // tworzenie w osobnych liniach osobno budowanie w lini 17
        Reservation.ReservationBuilder builder = Reservation.builder();
        builder.date(LocalDate.parse(column[0]));
        builder.headcount(Integer.parseInt(column[1]));
        builder.city(column[2]);
        builder.price(Double.parseDouble(column[3]));

        return builder.build();
    }

    public static Reservation parsev2(String line) {
        String[] column = line.split(", ");

        // w jednej linii użycie buildera i budowanie
        Reservation reservation = Reservation.builder()
            .date(LocalDate.parse(column[0]))
            .headcount(Integer.parseInt(column[1]))
            .city(column[2])
            .price(Double.parseDouble(column[3]))
            .build();

        return reservation;
    }
}
