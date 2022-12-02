package com.mentoria.featureToggle.application.controller;

import com.mentoria.featureToggle.domain.model.ResponseMessage;
import com.mentoria.featureToggle.infrastructure.exception.UserException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
class ErrorHandler {

    @ExceptionHandler(UserException.class)
    public ResponseEntity createUserException(UserException e) {
        return new ResponseEntity(ResponseMessage.builder().message(e.getMessage()).build(),HttpStatus.BAD_REQUEST);
    }
}
