package com.agency04.sbss.pizza;

import java.util.ArrayList;

public class DiavolaPizza implements  Pizza{
    private String name;
    private ArrayList<String> ingredients;

    public Pizza(){
        name = "Diavola"
        ingredients = new ArrayList<String>();
        ingredients.add("tomato sauce");
        ingredients.add("mozzarella");
        ingredients.add("spicy salami");
        ingredients.add("chilli pepper");
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
