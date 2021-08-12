package com.agency04.sbss.pizza.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("myPizzaSizeNumber")
public class PizzaSizeNumber {
    private Pizza pizza;
    private String size;
     private int number;

     public PizzaSizeNumber() {

     }

     @PostConstruct
     public void doMyStartupStuff() {

     }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
