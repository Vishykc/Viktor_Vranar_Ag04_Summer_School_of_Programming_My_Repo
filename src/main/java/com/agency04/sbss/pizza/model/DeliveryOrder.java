package com.agency04.sbss.pizza.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;

@Component("myDeliveryOrder")
public class DeliveryOrder {

    private Customer delCustomer;
    private Collection<PizzaSizeQuantity> delPizzaOrderDetails;

    public DeliveryOrder(Customer delCustomer, Collection<PizzaSizeQuantity> delPizzaOrderDetails) {
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

    public Collection<PizzaSizeQuantity> getDelPizzaOrderDetails() {
        return delPizzaOrderDetails;
    }

    public void setDelPizzaOrderDetails(Collection<PizzaSizeQuantity> delPizzaOrderDetails) {
        this.delPizzaOrderDetails = delPizzaOrderDetails;
    }

    @PostConstruct
    public void doMyStartupStuff() {
        delPizzaOrderDetails = new ArrayList<>();
        delCustomer = new Customer();
    }

}
