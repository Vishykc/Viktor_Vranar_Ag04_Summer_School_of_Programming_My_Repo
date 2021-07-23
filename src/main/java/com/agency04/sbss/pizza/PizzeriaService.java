package com.agency04.sbss.pizza;

public interface PizzeriaService {
    String getName();
    String getAddress();
    Pizza getPizza();
    void makePizza(Pizza thePizza);
}
