package com.agency04.sbss.pizza.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "delivery")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(
            mappedBy = "delivery",
            cascade = CascadeType.ALL,
            orphanRemoval = true

    )
    private List<PizzaOrder> pizzaOrders = new ArrayList<>();

    @Column
    private Date submissionDate;

    //@JoinColumn(name = "customer_id")
    @ManyToOne
    private Customer customer;


    public Delivery() {

    }

    public Delivery(Customer customer, Date submissionDate) {
        this.customer = customer;
        this.submissionDate = submissionDate;
    }

    public void setPizzaOrders(List<PizzaOrder> pizzaOrders) {
        this.pizzaOrders = pizzaOrders;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }
    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

}
