package com.agency04.sbss.pizza.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
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

    public Customer() {}

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }
    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }
    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }
}