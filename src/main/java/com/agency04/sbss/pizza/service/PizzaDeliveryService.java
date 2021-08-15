package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.DeliveryOrder;
import com.agency04.sbss.pizza.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;

@Service("myDelivery")
public class PizzaDeliveryService {

    @Autowired
    @Qualifier("myFirstPizzeria")
    private PizzeriaService firstPizzeriaService;

    @Autowired
    private PizzeriaService secondPizzeriaService;

    private Collection<DeliveryOrder> currentOrders;

    public PizzaDeliveryService(){ }

    public PizzeriaService getFirstPizzeriaService() {
        return firstPizzeriaService;
    }

    public PizzeriaService getSecondPizzeriaService() {
        return secondPizzeriaService;
    }

    public Collection<DeliveryOrder> getCurrentOrders() {
        return currentOrders;
    }

    public void setCurrentOrders(Collection<DeliveryOrder> currentOrders) {
        this.currentOrders = currentOrders;
    }

    public Collection<Pizza> getMenuFromFirstPizzeria() {
        return getFirstPizzeriaService().getMenu();
    }

    public void addOrder(DeliveryOrder deliveryOrder) {
        getCurrentOrders().add(deliveryOrder);
        System.out.println("A delivery form has been added to PizzaDeliveryService!");
    }

    @PostConstruct
    public void doMyStartupStuff() {
        currentOrders = new ArrayList<>();
    }
}