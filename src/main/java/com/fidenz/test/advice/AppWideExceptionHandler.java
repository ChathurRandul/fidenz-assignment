package com.fidenz.test.advice;

import com.fidenz.test.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.EntityNotFoundException;

public class AppWideExceptionHandler {

    @ExceptionHandler({NotFoundException.class, EntityNotFoundException.class})
    public ResponseEntity handleNotFoundException(Exception e) {
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
