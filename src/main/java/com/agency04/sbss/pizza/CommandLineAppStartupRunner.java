package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerDetailsRepository customerDetailsRepository;

    @Autowired
    DeliveryRepository deliveryRepository;

    @Autowired
    PizzaOrderRepository pizzaOrderRepository;

    @Autowired
    PizzaRepository pizzaRepository;

    @Override
    public void run(String... args) throws Exception {

        // First initial customer and the details
        CustomerDetails firstCustomerDetails = new CustomerDetails();
        firstCustomerDetails.setFirstName("Viktor");
        firstCustomerDetails.setLastName("Vranar");
        firstCustomerDetails.setPhone("098 945 68 36");
        customerDetailsRepository.save(firstCustomerDetails);

        Customer firstCustomer = new Customer();
        firstCustomer.setUsername("vvranar");
        firstCustomer.setCustomerDetails(firstCustomerDetails);
        customerRepository.save(firstCustomer);

        // Second initial customer and the details
        CustomerDetails secondCustomerDetails = new CustomerDetails();
        secondCustomerDetails.setFirstName("Matija");
        secondCustomerDetails.setLastName("Dedic");
        secondCustomerDetails.setPhone("098 098 098");
        customerDetailsRepository.save(secondCustomerDetails);

        Customer secondCustomer = new Customer();
        secondCustomer.setUsername("mdedic");
        secondCustomer.setCustomerDetails(secondCustomerDetails);
        customerRepository.save(secondCustomer);

        // Third initial customer and the details
        CustomerDetails thirdCustomerDetails = new CustomerDetails();
        thirdCustomerDetails.setFirstName("Ivan");
        thirdCustomerDetails.setLastName("Horvat");
        thirdCustomerDetails.setPhone("098 000 00 00");
        customerDetailsRepository.save(thirdCustomerDetails);

        Customer thirdCustomer = new Customer();
        thirdCustomer.setUsername("ihorvat");
        thirdCustomer.setCustomerDetails(thirdCustomerDetails);
        customerRepository.save(thirdCustomer);

        // Initial data for Customer-Delivery relationship
        Customer customer = new Customer();
        customer.setUsername("mostovic");

        java.util.Date date1 = new java.util.Date();
        Delivery delivery1 = new Delivery(customer, date1);

        java.util.Date date2 = new java.util.Date();
        Delivery delivery2 = new Delivery(customer, date2);

        List<Delivery> deliveries = Arrays.asList(delivery1, delivery2);

        customer.setDeliveries(deliveries);
        customerRepository.save(customer);


        //Initial data for Delivery-PizzaOrder relationship
        Delivery delivery = new Delivery();
        java.util.Date date3 = new java.util.Date();
        delivery.setSubmissionDate(date3);

        PizzaOrder pizzaOrder1 = new PizzaOrder();
        pizzaOrder1.setQuantity("5");
        pizzaOrder1.setSize(Size.M);
        pizzaOrder1.setDelivery(delivery);

        PizzaOrder pizzaOrder2 = new PizzaOrder();
        pizzaOrder2.setQuantity("1");
        pizzaOrder2.setSize(Size.L);
        pizzaOrder2.setDelivery(delivery);

        List<PizzaOrder> pizzaOrders = Arrays.asList(pizzaOrder1, pizzaOrder2);

        delivery.setPizzaOrders(pizzaOrders);
        deliveryRepository.save(delivery);

        //Initial data for Pizza-PizzaOrder relationship
        Pizza pizza = new Pizza();
        pizza.setName("Diavola");

        PizzaOrder pizzaOrder3 = new PizzaOrder();
        pizzaOrder1.setQuantity("7");
        pizzaOrder1.setSize(Size.S);
        pizzaOrder1.setPizza(pizza);

        PizzaOrder pizzaOrder4 = new PizzaOrder();
        pizzaOrder1.setQuantity("999");
        pizzaOrder1.setSize(Size.L);
        pizzaOrder1.setPizza(pizza);

        List<PizzaOrder> pizzaOrdersNew = Arrays.asList(pizzaOrder3, pizzaOrder4);
        pizza.setPizzaOrders(pizzaOrdersNew);
        pizzaRepository.save(pizza);

    }
}