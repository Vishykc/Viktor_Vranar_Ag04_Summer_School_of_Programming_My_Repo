package com.agency04.sbss.pizza.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @OneToOne
    @JoinColumn(name = "CustomerDetails_id", referencedColumnName = "id")
    private CustomerDetails customerDetails;



    @OneToMany(
            mappedBy = "customer",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Delivery> deliveries = new ArrayList<>();










    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }









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