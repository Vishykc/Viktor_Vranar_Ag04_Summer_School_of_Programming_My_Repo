package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;

import java.util.Collection;

public interface PizzeriaService {
    String getName();
    String getAddress();
    Collection<Pizza> getMenu();
    void makePizza(Pizza thePizza);
}
