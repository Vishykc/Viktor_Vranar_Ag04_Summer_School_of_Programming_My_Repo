package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/{userName}")
    public Customer getCustomer(@PathVariable String userName) {

        System.out.println("A GET HTTP request was made: http://localhost:8080/api/customer/" + userName + "\n");
        return customerService.findByUsername(customerService.getCustomersList(), userName);

    }

    @PostMapping("")
    public Customer setCustomer(@RequestBody Customer theCustomer) {

        System.out.println("A POST HTTP request was made: http://localhost:8080/api/customer and customer is added: " +
                "\nusername: " + theCustomer.getUsername() +
                "\nname: " + theCustomer.getName() +
                "\naddress: " + theCustomer.getAddress() + "\n");
        customerService.getCustomersList().add(theCustomer);
        return theCustomer;
    }

    @PutMapping("")
    public Customer updateCustomer(@RequestBody Customer theCustomer) {

       /* Iterator itr = customerService.getCustomersList().iterator();

        while(itr.hasNext()) {
            Customer customer = (Customer) itr.next();
            if (customer.getUsername() == theCustomer.getUsername()) {
                customerService.getCustomersList().remove(customer); //Use itr.remove() method
            }
        }*/

        customerService.getCustomersList().removeIf(customer -> customer.getUsername().equals(theCustomer.getUsername()));
        customerService.getCustomersList().add(theCustomer);

        System.out.println("A PUT HTTP request was made: http://localhost:8080/api/customer and customer is updated: " +
                "\nusername: " + theCustomer.getUsername() +
                "\nname: " + theCustomer.getName() +
                "\naddress: " + theCustomer.getAddress() + "\n");

        return theCustomer;

    }

    @DeleteMapping("/{userName}")
    public Customer deleteCustomer(@PathVariable String userName) {

        System.out.println("A DELETE HTTP request was made: http://localhost:8080/api/customer/" + userName + "\n");
        Customer tempCustomer = customerService.findByUsername(customerService.getCustomersList(), userName);;
        customerService.getCustomersList().removeIf(customer -> customer.getUsername().equals(userName));
        return tempCustomer;

    }





}
