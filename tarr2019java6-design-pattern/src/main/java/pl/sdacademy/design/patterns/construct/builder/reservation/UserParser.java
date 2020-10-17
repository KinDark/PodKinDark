package pl.sdacademy.design.patterns.construct.builder.reservation;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 18.07.2020
 **/
public class UserParser {
    public static User parse(String userString) {

        String[] column = userString.split(", ");

        User result = User.builder().
                nameAndSurname(column[0]).
                birthDate(column[1]).
                street(column[2]).
                postalCode(column[3]).
                mobileNumber(column[4]).
                build();

        return result;
    }
}
