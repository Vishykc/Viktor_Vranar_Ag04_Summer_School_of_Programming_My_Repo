package com.agency04.sbss.pizza.model;

import java.util.ArrayList;

public class QuattroStagioniPizza implements  Pizza {
    private String name;
    private ArrayList<String> ingredients;

    public QuattroStagioniPizza() {
        name = "QuattroStagioni";
        ingredients = new ArrayList<String>();
        ingredients.add("tomato sauce");
        ingredients.add("mozzarella");
        ingredients.add("ham");
        ingredients.add("artichokes");
        ingredients.add("olives");
        ingredients.add("oregano");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
}