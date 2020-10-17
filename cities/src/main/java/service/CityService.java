package service;

import model.City;

import java.util.List;
import java.util.Optional;

public interface CityService {
        // zwraca lista miast danego kraju
        List<City> findByCountryCode(String countryCode);
        // zwraca info odnosnie wpisanego miasta
        Optional<City> findByName(String name);
        // zwraca liste miast z danego kraju zaczynajacych sie na dana litere
        List<City> findByNameStartWith(String startName);
        List<String> findCountryCodes();
        //TODO dołożyć jakis inny service
}
