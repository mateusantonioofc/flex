package org.rokuno.exceptions;

public class DatabaseAlreadyExistException extends RuntimeException{

    public DatabaseAlreadyExistException() {
    }

    public DatabaseAlreadyExistException(String message) {
        super(message);
    }
    
}
