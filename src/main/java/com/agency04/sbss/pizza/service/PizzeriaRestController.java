package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/pizzeria")
public class PizzeriaRestController {

    @Autowired
    PizzaDeliveryService pizzaDeliveryService;

    @GetMapping
    public PizzeriaService getPizzeria() {

        System.out.println(">> A GET HTTP request was made: /api/pizzeria");
        return pizzaDeliveryService.getFirstPizzeriaService();
    }

    @GetMapping("/menu")
    public Collection<Pizza> getMenu() {

        System.out.println(">> A GET HTTP request was made: /api/pizzeria/menu");
        return pizzaDeliveryService.getMenuFromFirstPizzeria();
    }
}