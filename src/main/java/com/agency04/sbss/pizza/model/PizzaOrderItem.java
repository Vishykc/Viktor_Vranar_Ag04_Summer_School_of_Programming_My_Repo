package com.agency04.sbss.pizza.model;

import javax.annotation.PostConstruct;

public class PizzaOrderItem {

    private String pizza;
    private String size;
    private int quantity;

    public PizzaOrderItem() {}
    public PizzaOrderItem(String pizza, String size, int quantity) {
        this.pizza = pizza;
        this.size = size;
        this.quantity = quantity;
    }

     @PostConstruct
     public void doMyStartupStuff() {}

    public String getPizza() {
        return pizza;
    }
    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int number) {
        this.quantity = number;
    }
}