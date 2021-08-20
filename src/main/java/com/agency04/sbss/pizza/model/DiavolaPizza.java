package com.agency04.sbss.pizza.model;

import java.util.ArrayList;
import java.util.Collection;

public class DiavolaPizza implements PizzaInt {
    private final String name;
    private final Collection<String> ingredients;

    public DiavolaPizza() {
        System.out.println(">> DiavolaPizza: inside of DiavolaPizza() constructor");
        name = "Diavola";

        ingredients = new ArrayList<>();
        ingredients.add(Ingredient.TOS.getLabel());
        ingredients.add(Ingredient.MOZ.getLabel());
        ingredients.add(Ingredient.SPS.getLabel());
        ingredients.add(Ingredient.CHI.getLabel());
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