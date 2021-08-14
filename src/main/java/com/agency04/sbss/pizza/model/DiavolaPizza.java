package com.agency04.sbss.pizza.model;

import java.util.ArrayList;
import java.util.Collection;

public class DiavolaPizza implements Pizza {
    private final String name;
    private final Collection<String> ingredients;

    public DiavolaPizza() {
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