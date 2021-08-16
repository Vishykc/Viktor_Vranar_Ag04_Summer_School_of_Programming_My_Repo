package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {

    @Autowired
    CustomerService customerService;

    @Autowired
    ConversionService conversionService;

    @GetMapping("/{userName}")
    public Customer getCustomer(@PathVariable String userName) {

        System.out.println(">> A GET HTTP request was made: /api/customer/" + userName);
        return customerService.findByUsername(customerService.getCustomersList(), userName);

    }

    @PostMapping
    public ResponseEntity<String> setCustomer(@RequestBody Customer customer) {

        System.out.println(">> A POST HTTP request was made: /api/customer and customer is added: " +
                "\nusername: " + customer.getUsername() +
                "\nname: " + customer.getName() +
                "\naddress: " + customer.getAddress());

        customerService.addCustomer(customer);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {

        customerService.updateCustomer(customer);

        System.out.println(">> A PUT HTTP request was made: /api/customer and customer is updated: " +
                "\nusername: " + customer.getUsername() +
                "\nname: " + customer.getName() +
                "\naddress: " + customer.getAddress());

        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<String> deleteCustomerByUsername(@PathVariable String username) {

        System.out.println(">> A DELETE HTTP request was made: /api/customer/" + username);

        customerService.deleteCustomerByUsername(username);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}