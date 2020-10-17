package pl.sdacademy.design.patterns.construct.builder.reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 18.07.2020
 **/
public class User {
    @Override
    public String toString() {
        return "User{" +
                "nameAndSurname='" + nameAndSurname + '\'' +
                ", birthDate=" + birthDate +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }

    String nameAndSurname;
    LocalDate birthDate;
    String street;
    String postalCode;
    String mobileNumber;

    public static User.UserBuilder builder() {
        return new User.UserBuilder();
    }

    public static class UserBuilder {
        String nameAndSurname;
        LocalDate birthDate;
        String street;
        String postalCode;
        String mobileNumber;

        public UserBuilder nameAndSurname(String nameAndSurname) {
            this.nameAndSurname = nameAndSurname;
            return self();
        }

        public UserBuilder birthDate(String birthDate) {
            this.birthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            return self();
        }

        public UserBuilder street(String street) {
            this.street = street;
            return self();
        }

        public UserBuilder mobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return self();
        }

        public UserBuilder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return self();
        }

        private UserBuilder self() {
            return this;
        }

        public User build() {
            User result = new User();
            result.nameAndSurname = nameAndSurname;
            result.birthDate = birthDate;
            result.street = street;
            result.postalCode = postalCode;
            result.mobileNumber = mobileNumber;
            return result;
        }
    }
}
