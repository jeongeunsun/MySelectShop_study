package com.sparta.myselectshop.exception;

public class ProductNotFoundException extends RuntimeException{
    // Ctrl + O
    public ProductNotFoundException(String message) {
        super(message);
    }
}
