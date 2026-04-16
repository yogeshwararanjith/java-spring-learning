package com.ranjith.productservice.Controller;

import java.time.Instant;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ranjith.productservice.exception.ApiError;
import com.ranjith.productservice.exception.ProductNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ApiError> handleProductNotFound(ProductNotFoundException ex, HttpServletRequest request){
        ApiError error = new ApiError(
            Instant.now(), 
            HttpStatus.NOT_FOUND.value(),
             ex.getMessage(), 
            request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    // when user sends an invalid request or like empty for not blank feilds
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> handleException(MethodArgumentNotValidException ex, HttpServletRequest request){
        String message = ex.getBindingResult()
        .getFieldErrors()
        .stream()
        .map(FieldError::getDefaultMessage)
        .collect(Collectors.joining(", "));

        ApiError error = new ApiError(
            Instant.now(),
             HttpStatus.BAD_REQUEST.value(), 
             message, 
            request.getRequestURI()
        );

        return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(error);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleGeneric(Exception ex, HttpServletRequest request){

        ApiError error = new ApiError(Instant.now(), 
        HttpStatus.INTERNAL_SERVER_ERROR.value(), 
        "Unexpected server error", request.getRequestURI());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(error);
    }
    

}
