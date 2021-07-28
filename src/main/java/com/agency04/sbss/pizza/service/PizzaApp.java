package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.DiavolaPizza;
import com.agency04.sbss.pizza.model.Pizza;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {
        // Add some pizza code
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        PizzeriaService FirstPizzeriaService1 = context.getBean("myFirstPizzeria", PizzeriaService.class);
        PizzeriaService FirstPizzeriaService2 = context.getBean("myFirstPizzeria", PizzeriaService.class);

        System.out.println("\nMemory location for FirstPizzeriaService1: " + FirstPizzeriaService1);
        System.out.println("Memory location for FirstPizzeriaService2: " + FirstPizzeriaService2 + "\n");

        PizzeriaService SecondPizzeriaService1 = context.getBean("mySecondPizzeria", PizzeriaService.class);
        PizzeriaService SecondPizzeriaService2 = context.getBean("mySecondPizzeria", PizzeriaService.class);

        System.out.println("\nMemory location for SecondPizzeriaService1: " + SecondPizzeriaService1);
        System.out.println("Memory location for SecondPizzeriaService2: " + SecondPizzeriaService2);

        System.out.println("\n\n[OPTIONAL] Use the @Scope annotation on the PizzeriaService beans" +
                " to test different scope values, by fetching the same bean twice in PizzaApp" +
                " and printing the object (memory location) returned." +
                " What happens when the scope is prototype vs singleton ?");

        System.out.println("If the scope of a bean is \"singleton\" (FirstPizzeriaService)" +
                ", the bean is instanciated only once and everytime we ask the context for the bean" +
                ", it returns the same reference to this bean object. " +
                "If the scope of a bean is \"prototype\" (SecondPizzeriaService)" +
                ", the context makes a new bean object everytime we ask for this type of bean.\n" );

        System.out.println("\nThe end of PizzaApp main program!\n");

        context.close();
    }
}
