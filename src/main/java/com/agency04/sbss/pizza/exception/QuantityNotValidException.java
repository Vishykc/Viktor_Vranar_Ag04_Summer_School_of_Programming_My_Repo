package com.agency04.sbss.pizza.exception;

public class QuantityNotValidException extends RuntimeException {

    public QuantityNotValidException(String message) {
        super(message);
    }

    public QuantityNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuantityNotValidException(Throwable cause) {
        super(cause);
    }
}