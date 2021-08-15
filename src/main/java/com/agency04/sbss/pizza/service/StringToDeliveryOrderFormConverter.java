package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.model.DeliveryOrder;
import com.agency04.sbss.pizza.model.PizzaSizeQuantity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component("myStringToDeliveryOrderFormConverter")
public class StringToDeliveryOrderFormConverter implements Converter<String, DeliveryOrder> {

    @Autowired
    CustomerService customerService;

    @Autowired
    PizzaDeliveryService pizzaDeliveryService;

    @Autowired
    ConversionService conversionService;

    @Override
    public DeliveryOrder convert(String source) {

        Collection<PizzaSizeQuantity> newPizzaOrderDetails = new ArrayList<>();
        DeliveryOrder tempOrder;

        List<String> data = List.of(source.split(","));
        int dataSize = data.size();

        if (dataSize % 3 != 1) {
            throw new NumberOfArgumentsInvalidException("Number of arguments for delivery order is invalid: " + dataSize);
        }

        String customerString = data.get(0);
        Customer newCustomer = customerService.getCustomerByUsername(customerString);

        for (int i = 1; i < dataSize - 2; i += 3) {
            PizzaSizeQuantity tempPizzaSizeQuantity = new PizzaSizeQuantity();

            String tempPizza = data.get(i);

                if(pizzaDeliveryService
                        .getFirstPizzeriaService()
                        .findPizzaByName(pizzaDeliveryService.getFirstPizzeriaService().getMenu(), tempPizza) == null) {

                    throw new PizzaNotFoundException("Pizza not found - " + tempPizza);
                }

            tempPizzaSizeQuantity.setPizza(tempPizza);

            String tempSize = data.get(i + 1);
            if (!(tempSize.equals("S")) && !(tempSize.equals("M")) && !(tempSize.equals("L"))) {
                throw new SizeNotFoundException("Size not found - " + tempSize);
            }
            tempPizzaSizeQuantity.setSize(tempSize);

            int tempQuantity = conversionService.convert(data.get(i + 2), Integer.class);
            if (tempQuantity <= 0) {
                throw new QuantityNotValidException("Quantity is negative or zero - " + tempQuantity);
            }

            tempPizzaSizeQuantity.setQuantity(tempQuantity);

            newPizzaOrderDetails.add(tempPizzaSizeQuantity);
        }

        tempOrder = new DeliveryOrder(newCustomer, newPizzaOrderDetails);

        return tempOrder;
    }
}


