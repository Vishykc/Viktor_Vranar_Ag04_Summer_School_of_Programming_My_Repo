package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component("myDelivery")
public class PizzaDeliveryService {

    @Autowired
    @Qualifier("myFirstPizzeria")
    private PizzeriaService firstPizzeriaService;

    @Autowired
    @Qualifier("mySecondPizzeria")
    private PizzeriaService secondPizzeriaService;

    public PizzaDeliveryService(){ }

    /*public PizzaDeliveryService(PizzeriaService theFirstPizzeriaService){
        firstPizzeriaService = theFirstPizzeriaService;
    }*/

    /*public void setSecondPizzeriaService(PizzeriaService theSecondPizzeriaService){
        secondPizzeriaService = theSecondPizzeriaService;
    }*/

    public void orderPizza(Pizza thePizza) {
        System.out.println("\nWe have received a pizza order!");

        firstPizzeriaService.makePizza(thePizza);

        System.out.println("Details of the order:\nname: "
                + firstPizzeriaService.getName()
                + "\naddress: "
                + firstPizzeriaService.getAddress()
                + "\npizza: "
                + firstPizzeriaService.getPizza().getName() + " ("
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
                + secondPizzeriaService.getPizza().getName() + " ("
                + thePizza.getIngredients().stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ")) + ")\n");
    }
}