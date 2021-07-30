package com.agency04.sbss.pizza.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component("myQuattroStagioniPizza")
@Scope("prototype")
public class QuattroStagioniPizza implements Pizza {
    private final String name;
    private final Collection<String> ingredients;

    QuattroStagioniPizza() {
        System.out.println(">> QuattroStagioniPizza: inside of QuattroStagioniPizza() constructor");
        name = "QuattroStagioni";
        ingredients = new ArrayList<>();
        ingredients.add(PizzaIngredient.TOS.getLabel());
        ingredients.add(PizzaIngredient.MOZ.getLabel());
        ingredients.add(PizzaIngredient.HAM.getLabel());
        ingredients.add(PizzaIngredient.ART.getLabel());
        ingredients.add(PizzaIngredient.OLI.getLabel());
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