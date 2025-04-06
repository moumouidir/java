package com.example.api_order_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/calcul")
//cest le chemein generale pour les endpoints
public class additionController {

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "La somme de " + a + " et " + b + " est " + (a + b);
    }
    @GetMapping("/sub")
    public String sub(@RequestParam int a, @RequestParam int b) {
        return "La différence de " + a + " et " + b + " est " + (a - b);
    }
    @GetMapping("/mul")
    public String mul(@RequestParam int a, @RequestParam int b) {
        return "Le produit de " + a + " et " + b + " est " + (a * b);
    }
    @GetMapping("/div")
    //cest un Endpoint pour la divition
    public String div(@RequestParam int a, @RequestParam int b) {
        return "Le quotient de " + a + " et " + b + " est " + (a / b);
    }
}
