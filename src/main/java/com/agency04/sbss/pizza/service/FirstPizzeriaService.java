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

    public FirstPizzeriaService(){ }

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
        System.out.println("A delicious pizza has been made by FirstPizzeriaService!");
    }
}