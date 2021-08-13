package com.agency04.sbss.pizza.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("myPizzaSizeQuantity")
public class PizzaSizeQuantity {

    private String pizza;
    private String size;
    private int quantity;

     public PizzaSizeQuantity() {

     }

     @PostConstruct
     public void doMyStartupStuff() {

     }

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
