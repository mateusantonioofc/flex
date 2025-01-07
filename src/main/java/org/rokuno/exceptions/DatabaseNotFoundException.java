package org.rokuno.exceptions;

public class DatabaseNotFoundException extends RuntimeException{

    public DatabaseNotFoundException(String message) {
        super(message);
    }

}
