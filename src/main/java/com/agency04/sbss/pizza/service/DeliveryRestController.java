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

    @Autowired
    private PizzaDeliveryService pizzaDeliveryService;

    @Autowired
    private CustomerService customerService;

    @PostMapping("/order")
    public ResponseEntity<String> orderPizza(@RequestBody DeliveryOrderForm deliveryOrderForm) {

        //Checking if deliveryOrderForm is valid and throw errors if not

        String customer = deliveryOrderForm.getDelCustomer();
        customerService.getCustomerByUsername(customer);

        Collection<PizzaSizeQuantity> pizzaOrderDetails;
        pizzaOrderDetails = deliveryOrderForm.getDelPizzaOrderDetails();

        Collection<String> pizzaOrderDetailsNames = new ArrayList<>();

         for(int i = 0; i < pizzaOrderDetails.size(); i++) {
             pizzaOrderDetailsNames.add(((ArrayList<PizzaSizeQuantity>) pizzaOrderDetails).get(i).getPizza());
         }

         for(String name : pizzaOrderDetailsNames) {
             if(pizzaDeliveryService
                     .getFirstPizzeriaService()
                     .findPizzaByName(pizzaDeliveryService.getFirstPizzeriaService().getMenu(), name) == null) {

                 throw new PizzaNotFoundException("Pizza not found - " + name);
             }
         }

        Collection<String> pizzaOrderDetailsSizes = new ArrayList<>();

        for(int i = 0; i < pizzaOrderDetails.size(); i++) {
            pizzaOrderDetailsSizes.add(((ArrayList<PizzaSizeQuantity>) pizzaOrderDetails).get(i).getSize());
        }

        for(String size : pizzaOrderDetailsSizes) {
            if (!(size.equals("S")) && !(size.equals("M")) && !(size.equals("L"))) {
                throw new SizeNotFoundException("Size not found - " + size);
            }
        }

        Collection<Integer> pizzaOrderDetailsQuantities = new ArrayList<>();

        for(int i = 0; i < pizzaOrderDetails.size(); i++) {
            pizzaOrderDetailsQuantities.add(((ArrayList<PizzaSizeQuantity>) pizzaOrderDetails).get(i).getQuantity());
        }

        for(Integer quantity : pizzaOrderDetailsQuantities) {
            if(quantity <= 0) {
                throw new QuantityNotValidException("Quantity is negative or zero - " + quantity);
            }
        }


        pizzaDeliveryService.addOrder(deliveryOrderForm);

        return new ResponseEntity<>("A delivery order has successfully been posted!", HttpStatus.CREATED);
    }


    @GetMapping("/list")
    public Collection<DeliveryOrderForm> getCurrentOrders() {
        return pizzaDeliveryService.getCurrentOrders();
    }
}