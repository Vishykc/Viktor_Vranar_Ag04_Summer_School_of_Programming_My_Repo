package com.agency04.sbss.pizza.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Delivery")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Delivery() {

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

    public Delivery(Customer customer, Date submissionDate) {
        this.customer = customer;
        this.submissionDate = submissionDate;
    }

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column
    private Date submissionDate;







    @OneToMany(
            mappedBy = "delivery",
            cascade = CascadeType.ALL,
            orphanRemoval = true

    )
    private List<PizzaOrder> pizzaOrders = new ArrayList<>();


}
