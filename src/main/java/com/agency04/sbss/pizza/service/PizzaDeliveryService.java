package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.DeliveryOrderForm;
import com.agency04.sbss.pizza.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@Service("myDelivery")
public class PizzaDeliveryService {

    @Autowired
    @Qualifier("myFirstPizzeria")
    private PizzeriaService firstPizzeriaService;

    @Autowired
    private PizzeriaService secondPizzeriaService;

    private Collection<DeliveryOrderForm> currentOrders;

    public PizzaDeliveryService(){ }

    public PizzeriaService getFirstPizzeriaService() {
        return firstPizzeriaService;
    }

    public PizzeriaService getSecondPizzeriaService() {
        return secondPizzeriaService;
    }

    public Collection<DeliveryOrderForm> getCurrentOrders() {
        return currentOrders;
    }

    public void setCurrentOrders(Collection<DeliveryOrderForm> currentOrders) {
        this.currentOrders = currentOrders;
    }

    public Collection<Pizza> getMenuFromFirstPizzeria() {
        return getFirstPizzeriaService().getMenu();
    }

    public void addOrder(DeliveryOrderForm deliveryOrderForm) {
        getCurrentOrders().add(deliveryOrderForm);
        System.out.println("A delivery form has been added to PizzaDeliveryService!");
    }

    @PostConstruct
    public void doMyStartupStuff() {
        currentOrders = new ArrayList<>();
    }
}