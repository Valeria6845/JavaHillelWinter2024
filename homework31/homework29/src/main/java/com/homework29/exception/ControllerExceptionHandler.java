package com.homework29.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(value = {
            Exception.class})
    public ResponseEntity<?> handleInvalidTopUpTypeException(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(value = OrderNotFoundException.class)
    public ResponseEntity<?> handleOrderNotFoundException(Exception ex) {
        return new ResponseEntity<>(String.format("Can't find an order with id %s", ex.getMessage()), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(value = ProductNotFoundException.class)
    public ResponseEntity<?> handleProductNotFoundException(Exception ex) {
        return new ResponseEntity<>(String.format("Can't find a product with id %s", ex.getMessage()), HttpStatus.NOT_FOUND);
    }
}