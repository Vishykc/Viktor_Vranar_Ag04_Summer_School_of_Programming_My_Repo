package com.agency04.sbss.pizza.service;

public class NumberOfArgumentsInvalidException extends RuntimeException {

    public  NumberOfArgumentsInvalidException(String message) {
        super(message);
    }

    public  NumberOfArgumentsInvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    public  NumberOfArgumentsInvalidException(Throwable cause) {
        super(cause);
    }
}