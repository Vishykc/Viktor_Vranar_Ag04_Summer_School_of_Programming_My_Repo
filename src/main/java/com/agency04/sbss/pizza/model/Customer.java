package com.agency04.sbss.pizza.model;

public class Customer implements CustomerInt{

    private String username;
    private String name;
    private String address;

    public Customer() {}

    public Customer(String theUsername, String theName, String theAddress) {
        name = theName;
        address = theAddress;
        username = theUsername;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String theUsername) {
        username = theUsername;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String theName) {
        name = theName;

    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String theAddress) {
        address = theAddress;

    }
}
