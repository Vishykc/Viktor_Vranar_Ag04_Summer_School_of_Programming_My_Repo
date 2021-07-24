package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mySecondPizzeria")
public class SecondPizzeriaService implements PizzeriaService{

    @Value("${SecondPizzeriaService.name}")
    private String name;

    @Value("${SecondPizzeriaService.address}")
    private String address;

    private Pizza pizza;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SecondPizzeriaService(){ }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }

    @Override
    public void makePizza(Pizza thePizza) {
        pizza = thePizza;
        System.out.println("A delicious pizza has been made by SecondPizzeriaService!");
    }
}

