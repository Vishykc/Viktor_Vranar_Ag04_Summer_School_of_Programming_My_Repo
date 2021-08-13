package com.agency04.sbss.pizza.model;

public enum Size {
    S("SMALL"),
    M("MEDIUM"),
    L("LARGE");

    private final String label;

    public String getLabel() {
        return label;
    }

    Size(String label) {
        this.label = label;
    }
}
