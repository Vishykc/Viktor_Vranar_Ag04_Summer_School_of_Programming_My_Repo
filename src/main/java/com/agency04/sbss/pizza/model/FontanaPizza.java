package com.agency04.sbss.pizza.model;

import java.util.ArrayList;
import java.util.Collection;

public class FontanaPizza implements Pizza {
    private final String name;
    private final Collection<String> ingredients;
    private Collection<String> sizes;

    public FontanaPizza() {
        System.out.println(">> FontanaPizza: inside of FontanaPizza() constructor");
        name = "Fontana";
        ingredients = new ArrayList<>();
        ingredients.add(PizzaIngredient.TOS.getLabel());
        ingredients.add(PizzaIngredient.MOZ.getLabel());
        ingredients.add(PizzaIngredient.GOR.getLabel());
        ingredients.add(PizzaIngredient.RAD.getLabel());
        ingredients.add(PizzaIngredient.PAR.getLabel());

        sizes = new ArrayList<>();
        sizes.add("S");
        sizes.add("L");
        sizes.add("Jumbo");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Collection<String> getIngredients() {
        return ingredients;
    }

    @Override
    public Collection<String> getSizes() {
        return sizes;
    }
}
