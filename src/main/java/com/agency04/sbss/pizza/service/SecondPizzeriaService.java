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

    public SecondPizzeriaService(){ }

    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void makePizza(Pizza thePizza) {
        System.out.println("A delicious pizza has been made by SecondPizzeriaService!");
    }
}

