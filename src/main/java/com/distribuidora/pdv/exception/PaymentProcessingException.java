package com.distribuidora.pdv.exception;

public class PaymentProcessingException extends RuntimeException {
    public PaymentProcessingException(String message) {
        super(message);
    }
}
