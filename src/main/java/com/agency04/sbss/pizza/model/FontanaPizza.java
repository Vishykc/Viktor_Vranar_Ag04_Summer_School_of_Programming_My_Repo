package com.agency04.sbss.pizza.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component("myFontanaPizza")
@Scope("prototype")
public class FontanaPizza implements Pizza {
    private final String name;
    private final Collection<String> ingredients;

    FontanaPizza() {
        System.out.println(">> FontanaPizza: inside of FontanaPizza() constructor");
        name = "Fontana";
        ingredients = new ArrayList<>();
        ingredients.add(PizzaIngredient.TOS.getLabel());
        ingredients.add(PizzaIngredient.MOZ.getLabel());
        ingredients.add(PizzaIngredient.GOR.getLabel());
        ingredients.add(PizzaIngredient.RAD.getLabel());
        ingredients.add(PizzaIngredient.PAR.getLabel());
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
