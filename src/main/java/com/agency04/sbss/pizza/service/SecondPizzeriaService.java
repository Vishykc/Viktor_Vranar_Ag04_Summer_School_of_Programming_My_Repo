package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("mySecondPizzeria")
public class SecondPizzeriaService implements PizzeriaService{
    private String name;
    private String address;

    public SecondPizzeriaService(){ }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> SecondPizzeriaService: inside of doMyStartupStuff");
        name = "Antea Tinodi";
        address = "Ul. Frana Galovica 13, 48 000 Koprivnica";
    }

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
        System.out.println("A delicious pizza has been made by SecondPizzeriaService!()");
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> SecondPizzeriaService: inside of doMyCleanupStuff()");
    }
}

