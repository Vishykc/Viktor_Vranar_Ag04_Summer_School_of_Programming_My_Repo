package com.agency04.sbss.pizza;

import java.util.ArrayList;

public class PizzaDeliveryService {

    private FirstPizzeriaService firstPizzeriaService;

    public PizzaDeliveryService(){

    }

    public PizzaDeliveryService(FirstPizzeriaService theFirstPizzeriaService){
        firstPizzeriaService = theFirstPizzeriaService;
    }

    /*private String name = "Viktor Vranar";
    private String address = "Jordanovac 115, 10 000 Zagreb";
    private Pizza pizza;*/


    public void orderPizza(Pizza thePizza) {
        firstPizzeriaService.makePizza(thePizza);

        System.out.println("\nDetails of the order:\nname: " + firstPizzeriaService.getName() + "\naddress: " + firstPizzeriaService.getAddress() + "\npizza: " + firstPizzeriaService.getPizza().getName() + "\n");

        System.out.println("The order of pizza has finished!");
    }

}
