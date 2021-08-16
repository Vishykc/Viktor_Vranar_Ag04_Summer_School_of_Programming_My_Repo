package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.model.DeliveryOrder;
import com.agency04.sbss.pizza.model.DeliveryOrderForm;
import com.agency04.sbss.pizza.model.PizzaOrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class DeliveryOrderFormToDeliveryOrderConverter implements Converter<DeliveryOrderForm, DeliveryOrder> {

    @Autowired
    CustomerService customerService;

    @Override
    public DeliveryOrder convert(DeliveryOrderForm source) {

        Customer theCustomer = customerService.findByUsername(customerService.getCustomersList(), source.getCustomerUsername());
        Collection<PizzaOrderItem> theOrderDetails = source.getOrderDetails();

        return new DeliveryOrder(theCustomer, theOrderDetails);
    }
}