package pl.sdacademy.design.patterns.construct.builder.reservation;

import java.time.LocalDate;

public class Reservation {
    private LocalDate date;
    private int headcount;
    private String city;
    private double price;

    @Override
    public String toString() {
        return "Reservation{" +
                "date=" + date +
                ", headcount=" + headcount +
                ", city='" + city + '\'' +
                ", price=" + price +
                '}';
    }

    private Reservation() {
    }

    public LocalDate getDate() {
        return date;
    }

    public int getHeadcount() {
        return headcount;
    }

    public String getCity() {
        return city;
    }

    public double getPrice() {
        return price;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setHeadcount(int headcount) {
        this.headcount = headcount;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public static ReservationBuilder builder() {
        return new ReservationBuilder();
    }




    public static class ReservationBuilder {
        private LocalDate date;
        private int headcount;
        private String city;
        private double price;

        public ReservationBuilder self(){
            return this;
        }

        /**
         * Metody buildera muszą zwracać ReservationBuilder
         * @param date wartosc daty
         * @return builder
         */
        public ReservationBuilder date(LocalDate date) {
            this.date = date;
            return self();
        }

        /**
         *
         * @param count
         * @return builder
         */
        public ReservationBuilder headcount(int count) {
            this.headcount = count;
            return this;
        }

        public ReservationBuilder city(String cityName) {
            this.city = cityName;
            return this;
        }

        public ReservationBuilder price(double price) {
            this.price = price;
            return this;
        }

        /**
         * Budowanie rezerwacji
         * @return rezerwacja
         */
        public Reservation build() {
            Reservation reservation = new Reservation();
            reservation.setHeadcount(this.headcount);
            if(this.city==null){
                reservation.setCity("Toruń");
            }else{
                reservation.setCity(this.city);
            }
            reservation.setDate(this.date);
            reservation.setPrice(this.price);
            return reservation;
        }

        /**
         * Podobnie jak build()
         * @return rezerwacja
         */
        public Reservation toReservation() {
            Reservation reservation = new Reservation();
            reservation.setHeadcount(this.headcount);
            reservation.setCity(this.city);
            reservation.setDate(this.date);
            reservation.setPrice(this.price);
            return reservation;
        }
    }
}
