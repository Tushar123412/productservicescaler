package com.project.project.controlleradvice;

import com.project.project.dtos.ExceptionDto;
import com.project.project.dtos.ProductDto;
import com.project.project.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Void> handleRuntimeException(RuntimeException ex){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleProductNotFoundException(ProductNotFoundException ex){
        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMessage(ex.getMessage());
        exceptionDto.setStatusCode(HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(exceptionDto, HttpStatus.NOT_FOUND);
    }
}
