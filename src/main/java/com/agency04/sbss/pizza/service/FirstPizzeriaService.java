package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myFirstPizzeria")
public class FirstPizzeriaService implements PizzeriaService{

    @Value("Viktor Vranar")
    private String name;

    @Value("Jordanovac 115, 10 000 Zagreb")
    private String address;

    private Pizza pizza;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public FirstPizzeriaService(){ }

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
        System.out.println("A delicious pizza has been made by FirstPizzeriaService!");
    }
}