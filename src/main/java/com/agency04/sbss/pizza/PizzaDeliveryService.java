package com.agency04.sbss.pizza;

public class PizzaDeliveryService implements PizzeriaService{
    //Pizza pizza;


    public String orderPizza(Pizza thePizza){
        return "description of the order";
    }

    @Override
    public String getName() {
        //return pizza.name;
        return null;
    }

    @Override
    public String getAdress() {
        return null;
    }

    @Override
    public String makePizza(Pizza thePizza) {
        return null;
    }
}
