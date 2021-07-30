package com.agency04.sbss.pizza.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component("myDiavolaPizza")
@Scope("prototype")
public class DiavolaPizza implements Pizza {
    private final String name;
    private final Collection<String> ingredients;

    DiavolaPizza() {
        System.out.println(">> DiavolaPizza: inside of DiavolaPizza() constructor");
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
}