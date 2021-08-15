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

    @GetMapping("/{username}")
    public Customer getCustomer(@PathVariable String username) {

        System.out.println("A GET HTTP request was made: http://localhost:8080/api/customer/" + username + "\n");
        return customerService.getCustomerByUsername(username);

    }

    @PostMapping
    public ResponseEntity<String> setCustomer(@RequestBody String customerString) {

        Customer customer = conversionService.convert(customerString, Customer.class);

        System.out.println("A POST HTTP request was made: http://localhost:8080/api/customer and customer is added: " +
                "\nusername: " + customer.getUsername() +
                "\nname: " + customer.getName() +
                "\naddress: " + customer.getAddress() + "\n");

        customerService.addCustomer(customer);

        return new ResponseEntity<>("A customer was successfully added!", HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<String> updateCustomer(@RequestBody String customerString) {

        Customer customer = conversionService.convert(customerString, Customer.class);

        customerService.updateCustomer(customer);

        System.out.println("A PUT HTTP request was made: http://localhost:8080/api/customer and customer is updated: " +
                "\nusername: " + customer.getUsername() +
                "\nname: " + customer.getName() +
                "\naddress: " + customer.getAddress() + "\n");

        return new ResponseEntity<>("A customer was successfully updated!", HttpStatus.OK);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<String> deleteCustomerByUsername(@PathVariable String username) {

        System.out.println("A DELETE HTTP request was made: http://localhost:8080/api/customer/" + username + "\n");

        customerService.deleteCustomerByUsername(username);

        return new ResponseEntity<>("A customer was successfully deleted!", HttpStatus.OK);
    }
}