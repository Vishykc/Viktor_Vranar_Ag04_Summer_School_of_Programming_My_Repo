package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.PizzaInt;

import java.util.Collection;

public interface PizzeriaService {
    String getName();
    String getAddress();
    Collection<PizzaInt> getMenu();
    void makePizza(PizzaInt thePizzaInt);
    PizzaInt findPizzaByName(Collection<PizzaInt> pizzasList, String name);
}