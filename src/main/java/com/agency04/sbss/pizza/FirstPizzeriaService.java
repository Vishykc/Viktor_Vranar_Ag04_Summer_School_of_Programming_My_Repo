package com.agency04.sbss.pizza;

public class FirstPizzeriaService implements PizzeriaService{
    private String name;
    private String address;
    private Pizza pizza;


    public FirstPizzeriaService(){
        name = "Viktor Vranar";
        address = "Jordanovac 115, 10 000 Zagreb";
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public Pizza getPizza() {
        return pizza;
    }

    @Override
    public void makePizza(Pizza thePizza) {
        pizza = thePizza;
        System.out.println("\nA delicious pizza has been made by FirstPizzeriaService!");
    }
}
