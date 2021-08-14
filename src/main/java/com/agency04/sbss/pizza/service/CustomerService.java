package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Customer;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;

@Service("myCustomer")
public class CustomerService {
    private Collection<Customer> customersList;

    public CustomerService() {}

    @PostConstruct
    public void doMyStartupStuff() {

        customersList = new ArrayList<>();

        customersList.add(new Customer("vvranar", "Viktor Vranar", "Jordanovac 115, 10 000 Zagreb"));
        customersList.add(new Customer("ihorvat", "Ivan Horvat", "Neka Ulica 100, 10 000 Zagreb"));
        customersList.add(new Customer("mdedic", "Matija Dedic", "Jazzovska 99, 10 000 Zagreb"));

    }

    public Collection<Customer> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(Collection<Customer> customersList) {
        this.customersList = customersList;
    }

    public Customer findByUsername(Collection<Customer> customersList, String username) {
        Customer foundCustomer = new Customer();
        foundCustomer = customersList.stream().filter(customer -> username.equals(customer.getUsername())).findFirst().orElse(null);

        if(foundCustomer == null) throw new CustomerNotFoundException("Customer not found - " + username);

        return  foundCustomer;
    }

    public Customer getCustomerByUsername(String userName) {
        return findByUsername(getCustomersList(), userName);
    }

    public void addCustomer(Customer customer) {
        getCustomersList().add(customer);
    }

    public void updateCustomer(Customer customer) {
        getCustomerByUsername(customer.getUsername());
        getCustomersList().removeIf(c -> c.getUsername().equals(customer.getUsername()));
        addCustomer(customer);
    }

    public void deleteCustomerByUsername(String username) {
        Customer tempCustomer = findByUsername(getCustomersList(), username);
        getCustomersList().removeIf(c -> c.getUsername().equals(username));
    }

}
