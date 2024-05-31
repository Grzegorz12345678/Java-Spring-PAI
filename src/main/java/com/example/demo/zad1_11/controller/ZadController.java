package com.example.demo.zad1_11.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/")
@RestController
public class ZadController {

    @RequestMapping("/zad2")
    public String index2(@RequestParam("imie") String imie,
                         @RequestParam("nazwisko") String nazwisko,
                         @RequestParam("pesel") String pesel,
                         @RequestParam(value = "email", required = false) String email,
                         @RequestParam(value = "telefon", required = false) String telefon) {
        String opis = "Witaj " + imie + " " + nazwisko + "<br><br>Twój pesel to " + pesel;
        if (email!=null){
            opis += "<br><br>Twój adres e-mail to: " + email;
        }
        if (telefon!=null){
            opis += "<br><br>Twój telefon to: " + telefon;
        }
        return opis;
    }

    @GetMapping("/zad5/{dzialanie}/{liczba1}/{liczba2}")
    public String index5(@PathVariable String dzialanie,
                         @PathVariable Integer liczba1,
                         @PathVariable Integer liczba2) {
        return switch (dzialanie) {
            case "+" -> Integer.toString(liczba1 + liczba2);
            case "-" -> Integer.toString(liczba1 - liczba2);
            case "*" -> Integer.toString(liczba1 * liczba2);
            default -> "błąd";
        };
    }

    @RequestMapping("/zad6")
    @ResponseBody
    public String index6(@RequestHeader("User-Agent") String klient,
                         @RequestHeader("Accept-Language") String jezyk,
                         @RequestHeader("Host") String host){
        return "<b>przeglądarka / klient http</b> <br>" + klient
               + "<br><br><b>Jezyk</b> <br>" + jezyk
               + "<br><br><b>Host</b> <br>" + host;
    }
}
