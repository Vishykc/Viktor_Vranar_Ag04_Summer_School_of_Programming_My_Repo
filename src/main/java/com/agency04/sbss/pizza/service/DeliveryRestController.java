package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.DeliveryOrderForm;
import com.agency04.sbss.pizza.model.PizzaSizeQuantity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryRestController {
    private String theCustomer;
    private String thePizza;
    private Collection<PizzaSizeQuantity> thePizzaOrderDetails;
    private Collection<String> thePizzaOrderDetailsNames;
    private Collection<String> thePizzaOrderDetailsSizes;
    private Collection<Integer> thePizzaOrderDetailsQuantities;

    @Autowired
    private PizzaDeliveryService thePizzaDeliveryService;

    @Autowired
    private CustomerService theCustomerService;

    @PostMapping("/order")
    public DeliveryOrderForm orderPizza(@RequestBody DeliveryOrderForm deliveryOrderForm) {
        theCustomer = deliveryOrderForm.getDelCustomer();

        if(theCustomerService.findByUsername(theCustomerService.getCustomersList(), theCustomer) == null) {

            throw new CustomerNotFoundException("Customer not found - " + theCustomer);
        }
         thePizzaOrderDetails = new ArrayList<>();
         thePizzaOrderDetails = deliveryOrderForm.getDelPizzaOrderDetails();

        thePizzaOrderDetailsNames = new ArrayList<>();

         for(int i = 0; i < thePizzaOrderDetails.size(); i++) {
             thePizzaOrderDetailsNames.add(((ArrayList<PizzaSizeQuantity>) thePizzaOrderDetails).get(i).getPizza());
         }

         for(String name : thePizzaOrderDetailsNames) {
             if(thePizzaDeliveryService
                     .getFirstPizzeriaService()
                     .findPizzaByName(thePizzaDeliveryService.getFirstPizzeriaService().getMenu(), name) == null) {

                 throw new PizzaNotFoundException("Pizza not found - " + name);
             }
         }

        thePizzaOrderDetailsQuantities = new ArrayList<>();

        for(int i = 0; i < thePizzaOrderDetails.size(); i++) {
            thePizzaOrderDetailsQuantities.add(((ArrayList<PizzaSizeQuantity>) thePizzaOrderDetails).get(i).getQuantity());
        }

        for(Integer quantity : thePizzaOrderDetailsQuantities) {
            if(quantity <= 0) {
                throw new QuantityNotValidException("Quantity is negative or zero - " + quantity);
            }
        }


        thePizzaOrderDetailsQuantities = new ArrayList<>();

        for(int i = 0; i < thePizzaOrderDetails.size(); i++) {
            thePizzaOrderDetailsQuantities.add(((ArrayList<PizzaSizeQuantity>) thePizzaOrderDetails).get(i).getQuantity());
        }

        for(String size : thePizzaOrderDetailsSizes) {
            if(size != "S" || size != "M" || size != "L") {
                throw new SizeNotFoundException("Size not found - " + size);
            }
        }




        thePizzaDeliveryService.getCurrentOrders().add(deliveryOrderForm);
        System.out.println("A delivery form has been added to PizzaDeliveryService!");
        return deliveryOrderForm;
    }

    @GetMapping("/list")
    public Collection<DeliveryOrderForm> getCurrentOrders() {
        return thePizzaDeliveryService.getCurrentOrders();
    }










}
