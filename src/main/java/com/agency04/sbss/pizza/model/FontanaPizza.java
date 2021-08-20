package com.agency04.sbss.pizza.model;

import java.util.ArrayList;
import java.util.Collection;

public class FontanaPizza implements PizzaInt {
    private final String name;
    private final Collection<String> ingredients;

    public FontanaPizza() {
        System.out.println(">> FontanaPizza: inside of FontanaPizza() constructor");
        name = "Fontana";
        ingredients = new ArrayList<>();
        ingredients.add(Ingredient.TOS.getLabel());
        ingredients.add(Ingredient.MOZ.getLabel());
        ingredients.add(Ingredient.GOR.getLabel());
        ingredients.add(Ingredient.RAD.getLabel());
        ingredients.add(Ingredient.PAR.getLabel());
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