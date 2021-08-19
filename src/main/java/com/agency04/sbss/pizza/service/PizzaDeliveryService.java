package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.exception.CustomerNotFoundException;
import com.agency04.sbss.pizza.exception.PizzaNotFoundException;
import com.agency04.sbss.pizza.exception.QuantityNotValidException;
import com.agency04.sbss.pizza.exception.SizeNotFoundException;
import com.agency04.sbss.pizza.model.DeliveryOrder;
import com.agency04.sbss.pizza.model.DeliveryOrderForm;
import com.agency04.sbss.pizza.model.PizzaInt;
import com.agency04.sbss.pizza.model.PizzaOrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;

@Service
public class PizzaDeliveryService {

    @Autowired
    @Qualifier("myFirstPizzeria")
    private PizzeriaService firstPizzeriaService;

    @Autowired
    private PizzeriaService secondPizzeriaService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ConversionService conversionService;

    private Collection<DeliveryOrder> currentOrders;

    public PizzaDeliveryService(){ }

    public PizzeriaService getFirstPizzeriaService() {
        return firstPizzeriaService;
    }

    public PizzeriaService getSecondPizzeriaService() {
        return secondPizzeriaService;
    }

    public Collection<DeliveryOrder> getCurrentOrders() {
        return currentOrders;
    }

    public void setCurrentOrders(Collection<DeliveryOrder> currentOrders) {
        this.currentOrders = currentOrders;
    }

    public Collection<PizzaInt> getMenuFromFirstPizzeria() {
        return getFirstPizzeriaService().getMenu();
    }

    public void addOrder(DeliveryOrder deliveryOrder) {
        getCurrentOrders().add(deliveryOrder);
        System.out.println("A delivery order has been added to PizzaDeliveryService!\n");
    }

    public void validateForm(DeliveryOrderForm deliveryOrderForm) {

        // Validate if customer is valid
        String tempCustomerUsername = deliveryOrderForm.getCustomerUsername();
        if(customerService.findByUsername(customerService.getCustomersList(), tempCustomerUsername) == null) {
            throw new CustomerNotFoundException("Customer not found - " + tempCustomerUsername);
        }

        // Validate the pizza order
        int sizeOfOrderDetails = deliveryOrderForm.getOrderDetails().size();
        ArrayList<PizzaOrderItem> orderDetails = (ArrayList<PizzaOrderItem>) deliveryOrderForm.getOrderDetails();

        for(int i = 0; i < sizeOfOrderDetails; i++) {

            // Validate pizza names from the menu
            String tempPizza = orderDetails.get(i).getPizza();
           if(firstPizzeriaService.findPizzaByName(firstPizzeriaService.getMenu(), tempPizza) == null) {
               throw new PizzaNotFoundException("Error! Pizza not found on the menu - " + tempPizza);
           }

           // Validate pizza sizes
            String tempSize = orderDetails.get(i).getSize();
            if (!(tempSize.equals("S")) && !(tempSize.equals("M")) && !(tempSize.equals("L"))) {
                throw new SizeNotFoundException("Error! Size not found - " + tempSize);
            }

            // Validate pizza quantity
            int tempQuantity = conversionService.convert(orderDetails.get(i).getQuantity(), Integer.class);
            if (tempQuantity <= 0) {
                throw new QuantityNotValidException("Error! Quantity is negative or zero - " + tempQuantity);
            }
        }
    }

    @PostConstruct
    public void doMyStartupStuff() {
        currentOrders = new ArrayList<>();
    }
}