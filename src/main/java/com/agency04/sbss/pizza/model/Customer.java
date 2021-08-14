package com.agency04.sbss.pizza.model;

public class Customer {

    private String username;
    private String name;
    private String address;

    public Customer() {}

    public Customer(String theUsername, String theName, String theAddress) {
        name = theName;
        address = theAddress;
        username = theUsername;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String theUsername) {
        username = theUsername;
    }

    public String getName() {
        return name;
    }

    public void setName(String theName) {
        name = theName;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String theAddress) {
        address = theAddress;

    }
}
