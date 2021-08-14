package com.agency04.sbss.pizza.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzaApp {

    public static void main(String[] args) {
        SpringApplication.run(PizzaApp.class, args);
        // Add some pizza code

     /*   AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);

        PizzaDeliveryService thePizzaDeliveryService = (PizzaDeliveryService) context.getBean("myDelivery");
        Pizza pizza = new DiavolaPizza();

        thePizzaDeliveryService.orderPizza(pizza);

        System.out.println("The end of PizzaApp main program!\n");

        context.close();*/
    }
}