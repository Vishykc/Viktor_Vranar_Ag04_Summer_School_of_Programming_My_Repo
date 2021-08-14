package com.agency04.sbss.pizza.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<DeliveryErrorResponse> handleException(CustomerNotFoundException exc) {

        return new ResponseEntity<>(new DeliveryErrorResponse(HttpStatus.NOT_FOUND.value(), exc.getMessage(), System.currentTimeMillis()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<DeliveryErrorResponse> handleException(PizzaNotFoundException exc) {

        return new ResponseEntity<>(new DeliveryErrorResponse(HttpStatus.NOT_FOUND.value(), exc.getMessage(), System.currentTimeMillis()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<DeliveryErrorResponse> handleException(SizeNotFoundException exc) {

        return new ResponseEntity<>(new DeliveryErrorResponse(HttpStatus.NOT_FOUND.value(), exc.getMessage(), System.currentTimeMillis()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<DeliveryErrorResponse> handleException(QuantityNotValidException exc) {

        return new ResponseEntity<>(new DeliveryErrorResponse(HttpStatus.BAD_REQUEST.value(), exc.getMessage(), System.currentTimeMillis()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<DeliveryErrorResponse> handleException(Exception exc) {

        return new ResponseEntity<>(new DeliveryErrorResponse(HttpStatus.BAD_REQUEST.value(), exc.getMessage(), System.currentTimeMillis()), HttpStatus.BAD_REQUEST);
    }

}
