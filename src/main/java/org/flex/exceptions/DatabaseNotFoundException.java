package org.flex.exceptions;

public class DatabaseNotFoundException extends RuntimeException{

    public DatabaseNotFoundException(String message) {
        super(message);
    }

    public DatabaseNotFoundException() {
    }

}
