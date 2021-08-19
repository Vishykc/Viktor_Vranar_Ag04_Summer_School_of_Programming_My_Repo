package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.repository.CustomerDetailsRepository;
import com.agency04.sbss.pizza.repository.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PizzaApp {

    public static void main(String[] args) {
        // Add some pizza code

        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(PizzaApp.class, args);

        CustomerRepository customerRepository =
                configurableApplicationContext.getBean(CustomerRepository.class);
        CustomerDetailsRepository customerDetailsRepository =
                configurableApplicationContext.getBean(CustomerDetailsRepository.class);


        Customer myCustomer = new Customer()



    }
}