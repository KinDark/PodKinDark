package myProjektTarr2019java6Dar.podstawy.instrukcje.przelacz;

import myProjektTarr2019java6Dar.podstawy.typydanych.typwyliczeniowy.Status;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2020java6
 * @since : 29.02.2020
 **/
public class SwitchMain {

    public static void main(String[] args) {

        // status uzytkownika
        // WIELKIMI literami wartość enum
        Status statusUzytkownika = Status.NIE_AKTYWNY;

        switch (statusUzytkownika) {
            case AKTYWNY:
                System.out.println("Aktywny");
                break;
            case ZALOGOWANY:
                System.out.println("Zalogowany");
                break;
            default:
                System.out.println("Nieznany status");
        }


    }
}
