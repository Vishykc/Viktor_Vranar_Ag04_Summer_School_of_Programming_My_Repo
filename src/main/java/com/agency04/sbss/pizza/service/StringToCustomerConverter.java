package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.Customer;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component("myStringToCustomerConverter")
public class StringToCustomerConverter implements Converter<String, Customer> {

    @Override
    public Customer convert(String source) {
        String[] data = source.split(",");

        return new Customer(data[0], data[1], data[2]);
    }
}



