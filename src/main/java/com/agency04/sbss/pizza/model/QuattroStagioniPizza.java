package com.agency04.sbss.pizza.model;

import java.util.ArrayList;
import java.util.Collection;

public class QuattroStagioniPizza implements Pizza {
    private final String name;
    private final Collection<String> ingredients;
    private Collection<String> sizes;

    public QuattroStagioniPizza() {
        System.out.println(">> QuattroStagioniPizza: inside of QuattroStagioniPizza() constructor");
        name = "QuattroStagioni";
        ingredients = new ArrayList<>();
        ingredients.add(PizzaIngredient.TOS.getLabel());
        ingredients.add(PizzaIngredient.MOZ.getLabel());
        ingredients.add(PizzaIngredient.HAM.getLabel());
        ingredients.add(PizzaIngredient.ART.getLabel());
        ingredients.add(PizzaIngredient.OLI.getLabel());
        ingredients.add(PizzaIngredient.ORE.getLabel());

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