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

    /*public void orderPizza(Pizza thePizza) {
        System.out.println("\nWe have received a pizza order!");

        firstPizzeriaService.makePizza(thePizza);
    }*/

    @PostConstruct
    public void doMyStartupStuff() {
        currentOrders = new ArrayList<>();
    }

}




        /*System.out.println("Details of the order:\nname: "
                + firstPizzeriaService.getName()
                + "\naddress: "
                + firstPizzeriaService.getAddress()
                + "\npizza: "
                + thePizza.getName() + " ("
                + thePizza.getIngredients().stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ")) + ")\n");

        System.out.println("\nWe have received a pizza order!");

        secondPizzeriaService.makePizza(thePizza);

        System.out.println("Details of the order:\nname: "
                + secondPizzeriaService.getName()
                + "\naddress: "
                + secondPizzeriaService.getAddress()
                + "\npizza: "
                + thePizza.getName() + " ("
                + thePizza.getIngredients().stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ")) + ")\n");
    }*/