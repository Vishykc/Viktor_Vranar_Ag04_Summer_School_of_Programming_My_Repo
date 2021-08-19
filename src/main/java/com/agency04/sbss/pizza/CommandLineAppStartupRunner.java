package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.model.CustomerDetails;
import com.agency04.sbss.pizza.repository.CustomerDetailsRepository;
import com.agency04.sbss.pizza.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerDetailsRepository customerDetailsRepository;

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

    }
}
