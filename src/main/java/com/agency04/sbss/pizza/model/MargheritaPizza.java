package com.agency04.sbss.pizza.model;

import java.util.ArrayList;
import java.util.Collection;

public class MargheritaPizza implements Pizza {
    private final String name;
    private final Collection<String> ingredients;

    public MargheritaPizza() {
        System.out.println(">> MargeritaPizza: inside of MargheritaPizza() constructor");
        name = "Margherita";
        ingredients = new ArrayList<>();
        ingredients.add(PizzaIngredient.TOS.getLabel());
        ingredients.add(PizzaIngredient.MOZ.getLabel());
        ingredients.add(PizzaIngredient.ORE.getLabel());

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