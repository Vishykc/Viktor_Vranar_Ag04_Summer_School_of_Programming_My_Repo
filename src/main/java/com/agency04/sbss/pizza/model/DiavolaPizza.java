package com.agency04.sbss.pizza.model;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Collection;

@Component("myDiavolaPizza")
public class DiavolaPizza implements Pizza {
    private String name;
    private Collection<String> ingredients;

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> DiavolaPizza: inside of doMyStartupStuff()");
        name = "Diavola";
        ingredients = new ArrayList<>();
        ingredients.add(PizzaIngredient.TOS.getLabel());
        ingredients.add(PizzaIngredient.MOZ.getLabel());
        ingredients.add(PizzaIngredient.SPS.getLabel());
        ingredients.add(PizzaIngredient.CHI.getLabel());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Collection<String> getIngredients() {
        return ingredients;
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> DiavolaPizza: inside of doMyCleanupStuff()");
    }
}