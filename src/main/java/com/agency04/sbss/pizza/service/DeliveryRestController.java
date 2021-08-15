package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.DeliveryOrder;
import org.springframework.beans.factory.annotation.Autowired;
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
    private CustomerService customerService;

    @Autowired
    StringToDeliveryOrderFormConverter stringToDeliveryOrderFormConverter;

    @PostMapping("/order")
    public ResponseEntity<String> orderPizza(@RequestBody String deliveryOrderString) {

        DeliveryOrder deliveryOrder = stringToDeliveryOrderFormConverter.convert(deliveryOrderString);
        pizzaDeliveryService.addOrder(deliveryOrder);

        return new ResponseEntity<>("A delivery order has successfully been posted!", HttpStatus.CREATED);
    }


    @GetMapping("/list")
    public Collection<DeliveryOrder> getCurrentOrders() {
        return pizzaDeliveryService.getCurrentOrders();
    }
}