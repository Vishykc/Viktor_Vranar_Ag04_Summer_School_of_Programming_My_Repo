package com.agency04.sbss.pizza.controller;

import com.agency04.sbss.pizza.model.DeliveryOrder;
import com.agency04.sbss.pizza.model.DeliveryOrderForm;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryRestController {

    @Autowired
    private PizzaDeliveryService pizzaDeliveryService;

    @Autowired
    ConversionService conversionService;

    @PostMapping("/order")
    public ResponseEntity<String> orderPizza(@RequestBody DeliveryOrderForm deliveryOrderForm) {

        System.out.println(">> A POST HTTP request was made: /api/delivery/order");

        // Validate the form
        pizzaDeliveryService.validateForm(deliveryOrderForm);

        // Convert the form to the order
        DeliveryOrder deliveryOrder = conversionService.convert(deliveryOrderForm, DeliveryOrder.class);

        // Save the order to current orders
        pizzaDeliveryService.addOrder(deliveryOrder);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public Collection<DeliveryOrder> getCurrentOrders() {
        System.out.println(">> A GET HTTP request was made: /api/delivery/list");

        return pizzaDeliveryService.getCurrentOrders();
    }
}