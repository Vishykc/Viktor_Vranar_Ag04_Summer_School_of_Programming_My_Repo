package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.DeliveryOrderForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryRestController {

    @Autowired
    private PizzaDeliveryService thePizzaDeliveryService;

    @PostMapping("/order")
    public DeliveryOrderForm orderPizza(@RequestBody DeliveryOrderForm deliveryOrderForm) {
        thePizzaDeliveryService.getCurrentOrders().add(deliveryOrderForm);
        System.out.println("A delivery form has been added!");
        return deliveryOrderForm;
    }

    @GetMapping("/list")
    public Collection<DeliveryOrderForm> getCurrentOrders() {
        return thePizzaDeliveryService.getCurrentOrders();
    }










}
