package com.agency04.sbss.pizza.controller;

import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.model.CustomerDetails;
import com.agency04.sbss.pizza.model.CustomerForm;
import com.agency04.sbss.pizza.repository.CustomerDetailsRepository;
import com.agency04.sbss.pizza.repository.CustomerRepository;
import com.agency04.sbss.pizza.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {

    @Autowired
    CustomerDetailsRepository customerDetailsRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerService customerService;

    @Autowired
    ConversionService conversionService;

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable String customerId){
        /*Long id = conversionService.convert(customerId, Long.class);
        Optional<Customer> foundCustomer = customerRepository.findById(id);

        if(foundCustomer.isPresent())*/


        Long id = conversionService.convert(customerId, Long.class);
        return new ResponseEntity<>(customerRepository.findById(id).orElse(null), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody CustomerForm customerForm){

        CustomerDetails customerDetails = customerForm.getCustomerDetails();
        customerDetailsRepository.save(customerDetails);


        Customer customer = customerForm.getCustomer();
        customer.setCustomerDetails(customerForm.getCustomerDetails());
        customerRepository.save(customer);

        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody CustomerForm customerForm) {

       Optional<Customer> optionalCustomer = customerRepository.findById(id);

       if(optionalCustomer.isPresent()) {
           Customer oldCustomer = optionalCustomer.get();
           CustomerDetails oldCustomerDetails = optionalCustomer.get().getCustomerDetails();

           Customer newCustomer = customerForm.getCustomer();
           CustomerDetails newCustomerDetails = customerForm.getCustomerDetails();

           oldCustomer.setUsername(newCustomer.getUsername());
           oldCustomer.setCustomerDetails(newCustomerDetails);
           customerRepository.save(oldCustomer);

           return new ResponseEntity<>(oldCustomer, HttpStatus.OK);

       }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id) {
        Long theId = conversionService.convert(id, Long.class);

        customerRepository.deleteById(theId);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



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