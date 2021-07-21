package com.agency04.sbss.pizza;

import java.util.ArrayList;

public class MargheritaPizza implements  Pizza{
    private String name;
    private ArrayList<String> ingredients;

    public Pizza(){
        name = "Margerita"
        ingredients = new ArrayList<String>();
        ingredients.add("tomato sauce");
        ingredients.add("mozzarella");
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
