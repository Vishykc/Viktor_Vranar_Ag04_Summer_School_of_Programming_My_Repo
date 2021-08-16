package com.agency04.sbss.pizza.model;

import java.util.Collection;
import java.util.List;

public class DeliveryOrderForm {

    private String customerUsername;
    private Collection<PizzaOrderItem> orderDetails;

    public String getCustomerUsername() {
        return customerUsername;
    }
    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public Collection<PizzaOrderItem> getOrderDetails() {
        return orderDetails;
    }
    public void setOrderDetails(List<PizzaOrderItem> orderDetails) {
        this.orderDetails = orderDetails;
    }
}