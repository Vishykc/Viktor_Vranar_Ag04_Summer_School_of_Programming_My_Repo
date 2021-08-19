package com.agency04.sbss.pizza.model;

import java.util.ArrayList;
import java.util.Collection;

public class MargheritaPizza implements PizzaInt {
    private final String name;
    private final Collection<String> ingredients;

    public MargheritaPizza() {
        System.out.println(">> MargeritaPizza: inside of MargheritaPizza() constructor");
        name = "Margherita";
        ingredients = new ArrayList<>();
        ingredients.add(Ingredient.TOS.getLabel());
        ingredients.add(Ingredient.MOZ.getLabel());
        ingredients.add(Ingredient.ORE.getLabel());
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