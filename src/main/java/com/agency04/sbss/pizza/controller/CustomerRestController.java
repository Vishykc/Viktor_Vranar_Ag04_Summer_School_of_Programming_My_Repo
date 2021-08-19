package com.agency04.sbss.pizza.controller;

import com.agency04.sbss.pizza.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {

/*
    @Autowired
    CustomerRepository customerRepository;*/

    @Autowired
    CustomerService customerService;

    @Autowired
    ConversionService conversionService;

   /* @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }*/

  /*  @Autowired
    public CustomerRestController(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }*/



    /*@GetMapping("/{userName}")
    public Customer getCustomer(@PathVariable String userName) {


        System.out.println(">> A GET HTTP request was made: /api/customer/" + userName);
        return customerService.findByUsername(customerService.getCustomersList(), userName);

    }*/

  /*  @PostMapping
    public ResponseEntity<String> setCustomer(@RequestBody Customer customer) {

        System.out.println(">> A POST HTTP request was made: /api/customer and customer is added: " +
                "\nusername: " + customer.getUsername() +
                "\nfirst name: " + customer.getCustomerDetails().getFirstName() +
                "\nlast name: " + customer.getCustomerDetails().getLastName() +
                "\nphone: " + customer.getCustomerDetails().getPhone());

        customerRepository.save(customer);

        //customerService.addCustomer(customer);

        return new ResponseEntity<>(HttpStatus.CREATED);*/
    }

    /*@PutMapping
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {

        customerService.updateCustomer(customer);

        System.out.println(">> A PUT HTTP request was made: /api/customer and customer is updated: " +
                "\nusername: " + customer.getUsername() +
                "\nfirst name: " + customer.getCustomerDetails().getFirstName() +
                "\nlast name: " + customer.getCustomerDetails().getLastName() +
                "\nphone: " + customer.getCustomerDetails().getPhone());

        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<String> deleteCustomerByUsername(@PathVariable String username) {

        System.out.println(">> A DELETE HTTP request was made: /api/customer/" + username);

        customerService.deleteCustomerByUsername(username);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }*/
//}