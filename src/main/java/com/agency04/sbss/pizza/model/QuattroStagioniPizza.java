package com.agency04.sbss.pizza.model;

import java.util.ArrayList;
import java.util.Collection;

public class QuattroStagioniPizza implements PizzaInt {
    private final String name;
    private final Collection<String> ingredients;

    public QuattroStagioniPizza() {
        System.out.println(">> QuattroStagioniPizza: inside of QuattroStagioniPizza() constructor");
        name = "QuattroStagioni";
        ingredients = new ArrayList<>();
        ingredients.add(Ingredient.TOS.getLabel());
        ingredients.add(Ingredient.MOZ.getLabel());
        ingredients.add(Ingredient.HAM.getLabel());
        ingredients.add(Ingredient.ART.getLabel());
        ingredients.add(Ingredient.OLI.getLabel());
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