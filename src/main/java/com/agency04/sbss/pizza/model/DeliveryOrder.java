package com.agency04.sbss.pizza.model;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;

public class DeliveryOrder {

    private Customer delCustomer;
    private Collection<PizzaOrderItem> delPizzaOrderDetails;

    public DeliveryOrder(Customer delCustomer, Collection<PizzaOrderItem> delPizzaOrderDetails) {
        this.delCustomer = delCustomer;
        this.delPizzaOrderDetails = delPizzaOrderDetails;
    }

    public DeliveryOrder() { }

    public Customer getDelCustomer() {
        return delCustomer;
    }
    public void setDelCustomer(Customer delCustomer) {
        this.delCustomer = delCustomer;
    }

    public Collection<PizzaOrderItem> getDelPizzaOrderDetails() {
        return delPizzaOrderDetails;
    }
    public void setDelPizzaOrderDetails(Collection<PizzaOrderItem> delPizzaOrderDetails) {
        this.delPizzaOrderDetails = delPizzaOrderDetails;
    }

    @PostConstruct
    public void doMyStartupStuff() {
        delPizzaOrderDetails = new ArrayList<>();
        delCustomer = new Customer();
    }
}