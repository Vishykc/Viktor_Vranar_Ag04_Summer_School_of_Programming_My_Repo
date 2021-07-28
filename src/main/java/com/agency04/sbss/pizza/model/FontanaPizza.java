package com.agency04.sbss.pizza.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Collection;

@Component("myFontanaPizza")
public class FontanaPizza implements Pizza {
    private String name;
    private Collection<String> ingredients;

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> FontanaPizza: inside of doMyStartupStuff()");
        name = "Fontana";
        ingredients = new ArrayList<>();
        ingredients.add(PizzaIngredient.TOS.getLabel());
        ingredients.add(PizzaIngredient.MOZ.getLabel());
        ingredients.add(PizzaIngredient.GOR.getLabel());
        ingredients.add(PizzaIngredient.RAD.getLabel());
        ingredients.add(PizzaIngredient.PAR.getLabel());
    }

    @Override
    public String getName() { return name; }

    @Override
    public Collection<String> getIngredients() { return ingredients; }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> FontanaPizza: inside of doMyCleanupStuff()");
    }
}
