package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("myFirstPizzeria")
public class FirstPizzeriaService implements PizzeriaService {
    private String name;
    private String address;

    public FirstPizzeriaService() {
    }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> FirstPizzeriaService: inside of doMyStartupStuff()");
        name = "Viktor Vranar";
        address = "Jordanovac 115, 10 000 Zagreb";
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
        System.out.println("A delicious pizza has been made by FirstPizzeriaService!");
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> FirstPizzeriaService: inside of doMyCleanupStuff()");
    }
}