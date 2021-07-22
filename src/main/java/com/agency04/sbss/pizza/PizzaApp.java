package com.agency04.sbss.pizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {
        // Add some pizza code
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        PizzaDeliveryService thePizzaDeliveryService = (PizzaDeliveryService) context.getBean("myDelivery");
        Pizza pizza = new MargheritaPizza();
        thePizzaDeliveryService.orderPizza(pizza);




        context.close();

    }

}
