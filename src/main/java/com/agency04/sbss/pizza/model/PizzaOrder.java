package com.agency04.sbss.pizza.model;


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

    @Column
    private Size size;

    @ManyToOne()
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;


    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    @OneToMany(
            mappedBy = "pizzaOrder",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Pizza> pizzas = new ArrayList<>();




}
