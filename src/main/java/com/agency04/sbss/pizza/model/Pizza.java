package com.agency04.sbss.pizza.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "pizza")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    //private Collection<Ingredient> ingredients;

    @ManyToOne
    @JoinColumn(name = "pizzaOrder_id")
    private PizzaOrder pizzaOrder;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* public Collection<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Collection<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }*/

    public PizzaOrder getPizzaOrder() {
        return pizzaOrder;
    }

    public void setPizzaOrder(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }
}
