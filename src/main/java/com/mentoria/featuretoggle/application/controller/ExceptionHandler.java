package com.mentoria.featuretoggle.application.controller;

import com.mentoria.featuretoggle.infrastructure.exception.UserException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
class ErrorHandler {

    @ExceptionHandler(UserException.class)
    public ResponseEntity<Object> userNotFoundException(UserException e) {
        return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
    }
}
