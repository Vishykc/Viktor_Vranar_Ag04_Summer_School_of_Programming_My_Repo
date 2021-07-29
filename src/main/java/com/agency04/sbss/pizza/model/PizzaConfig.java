package com.agency04.sbss.pizza.model;

import com.agency04.sbss.pizza.service.PizzeriaService;
import com.agency04.sbss.pizza.service.SecondPizzeriaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.agency04.sbss.pizza")
public class PizzaConfig {

    @Bean
    @Primary
    public PizzeriaService mySecondPizzeria() {

        return new SecondPizzeriaService();
    }
}
