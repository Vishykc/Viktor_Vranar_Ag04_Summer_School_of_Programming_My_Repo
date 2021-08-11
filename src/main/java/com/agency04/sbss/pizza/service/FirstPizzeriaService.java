package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.*;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Collection;

@Service("myFirstPizzeria")
public class FirstPizzeriaService implements PizzeriaService {
    private String name;
    private String address;
    private Collection<Pizza> menu;

    public FirstPizzeriaService() {
    }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> FirstPizzeriaService: inside of doMyStartupStuff()");
        name = "Viktor Vranar";
        address = "Jordanovac 115, 10 000 Zagreb";

        menu = new ArrayList<>();
        menu.add(new DiavolaPizza());
        menu.add(new FontanaPizza());
        menu.add(new MargheritaPizza());
        menu.add(new QuattroStagioniPizza());
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
    public Collection<Pizza> getMenu() {
        return menu;
    }

    public void setMenu(Collection<Pizza> menu) {
        this.menu = menu;
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