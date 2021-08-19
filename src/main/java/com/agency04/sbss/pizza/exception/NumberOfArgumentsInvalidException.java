package com.agency04.sbss.pizza.exception;

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