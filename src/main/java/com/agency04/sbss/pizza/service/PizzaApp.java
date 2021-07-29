package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.model.PizzaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {
        // Add some pizza code
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);

        PizzaDeliveryService thePizzaDeliveryService = (PizzaDeliveryService) context.getBean("myDelivery");
        Pizza pizza = context.getBean("myDiavolaPizza", Pizza.class);

        thePizzaDeliveryService.orderPizza(pizza);

        System.out.println("The end of PizzaApp main program!\n");

        context.close();
    }
}
