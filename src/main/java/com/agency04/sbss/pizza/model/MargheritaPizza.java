package com.agency04.sbss.pizza.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component("myMargheritaPizza")
@Scope("prototype")
public class MargheritaPizza implements Pizza {
    private final String name;
    private final Collection<String> ingredients;

    MargheritaPizza() {
        System.out.println(">> MargeritaPizza: inside of MargheritaPizza() constructor");
        name = "Margerita";
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