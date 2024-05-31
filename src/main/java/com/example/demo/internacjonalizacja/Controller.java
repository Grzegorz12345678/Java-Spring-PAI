package com.example.demo.internacjonalizacja;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;
@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/welcome")
    public String welcome(Model model, Locale locale) {

            System.out.println(locale+" kodowanie");
        model.addAttribute("locale", locale);
        return "internacjonalizacja";

    }
}

