package com.agency04.sbss.pizza.model;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String username;

    @OneToOne
    @JoinColumn(name = "CustomerDetails_id", referencedColumnName = "id")
    private CustomerDetails customerDetails;

    public Long getId() {
        return id;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }


    //private Delivery deliveries;



    /*private String name;
    private String address;*/

    public Customer() {}

    /*public Customer(String theUsername, String theName, String theAddress) {
        name = theName;
        address = theAddress;
        username = theUsername;
    }*/

    public String getUsername() {
        return username;
    }
    public void setUsername(String theUsername) {
        username = theUsername;
    }

    /*public String getName() {
        return name;
    }
    public void setName(String theName) {
        name = theName;
    }*/

    /*public String getAddress() {
        return address;
    }
    public void setAddress(String theAddress) {
        address = theAddress;

    }*/
}