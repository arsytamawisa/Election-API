package com.example.demo.controller.exception;

import org.springframework.http.HttpStatus;

public class EntityNotFoundException extends ApplicationException {

    public EntityNotFoundException() {
        super(HttpStatus.NOT_FOUND, "error." + HttpStatus.NOT_FOUND.value() + ".entity");
    }

    public EntityNotFoundException(String entity) {
        super(HttpStatus.NOT_FOUND, "error." + HttpStatus.NOT_FOUND.value() + ".entity");
    }
}
