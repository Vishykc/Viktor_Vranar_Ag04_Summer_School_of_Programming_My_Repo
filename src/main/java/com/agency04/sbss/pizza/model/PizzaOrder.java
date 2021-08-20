package com.agency04.sbss.pizza.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PizzaOrder")
public class PizzaOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String quantity;

    @Column
    private Size size;

    @ManyToOne()
    private Delivery delivery;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;

    public PizzaOrder(){}

    public Pizza getPizza() {return pizza;}
    public void setPizza(Pizza pizza) {this.pizza = pizza;}

    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public Delivery getDelivery() {
        return delivery;
    }
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }


}
