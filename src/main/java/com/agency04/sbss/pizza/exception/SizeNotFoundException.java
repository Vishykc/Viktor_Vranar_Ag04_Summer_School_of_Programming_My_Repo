package com.agency04.sbss.pizza.exception;

public class SizeNotFoundException extends RuntimeException {

    public SizeNotFoundException(String message) {
        super(message);
    }

    public SizeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SizeNotFoundException(Throwable cause) {
        super(cause);
    }
}