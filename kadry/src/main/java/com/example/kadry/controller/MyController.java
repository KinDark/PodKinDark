package com.example.kadry.controller;

import com.example.kadry.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    //@RequestMapping("/hello/{imie}", method = RequestMethod.GET) // Mapowanie głównego endpoint "/" do metody welcome
    @GetMapping("/hello/{imie}"
    public String welcome(@RequestParam (defaultValue = "Gościu" )String imie,
        @RequestParam (defaultValue = " w jakiś piękny dzień "), String dzientygodnia) {
                        return "Witaj " + imie + " w " + dzientygodnia;


    }
    @GetMapping ("persons")
    public Person getPersons(){
        return new Person ("Jan", "Kowalski", 34);
    }
}
