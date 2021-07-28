package com.agency04.sbss.pizza.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Collection;

@Component("myMargheritaPizza")
public class MargheritaPizza implements Pizza {
    private String name;
    private Collection<String> ingredients;

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> MargeritaPizza: inside of doMyStartupStuff()");
        name = "Margerita";
        ingredients = new ArrayList<>();
        ingredients.add(PizzaIngredient.TOS.getLabel());
        ingredients.add(PizzaIngredient.MOZ.getLabel());
        ingredients.add(PizzaIngredient.ORE.getLabel());
    }

    @Override
    public String getName() { return name; }

    @Override
    public Collection<String> getIngredients() { return ingredients; }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> MargeritaPizza: inside of doMyCleanupStuff()");
    }
}