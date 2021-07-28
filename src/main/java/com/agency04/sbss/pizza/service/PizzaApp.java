package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Pizza;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {
        // Add some pizza code
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        PizzaDeliveryService thePizzaDeliveryService = (PizzaDeliveryService) context.getBean("myDelivery");
        Pizza pizza = context.getBean("myDiavolaPizza", Pizza.class);

        thePizzaDeliveryService.orderPizza(pizza);

        System.out.println("The end of PizzaApp main program!");

        context.close();
    }
}
