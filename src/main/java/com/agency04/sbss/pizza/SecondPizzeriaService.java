package com.agency04.sbss.pizza;

public class SecondPizzeriaService implements PizzeriaService{
    private String name;
    private String address;
    private Pizza pizza;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SecondPizzeriaService(){ }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }

    @Override
    public void makePizza(Pizza thePizza) {
        pizza = thePizza;
        System.out.println("A delicious pizza has been made by SecondPizzeriaService!");
    }
}

