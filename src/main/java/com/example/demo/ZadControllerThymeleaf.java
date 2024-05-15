package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
class ZadControllerThymeleaf {

    @RequestMapping("/zad11")
    public Object zad11(Model model) {
        Osoba osoba4 = new Osoba(4, "", "", "123-456-789", "henryk@mail.pl",0);
        model.addAttribute("osoba4", osoba4);
        return "StronaWidokZad11";
    }

    @PostMapping("/zad11/add")
    public String addOsoba11(@ModelAttribute Osoba osobaFormularz, Model model) {
        model.addAttribute("osobaFormularz", osobaFormularz);
        if(osobaFormularz.getWiek()< 18) {
            return "zad11Odp1";
        } else if (osobaFormularz.getWiek() < 35)
            return "zad11Odp2";
        else {
            return "zad11Odp3";
        }
    }


    @PostMapping("/zad10/add")
    public String addOsoba10(@ModelAttribute Osoba osobaFormularz, Model model) {
        model.addAttribute("osobaFormularz", osobaFormularz);
        if(checkNotEmpty(osobaFormularz)) {
            return "poprawnaWalidacja";
        } else
            return "errorZad10";
    }

    @RequestMapping("/zad10")
    public Object zad10(Model model) {
        Osoba osoba3 = new Osoba(2, "Henryk", "Sienkiewicz", "123-456-789", "henryk@mail.pl",0);
        model.addAttribute("osoba3", osoba3);
        return "StronaWidokZad10";
    }

    @PostMapping("/zad9/add")
    public String addOsoba(@ModelAttribute Osoba osobaFormularz, Model model) {
        model.addAttribute("osobaFormularz", osobaFormularz);
        if(checkNotEmpty(osobaFormularz)) {
            return "poprawnaWalidacja";
        } else
            return "errorZad9";
    }



    private boolean checkNotEmpty(Osoba osoba) {
        return 	(osoba.getImie()!=null
                && osoba.getImie().length()>2)
                &&(osoba.getNazwisko()!=null
                && osoba.getNazwisko().length()>2)
                &&(osoba.getMail()!=null
                && osoba.getMail().length()>2);
    }
//
//    @RequestMapping("/zad9")
//    public Object zad9(Model model) {
//        Osoba osoba3 = new Osoba(2, "Henryk", "Sienkiewicz", "123-456-789", "henryk@mail.pl");
//        model.addAttribute("osoba3", osoba3);
//        return "StronaWidokZad9";
//    }
//
//
//    @RequestMapping("/zad8")
//    public Object zad8(Model model) {
//        Osoba osoba1 = new Osoba(1, "Jan", "Kowalski", "600-123-456", "przykladowy@mail.com");
//        model.addAttribute("osoba1", osoba1);
//        Osoba osoba2 = new Osoba(2, "Anna", "Nowak", "600-987-654", "anna@mail.com");
//        model.addAttribute("osoba2", osoba2);
//        return "StronaWidokZad8";
//    }
//
//
//    @GetMapping("/zad7/{dzialanie}/{liczba1}/{liczba2}")
//    public String index7(Model model,
//                         @PathVariable String dzialanie,
//                         @PathVariable Integer liczba1,
//                         @PathVariable Integer liczba2) {
//        switch (dzialanie) {
//            case "+" -> model.addAttribute("dzialanie",
//                    Integer.toString(liczba1 + liczba2));
//            case "-" -> model.addAttribute("dzialanie",
//                    Integer.toString(liczba1 - liczba2));
//            case "*" -> model.addAttribute("dzialanie",
//                    Integer.toString(liczba1 * liczba2));
//            default -> model.addAttribute("dzialanie", "błąd");
//        }
//        return "StronaWidokZad7";
//    }

}
