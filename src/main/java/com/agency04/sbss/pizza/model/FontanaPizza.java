package com.agency04.sbss.pizza.model;

import java.util.ArrayList;

public class FontanaPizza implements  Pizza{
    private String name;
    private ArrayList<String> ingredients;

    public FontanaPizza(){
        name = "Fontana";
        ingredients = new ArrayList<>();
        ingredients.add("tomato sauce");
        ingredients.add("mozzarella");
        ingredients.add("gorgonzola cheese");
        ingredients.add("radicchio");
        ingredients.add("parmesan");
    }

    @Override
    public String getName() { return name; }

    @Override
    public ArrayList<String> getIngredients() { return ingredients; }
}
