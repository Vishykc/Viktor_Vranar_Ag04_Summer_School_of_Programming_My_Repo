package com.agency04.sbss.pizza.model;

public enum Ingredient {
    ART("artichokes"),
    CHI("chilly pepper"),
    GOR("gorgonzola"),
    HAM("ham"),
    MOZ("mozzarella"),
    OLI("olives"),
    ORE("oregano"),
    PAR("parmesan"),
    RAD("radicchio"),
    SPS("spicy salamy"),
    TOS("tomato sauce");

    private final String label;

    public String getLabel() {
        return label;
    }

    Ingredient(String label) {
        this.label = label;
    }

}
