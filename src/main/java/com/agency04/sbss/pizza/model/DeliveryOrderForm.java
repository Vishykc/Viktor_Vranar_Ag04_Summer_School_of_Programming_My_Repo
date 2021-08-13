package com.agency04.sbss.pizza.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;

@Component("myDeliveryOrderForm")
public class DeliveryOrderForm {

    private String delCustomer;
    private Collection<PizzaSizeQuantity> delPizzaOrderDetails;

    public DeliveryOrderForm() { }

    public String getDelCustomer() {
        return delCustomer;
    }

    public void setDelCustomer(String delCustomer) {
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

    }

}
