package com.fidenz.test.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(Throwable cause) {
        super(cause);
    }
}
