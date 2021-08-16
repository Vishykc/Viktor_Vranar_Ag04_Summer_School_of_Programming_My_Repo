package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Collection;

public class SecondPizzeriaService implements PizzeriaService{
    private String name;
    private String address;
    private Collection<Pizza> menu;

    public SecondPizzeriaService(){ }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> SecondPizzeriaService: inside of doMyStartupStuff");

        name = "Antea Tinodi";
        address = "Ul. Frana Galovica 13, 48 000 Koprivnica";
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
    public void makePizza(Pizza thePizza) {
        System.out.println("A delicious pizza has been made by SecondPizzeriaService!()");
    }

    @Override
    public Collection<Pizza> getMenu() {
        return menu;
    }

    public void setMenu(Collection<Pizza> menu) {
        this.menu = menu;
    }

    public Pizza findPizzaByName(Collection<Pizza> pizzasList, String name) {
        return pizzasList.stream().filter(pizza -> name.equals(pizza.getName())).findFirst().orElse(null);
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> SecondPizzeriaService: inside of doMyCleanupStuff()");
    }
}