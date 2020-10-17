package pl.sdacademy.tasks.construct.builder.bank;


import pl.sdacademy.tasks.construct.builder.bank.builder.Builder;

/**
 * Poniżej mamy dwa sposoby utworzenia BankAccount
 * 1) za pomocą konstruktora
 * 2) za pomocą buildera
 *
 * Zadanie wykonaj implementację buildera
 */
public class Main {

    public static void main(String[] args) {
/*
        {
            BankAccount account = new BankAccount(456L, "Jarek Solosz", "I Oddział Banku SDA w Toruniu", 100.00, 2.5);


            // jeśli nie było by podpowiedzi zrobilibyśmy błąd - po za tym kompilator nie będzie zgłaszał błędu
            BankAccount anotherAccount = new BankAccount(789L, "Donald Tram", null, 2.5, 100.00);

            System.out.println(account);
            System.out.println(anotherAccount);
        }
        {
            // co jeśli mamy wiele argumentów zmieniających możliwości klasy - odp Builder
            // gdy dodamy nowe argumenty musimy poprawić istniejący kod ! w przypadk buildera nie musimy

            BankAccount account = Builder.accountNumber(456L)
                    .withOwner("Marge")
                    .atBranch("I Oddział Banku SDA w Toruniu")
                    .openingBalance(100)
                    .atRate(2.5)
                    .build();

            BankAccount anotherAccount = Builder.accountNumber(455L)
                    .withOwner("Homer")
//                    .atBranch("IV Oddział Banku SDA w Poznaniu")
                    .openingBalance(100)
                    .atRate(2.5)
                    .build();

            System.out.println(account);
            System.out.println(anotherAccount);
        }
*/
    }
}
