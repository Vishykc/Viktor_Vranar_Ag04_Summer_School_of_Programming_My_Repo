package com.agency04.sbss.pizza.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;

@Component("myDeliveryForm")
public class DeliveryOrderForm {
    
    private Customer delCustomer;
    private Collection<PizzaSizeNumber> delPizzaOrderDetails;

    public DeliveryOrderForm() { }

    public Customer getDelCustomer() {
        return delCustomer;
    }

    public void setDelCustomer(Customer delCustomer) {
        this.delCustomer = delCustomer;
    }

    public Collection<PizzaSizeNumber> getDelPizzaOrderDetails() {
        return delPizzaOrderDetails;
    }

    public void setDelPizzaOrderDetails(Collection<PizzaSizeNumber> delPizzaOrderDetails) {
        this.delPizzaOrderDetails = delPizzaOrderDetails;
    }

    @PostConstruct
    public void doMyStartupStuff() {
        delCustomer = new Customer();
        delPizzaOrderDetails = new ArrayList<>();

    }

}
