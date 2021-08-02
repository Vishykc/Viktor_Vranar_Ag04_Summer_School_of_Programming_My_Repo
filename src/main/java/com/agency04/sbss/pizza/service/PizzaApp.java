package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.DiavolaPizza;
import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.model.PizzaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzaApp {

    public static void main(String[] args) {
        SpringApplication.run(PizzaApp.class, args);
        // Add some pizza code
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);

        PizzaDeliveryService thePizzaDeliveryService = (PizzaDeliveryService) context.getBean("myDelivery");
        Pizza pizza = new DiavolaPizza();

        thePizzaDeliveryService.orderPizza(pizza);

        System.out.println("The end of PizzaApp main program!\n");

        context.close();
    }
}
